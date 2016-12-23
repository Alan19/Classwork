package guiPractice.sampleGames;

import java.util.ArrayList;
import java.util.List;

import guiPractice.components.Action;
import guiPractice.components.ClickableScreen;
import guiPractice.components.TextLabel;
import guiPractice.components.Visible;

public class WhackAMoleScreen extends ClickableScreen implements Runnable {

	private ArrayList<MoleInterface> moles;
	private PlayerInterface player;
	private TextLabel label;
	private TextLabel timeLabel;
	private double timeLeft;
	
	public WhackAMoleScreen(int width, int height) {
		super(width, height);
		timeLeft = 60.0;
		Thread testThread = new Thread(this);
		testThread.start();
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		moles = new ArrayList<MoleInterface>();
		player = getAPlayer();
		label = new TextLabel(getWidth()/2-60, getHeight()/2-30, 120, 60, "Ready...");
		timeLabel = new TextLabel(getWidth()/2-60, getHeight()/2-30, 120, 60, "Ready...");
		viewObjects.add(label);
	}


	@Override
	public void run() {
		changeText("Set...");
		changeText("Go!");
		changeText("");
		timeLabel.setText(""+timeLeft);
		while (timeLeft > 0) {
			//frame updates every 100ms
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			timeLeft -= .1;
			timeLabel.setFont(""+(int)(timeLeft*10)/10.0);
			disappearMoles();
			addNewMoles();
		}
	}
	
	private void addNewMoles() {
		//probability of mole appearing depends on time left
		double probability = .2 + .1*(30.0-timeLeft/30);
		if(Math.random() < probability){
			final MoleInterface mole = getAMole();
			mole.setAppreanceTime((int) (500 + Math.random()*2000));
			mole.setAction(new Action() {
				
				@Override
				public void act() {
					player.increaseScore(1);
					
					//Remove mole from viewObjects
					remove(mole);
					//Remove mole from "database"
					moles.remove(mole);
				}
			});
			//add mole to visible
			addObject(mole);
			//add mole to mole list
			moles.add(mole);
		}
	}

	private void disappearMoles() {
		//Each mole has a "clock" that causes it to disappear at 0
		for (int i = 0; i < moles.size(); i++) {
			MoleInterface m = moles.get(i);
			m.setAppreanceTime(m.getAppearanceTime() - 100);
			if(m.getAppearanceTime() <= 0){
				//Remove from viewObjects
				remove(m);
				//Remove it from our mole database
				moles.remove(i);
				i--;
			}
		}
	}

	/**
	 * this is a placeholder because early in the game design process, the players aren't
	 * designed yet, so we use this method later, once we learn how to create a player
	 * @return
	 */
	
	private PlayerInterface getAPlayer(){
		return null;
	}
	
	/**
	 * this is a placeholder because early in the game design process, the enemies aren't
	 * designed yet, so we use this method later, once we learn how to create a enemies
	 * @return
	 */
	private MoleInterface getAMole(){
		
		return new Mole((int) (getWidth()*Math.random())-100, (int)(getHeight()*Math.random()), "resources/sampleImages/Diglett-A.png");
	}

	private void changeText(String s) {
		try {
			Thread.sleep(1000);
			label.setText(s);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
