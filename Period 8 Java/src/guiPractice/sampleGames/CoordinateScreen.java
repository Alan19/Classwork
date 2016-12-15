package guiPractice.sampleGames;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import guiPractice.Screen;
import guiPractice.components.Button;
import guiPractice.components.TextArea;
import guiPractice.components.TextLabel;
import guiPractice.components.Visible;

public class CoordinateScreen extends Screen implements MouseMotionListener{

	private TextLabel label;
	private TextArea paragraph;
	private Button button;
	
	public CoordinateScreen(int width, int height) {
		super(width, height);
//		label = new TextLabel(40, 45, width, 40, "");
	}
	
	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		label = new TextLabel(40, 45, 760, 40, "Sample Text");
//		paragraph = new TextArea(40, 85, 760, 500, "YOLO tilde tofu pour-over, cornhole quinoa banh mi. Kogi selvage authentic, vexillologist viral cray skateboard etsy biodiesel ramps af fixie tbh schlitz vegan. Whatever umami pinterest schlitz. Tousled gentrify next level yuccie, tattooed lumbersexual meditation fixie air plant crucifix mixtape mustache chambray. VHS ethical neutra sustainable crucifix cray, mustache selvage glossier. Roof party slow-carb af helvetica. Pop-up chambray meh swag jean shorts narwhal.");
		button = new Button(100, 300, 100, 50, "Click Me!", new Color(255, 255, 100), null);
		viewObjects.add(label);
//		viewObjects.add(paragraph);
		viewObjects.add(button);
	}

	@Override
	public void mouseDragged(MouseEvent m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent m) {
		label.setText("Mouse at " + m.getX() + ", " + m.getY());
	}

	public MouseMotionListener getMouseMotionListener(){
		return this;
	}
}
