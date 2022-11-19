package mvc;

import java.util.ArrayList;
import java.util.List;

public class DrawingModel {
	
	private List<Shape> shapes = new ArrayList<>();
	
	public List<Shape> getShapes() {
		return shapes;
	}

	public void add(Shape p) {
		shapes.add(p);
	}
	
	public void remove(Shape p) {
		shapes.remove(p);
		
	}

}
