package guiPractice.sampleGames;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import guiPractice.GUIApplication;
import guiPractice.components.Button;


public class MouseCoordinateGame extends GUIApplication implements MouseListener, MouseMotionListener{

	public static MouseCoordinateGame game;
	public static CoordinateScreen coordScreen;
	public static MyScreen moveScreen;

	public static void main(String[] args){

		game = new MouseCoordinateGame(500, 500);

		Thread app = new Thread(game);

		app.start();
	}
	
	public MouseListener getMouseListener(){
		return this;
	}
	
	@Override
	protected void initScreen() {
		// TODO Auto-generated method stub

	}
	@Override
	public void mouseClicked(MouseEvent e) {
		if(Button.isHovered(e.getX(), e.getY()))
			return true;
		else
			return false;
		
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
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
