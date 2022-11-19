package mvc;

import java.awt.Color;
import java.awt.event.MouseEvent;

public class DrawingController {
	private DrawingFrame frame;
	private DrawingModel model;
	
	public DrawingController(DrawingModel model, DrawingFrame frame) {
		this.model = model;
		this.frame = frame;
	}

	public void mouseClicked(MouseEvent e) {
		Point p = new Point(e.getX(), e.getY(), Color.RED);
		model.add(p);
		frame.repaint();
	}

}
