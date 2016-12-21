package guiPractice.components;

import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;

public class ClickableGraphic implements Visible, Clickable, MouseListener{

	private int x;
	private int y;
	private BufferedImage image;
	private boolean loadedImages;
	private Action action;
	
	public ClickableGraphic(int x, int y, String imageLocation, Action action){
		this.x = x;
		this.y = y;
		loadedImages = false;
		loadImages(imageLocation, 0, 0);
	}
	
	public ClickableGraphic(int x, int y, int w, int h, String imageLocation){
		this.x = x;
		this.y = y;
		loadedImages = false;
		loadImages(imageLocation, w, h);
	}
	
	public ClickableGraphic(int x, int y, double scale, String imageLocation, Action action) {
		this.x = x;
		this.y = y;
		loadedImages = false;
		loadImages(imageLocation, scale);
		this.action = action;
	}

	@Override
	public boolean isHovered(int x, int y) {
		if(inBetween(x, getX(), getX() + getWidth()) && inBetween(x, getY(), getY() + getHeight()))
			return true;
		else 
			return false;
	}

	public boolean inBetween(int x, int y, int z){
		if(x > y && x < z)
			return true;
		else 
			return false;
	}

	@Override
	public void act() {
		action.act();
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
		try {
			//get the image from file
			ImageIcon icon = new ImageIcon(imageLocation);
			int newWidth = (int)(icon.getIconWidth() * scale);
			int newHeight = (int)(icon.getIconHeight() * scale);
			image = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_ARGB);
			Graphics2D g = image.createGraphics();
			g.drawImage(icon.getImage(), 0, 0, newWidth, newHeight, 0, 0, icon.getIconWidth(), icon.getIconHeight(), null);
			loadedImages = true;
		} catch (Exception e) {
			//in case file is not found
			e.printStackTrace();
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BufferedImage getImage() {
		// TODO Auto-generated method stub
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
		return image.getWidth();
	}

	@Override
	public int getHeight() {
		return image.getHeight();
	}

	@Override
	public boolean isAnimated() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
}
