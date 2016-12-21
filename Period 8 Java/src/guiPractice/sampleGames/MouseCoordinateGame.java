package guiPractice.sampleGames;

import guiPractice.GUIApplication;


@SuppressWarnings("serial")
public class MouseCoordinateGame extends GUIApplication{

	public static MouseCoordinateGame game;
	public static CoordinateScreen coordScreen;
	public static MyScreen myScreen;
	public static TestScreen testScreen;

	public static void main(String[] args){

		game = new MouseCoordinateGame();

		Thread app = new Thread(game);

		app.start();
	}
	
	@Override
	protected void initScreen() {
//		myScreen = new MyScreen(getWidth(), getHeight());
//		coordScreen = new CoordinateScreen(getWidth(), getHeight());
//		setScreen(coordScreen);
		testScreen = new TestScreen(getWidth(), getHeight());
		setScreen(testScreen);
	}


}
