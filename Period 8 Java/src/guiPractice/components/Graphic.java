package guiPractice.components;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;

public class Graphic implements Visible {

	private int x;
	private int y;
	private BufferedImage image;
	private boolean loadedImages;
	
	public Graphic(int x, int y, String imageLocation){
		this.x = x;
		this.y = y;
		loadedImages = false;
		loadImages(imageLocation, 0, 0);
	}
	
	public Graphic(int x, int y, int w, int h, String imageLocation){
		this.x = x;
		this.y = y;
		loadedImages = false;
		loadImages(imageLocation, w, h);
	}
	
	public Graphic(int x, int y, double scale, String imageLocation){
		this.x = x;
		this.y = y;
		loadedImages = false;
		loadImages(imageLocation, 0, 0);
	}
	
	private void loadImages(String imageLocation, int w, int h) {
		try {
			//get the image from file
			ImageIcon icon = new ImageIcon(imageLocation);
			if(w == 0 && h == 0){
				//use original size
				image = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
				Graphics2D g = image.createGraphics();
				g.drawImage(icon.getImage(), 0, 0, null);
			}
			else {
				image = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
				Graphics2D g = image.createGraphics();
				//select coordinates of top left rectangle within image. Then, select width and height to display graphic. Then of the icon you want to display, select x, y coordinates and width height. This can split the image into parts. 
				g.drawImage(icon.getImage(), 0, 0, w, h, 0, 0, icon.getIconWidth(),icon.getIconHeight(), null);
			}
			loadedImages = true;
		} catch (Exception e) {
			//in case file is not found
			e.printStackTrace();
		}
	}

	private void loadImages(String imageLocation, double scale) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BufferedImage getImage() {
		return image;
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
		return image.getWidth();
	}

	@Override
	public int getHeight() {
		return image.getHeight();
	}

	@Override
	public boolean isAnimated() {
		return false;
	}

	@Override
	public void update() {
		//Does nothing, image never changes
	}

}
