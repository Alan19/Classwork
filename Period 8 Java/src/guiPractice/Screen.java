package guiPractice;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

public abstract class Screen {
	
	private int width;
	private int height;
	protected BufferedImage image;
	
	public Screen(int width, int height){
		this.width = width;
		this.height = height;
		initImage();
	}

	private void initImage() {
		image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		update();
	}

	public void update() {
		//this is where you draw stuff
		Graphics2D g = image.createGraphics();
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.setColor(Color.black);
//		g.setFont(new Font("Consolas", Font.PLAIN, 20));
//		g.drawString("Hello", 80, 80);
//		g.drawOval(40, 40, 130, 80);
//		g.drawRect(50, 120, 120, 110);
//		g.drawLine(170, 120, 180, 200);
//		for (int i = 0; i < image.getWidth(); i+=4) {
//			g.setColor(new Color(25, (int) (Math.random()*255), 235));
//			g.drawLine(i, 230, i, 234);
//		}
	}
	
	public BufferedImage getImage(){
		return image;
	}
}
