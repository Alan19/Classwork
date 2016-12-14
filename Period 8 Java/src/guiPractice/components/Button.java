package guiPractice.components;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Button extends TextLabel implements Clickable, MouseMotionListener{
	
	private Color color;
	private Action act;

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
		g.setColor(color.black);
		g.drawRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
//		FontMetrics fm = g.getFontMetrics();
//		TextArea()
		
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
//		act;
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
