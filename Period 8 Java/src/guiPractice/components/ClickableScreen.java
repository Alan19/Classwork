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
		for (int i = 0; i < clickables.size(); i++) {
			Clickable clickable = clickables.get(i);
			if (clickable.isHovered(arg0.getX(), arg0.getY())) {
				clickable.act();		
				break;
			}
		}
	}
	
	public void addObject(Visible v) {
		super.addObject(v);
		if(v instanceof Clickable)
			clickables.add((Clickable) v);
	}
	
	public void remove(Visible v) {
		super.remove(v);
		clickables.remove(v);
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

	public void initObjects(ArrayList<Visible> viewObjects) {
		initAllObjects(viewObjects);
		clickables = new ArrayList<Clickable>();
		for (Visible visible : viewObjects) {
			if (visible instanceof Clickable) {
				clickables.add((Clickable)visible);
			}
		}
	}
	
	public MouseListener getMouseListener(){
		return this;
	}

	public abstract void initAllObjects(ArrayList<Visible> clickable);

}
