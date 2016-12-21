package guiPractice.components;

public class ClickableGraphic extends Graphic implements Clickable{

	private Action action;
	
	public ClickableGraphic(int x, int y, String imageLocation){
		super(x, y, imageLocation);
	}
	
	public ClickableGraphic(int x, int y, int w, int h, String imageLocation){
		super(x, y, w, h, imageLocation);
	}
	
	public ClickableGraphic(int x, int y, double scale, String imageLocation) {
		super(x, y, scale, imageLocation);
	}
	
	public void setAction(Action action) {
		this.action = action;
	}

	@Override
	public boolean isHovered(int x, int y) {
		return inBetween(x, getX(), getX() + getWidth()) && inBetween(x, getY(), getY() + getHeight());
	}

	public boolean inBetween(int x, int y, int z){
		if(x > y && x < z)
			return true;
		else 
			return false;
	}

	@Override
	public void act() {
		if(action != null)
			action.act();
	}
}
