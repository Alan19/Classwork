package guiPractice.sampleGames;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.event.MouseInputListener;

import guiPractice.Screen;
import guiPractice.components.Action;
import guiPractice.components.ClickableGraphic;
import guiPractice.components.Visible;

public class TestScreen extends Screen implements MouseInputListener {

	public ClickableGraphic back;
	public Action action;
	
	public TestScreen(int width, int height) {
		super(width, height);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(back.isHovered(e.getX(), e.getY())){
			back.act();
		}
	}
	
	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		back = new ClickableGraphic(0, 0, .5, "resources/sampleImages/panorama_5.png");
		back.setAction(new Action() {
			
			@Override
			public void act() {
				back.setX(back.getX()+10);
			}
		});
		viewObjects.add(back);
	}
	
	public MouseListener getMouseListener() {
		return this;
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}


}
