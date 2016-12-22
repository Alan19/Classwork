package guiPractice.sampleGames;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import guiPractice.GUIApplication;

@SuppressWarnings("serial")
public class MouseFollower extends GUIApplication implements MouseListener{

	public static void main(String[] args){
		GUIApplication game = new MouseFollower();
		Thread app = new Thread(game);
		app.start();
	}
	
	private MyScreen myScreen;
	
	@Override
	protected void initScreen() {
		myScreen = new MyScreen(getWidth(), getHeight());
		setScreen(myScreen);
	}
	
	

	@SuppressWarnings("unused")
	@Override
	public void mouseClicked(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
	}
	
	public MouseListener getMouseListener(){
		return this;
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
