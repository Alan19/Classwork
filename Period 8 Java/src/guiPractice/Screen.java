package guiPractice;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Iterator;

import guiPractice.components.Visible;

@SuppressWarnings("unused")
public abstract class Screen {
	
	private int width;
	private int height;
	private ArrayList<Visible> viewObjects;
	protected BufferedImage image;
	
	public Screen(int width, int height){
		viewObjects = new ArrayList<Visible>();
		this.width = width;
		this.height = height;
		initImage();
		initObjects(viewObjects);
	}

	public abstract void initObjects(ArrayList<Visible> viewObjects);

	private void initImage() {
		image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		update();
	}

	public void update() {
		//this is where you draw stuff
		Graphics2D g = image.createGraphics();
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.setColor(Color.black);
//		Draw all visible components
		for(Visible v:viewObjects){
			g.drawImage(v.getImage(), v.getX(), v.getY(), null);
		}
	}
	
	public BufferedImage getImage(){
		return image;
	}
}
