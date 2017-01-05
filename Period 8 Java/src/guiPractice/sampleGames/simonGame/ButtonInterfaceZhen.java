package guiPractice.sampleGames.simonGame;

import guiPractice.components.Action;
import guiPractice.components.Clickable;

public interface ButtonInterfaceZhen extends Clickable{
	public void setAction(Action a);

	public void highlight();

	public void dim();
}
