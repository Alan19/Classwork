package guiPractice.sampleGames.simonGame;

import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import guiPractice.components.Button;
import guiPractice.components.ClickableScreen;
import guiPractice.components.TextLabel;
import guiPractice.components.Visible;

public class SimonScreenZhen extends ClickableScreen implements Runnable {
	
	private TextLabel label;
	private ButtonInterfaceZhen[] buttons;
	private ProgressInterfaceZhen progress;
	private ArrayList<MoveInterfaceZhen> moveList;
	private int roundNumber;
	private boolean acceptingOutput;
	private int sequenceIndex;
	private int lastSelectedButton;

	public SimonScreenZhen(int width, int height) {
		super(width, height);
		Thread app = new Thread(this);
		app.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	@Override
	public void initAllObjects(List<Visible> clickable) {
		addButtons();
		progress = getProgress();
		label = new TextLabel(130,230,300,40,"Let's play Simon!");
		moveList = new ArrayList<MoveInterfaceZhen>();
		//add 2 moves to start
		lastSelectedButton = -1;
		moveList.add(randomMove());
		moveList.add(randomMove());
		roundNumber = 0;
		viewObjects.add(progress);
		viewObjects.add(label);
	}

	private MoveInterfaceZhen randomMove() {
		ButtonInterfaceZhen b;
		int selectedButton = 0;
		while (true) {
			selectedButton = (int) (Math.random()*moveList.size());
			if(selectedButton != lastSelectedButton) break;
		}
		b = buttons[selectedButton];
		return getMove(b);
	}

	private MoveInterfaceZhen getMove(ButtonInterfaceZhen b) {
		// TODO Auto-generated method stub
		return null;
	}

	private ProgressInterfaceZhen getProgress() {
		// Placeholder until partner finishes implementation of ProgressInterface
		return null;
	}

	private void addButtons() {
		// TODO Auto-generated method stub
		
	}

}
