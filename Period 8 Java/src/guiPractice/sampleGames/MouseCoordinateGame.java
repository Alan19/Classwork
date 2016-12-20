package guiPractice.sampleGames;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import guiPractice.GUIApplication;
import guiPractice.components.Button;


public class MouseCoordinateGame extends GUIApplication{

	public static MouseCoordinateGame game;
	public static CoordinateScreen coordScreen;
	public static MyScreen moveScreen;

	public static void main(String[] args){

		game = new MouseCoordinateGame();

		Thread app = new Thread(game);

		app.start();
	}
	
	@Override
	protected void initScreen() {
		// TODO Auto-generated method stub

	}


}
