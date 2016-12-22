package guiPractice.sampleGames;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import guiPractice.GUIApplication;

@SuppressWarnings("serial")
public class ClickableGame extends GUIApplication implements MouseListener{

	public static void main(String[] args){
		GUIApplication game = new MouseFollower();
		Thread app = new Thread(game);
		app.start();
	}

	@Override
	protected void initScreen() {
		// TODO Auto-generated method stub

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

}
