package guiPractice.sampleGames;

import guiPractice.GUIApplication;

@SuppressWarnings("serial")
public class WhackAMoleGame extends GUIApplication {

	public WhackAMoleGame() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void initScreen() {
		@SuppressWarnings("unused")
		WhackAMoleScreen wams = new WhackAMoleScreen(getWidth(), getHeight());

	}

	public static void main(String[] args) {
		WhackAMoleGame game = new WhackAMoleGame();
		Thread app = new Thread(game);
		app.start();
	}

}
