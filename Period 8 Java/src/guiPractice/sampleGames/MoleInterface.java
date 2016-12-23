package guiPractice.sampleGames;

import guiPractice.components.Action;
import guiPractice.components.Clickable;

public interface MoleInterface extends Clickable {

	int getAppearanceTime();

	void setAppreanceTime(int i);

	void setAction(Action action);
	
}
