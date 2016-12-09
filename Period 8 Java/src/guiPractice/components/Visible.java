package guiPractice.components;

import java.awt.image.BufferedImageFilter;

public interface Visible {

	public BufferedImageFilter getImage();
	public int getX();
	public int getY();
	public int getWidth();
	public int getHeight();
	public boolean isAnimated();
	public void update();
	
}
