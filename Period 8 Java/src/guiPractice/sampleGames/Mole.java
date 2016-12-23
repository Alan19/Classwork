package guiPractice.sampleGames;

import guiPractice.components.ClickableGraphic;

public class Mole extends ClickableGraphic implements MoleInterface {
	
	private int appearanceTime;

	public Mole(int x, int y, String imageLocation) {
		super(x, y, .5, "resources/sampleImages/Drillbur.png");
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int getAppearanceTime() {
		return appearanceTime;
	}

	@Override
	public void setAppreanceTime(int i) {
		this.appearanceTime = i;
	}

}
