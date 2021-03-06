package guiPractice.sampleGames.simonGame;

import java.awt.Color;

import guiPractice.components.Action;
import guiPractice.components.Clickable;

public interface ButtonInterfaceZhen extends Clickable{
	public void setAction(Action a);

	public void highlight();

	public void dim();

	public void setX(int i);

	public void setColor(Color color);

	public void setY(int i);
}
