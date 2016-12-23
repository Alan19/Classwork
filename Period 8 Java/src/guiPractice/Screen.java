package guiPractice;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Iterator;

import guiPractice.components.Visible;

@SuppressWarnings("unused")
public abstract class Screen {
	
	private int width;
	private int height;
	private ArrayList<Visible> viewObjects;
	protected BufferedImage image;
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public MouseListener getMouseListener;
	public MouseMotionListener getMouseMotionListener;
	
	public Screen(int width, int height){
		viewObjects = new ArrayList<Visible>();
		this.width = width;
		this.height = height;
		initObjects(viewObjects);
		initImage();
	}

	public abstract void initObjects(ArrayList<Visible> viewObjects);

	private void initImage() {
		image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		update();
	}

	public void update() {
		//this is where you draw stuff
		Graphics2D g = image.createGraphics();
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		//make background
		g.setColor(Color.white);
		g.fillRect(0, 0, image.getWidth(), image.getHeight());
		
		g.setColor(Color.black);
//		Draw all visible components
		for(Visible v:viewObjects){
			g.drawImage(v.getImage(), v.getX(), v.getY(), null);
		}
	}
	
	public BufferedImage getImage(){
		return image;
	}

	public MouseListener getMouseListener() {
		return null;
	}

	public MouseMotionListener getMouseMotionListener() {
		return null;
	}
	
	//Remove a visible from the screen
		public void remove(Visible v){
			/**ArrayList notes
			 * While this method is very simple, do not underestimate the trickiness of removing items in an array list. It causes indices to change.
			 * e.g. Suppose you have and ArrayList<int> and you want to remove all values greater than 5
			 *	
			 *	This is BAD:
			 *
			 *	for(int i = 0; i < list.size(); i++){
			 *		if(list.get(i) > 5)
			 *			list.remove(i);
			 *	}
			 *
			 *Suppose you have (4,5,6,7), the first integer to be removed is 6, at index 2. Since it gets removed, 7 moves from index 3 to 2. Your list is now (4,5,7)
			 *After you increment i, i becomes 3. This is out of bounds so 7 never gets removed
			 *Instead, when an object is removed, decrease i to compensate for the change in size
			 *Correct:
			 *
			 *	for(int i = 0; i < list.size(); i++){
			 *		if(list.get(i) > 5){
			 *			list.remove(i);
			 *			i--;
			 *		}
			 *	}
			 */
			//This removes the object that has the same identity as v, not an object that is equal to v
			viewObjects.remove(v);
			
		}
		
		public void moveToFront(Visible v){
			if (viewObjects.contains(v)) {
				viewObjects.remove(v);
				viewObjects.add(v);
			}
		}
		
		public void moveToBack(Visible v){
			if (viewObjects.contains(v)) {
				viewObjects.remove(v);
				viewObjects.add(0, v);
				//moves all objects with index >=n forward by 1, increases size by 1, adds object to index n
			}
		}
		
		public void addObject(Visible v) {
			viewObjects.add(v);
		}
		
}
