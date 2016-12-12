package guiPractice.sampleGames;

import java.awt.TextArea;
import java.util.ArrayList;

import guiPractice.Screen;
import guiPractice.components.TextLabel;
import guiPractice.components.Visible;

public class CoordinateScreen extends Screen {

	private TextLabel label;
	public CoordinateScreen(int width, int height) {
		super(width, height);
		label = new TextLabel(40, 45, width, 40, "");
	}
	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		label = new TextLabel(40, 45, 760, 40, "Sample Text");
		paragraph = new TextArea(40, 85, 760, 500, "This is a whole paragraph. Notice how as the paragraph gets to the edge of the page, a new line is created.");
		viewObjects.add(label);
	}

}
