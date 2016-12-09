package guiPractice.sampleGames;

import guiPractice.GUIApplication;

@SuppressWarnings("serial")
public class MouseFollower extends GUIApplication {

	private CoordinateScreen coordScreen;
	
	@Override
	protected void initScreen() {
		coordScreen = new CoordinateScreen(getWidth(), getHeight());
		setScreen(coordScreen);
	}

}
