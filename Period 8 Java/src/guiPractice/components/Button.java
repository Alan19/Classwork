package guiPractice.components;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Button extends TextLabel implements Clickable, MouseMotionListener{
	
	private Color color;
	private Action act;
	
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
		update();
	}


	public Button(int x, int y, int w, int h, String text, Color color, Action act) {
		super(x, y, w, h, text);
		this.color = color;
		this.act = act;
		update();
	}

	@Override
	public void update(Graphics2D g) {
		g.setColor(color);
		g.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
		g.setColor(color);
		g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 15, 15);
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.setColor(Color.black);
		//in case text is too wide, cut off
//		String t = getText();
//		int cutoff = t.length();
//		while (cutoff > 0 && fm.stringWidth(t)/2) {
//			
//		}
		
		if (getText() != null) {
			g.setFont(new Font("Arial", Font.PLAIN, 16));
			g.drawString(getText(), 0, getHeight()/2);			
		}
//		FontMetrics fm = g.getFontMetrics();
//		TextArea()
		
	}

	@Override
	public boolean isHovered(int x, int y) {
		if(inBetween(x, getX(), getX() + getWidth()) && inBetween(y, getY(), getY() + getHeight()))
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
		act.act();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
