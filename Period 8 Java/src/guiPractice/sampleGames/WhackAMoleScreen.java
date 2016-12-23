package guiPractice.sampleGames;

import java.util.ArrayList;
import java.util.List;

import guiPractice.components.ClickableScreen;
import guiPractice.components.TextLabel;
import guiPractice.components.Visible;

public class WhackAMoleScreen extends ClickableScreen implements Runnable {

	 private ArrayList<MoleInterface> moles;
	 private PlayerInterface player;
	 private TextLabel label;
	 private TextLabel timeLabel;
	 private double timeLeft;
	 private Thread testThread;
	
	public WhackAMoleScreen(int width, int height) {
		super(width, height);
		timeLeft = 60.0;
		testThread.start();
	}

	@Override
	public void initAllObjects(List<Visible> clickable) {
		moles = new ArrayList<MoleInterface>();
		getAPlayer();
		label = new TextLabel(300, 300, 200, 200, "Ready...");
		
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
