package guiPractice.components;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import guiPractice.Screen;


public abstract class ClickableScreen extends Screen implements MouseListener {

	private ArrayList<Clickable> clickables;
	
	public ClickableScreen(int width, int height) {
		super(width, height);
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		for (Clickable clickable : clickables) {
			if (clickable.isHovered(arg0.getX(), arg0.getY())) {
				clickable.act();		
				break;
			}
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {

	}

	@Override
	public void mouseExited(MouseEvent arg0) {

	}

	@Override
	public void mousePressed(MouseEvent arg0) {

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {

	}

	public void initObjects(List<Visible> viewObjects) {
		initAllObjects(viewObjects);
		for (Visible visible : viewObjects) {
			if (visible instanceof Clickable) {
				clickables.add((Clickable)visible);
			}
		}
		clickables = new ArrayList<Clickable>();
	}
	
	public MouseListener getMouseListener(){
		return this;
	}

	abstract void initAllObjects(List<Visible> clickable);

}
