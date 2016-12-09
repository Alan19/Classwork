package guiPractice.components;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageFilter;

public abstract class Component implements Visible {

//	Fields
	private int x;
	private int y;
	private int w;
	private int h;
	private BufferedImage image;
	
//	Constructor
	public Component(int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		image = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
		update(image.createGraphics());
	}
	
//	Draws the components
	public abstract void update(Graphics2D g);

	@Override
	public BufferedImageFilter getImage() {
		return null;
	}

	@Override
	public int getX() {
		return x;
	}

	@Override
	public int getY() {
		return y;
	}

	@Override
	public int getWidth() {
		return w;
	}

	@Override
	public int getHeight() {
		return h;
	}

	@Override
	public boolean isAnimated() {
		return false;
	}

	@Override
	public void update() {
		update(image.createGraphics());

	}

}
