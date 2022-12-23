package prototype;

import java.awt.Color;

import mvc.Point;

public class TestPrototype {

	public static void main(String[] args) {
		Point p1 = new Point(10, 10, Color.RED);
		Point p2 = new Point(20, 20, Color.BLUE);
		
		ShallowLine lineOriginal = new ShallowLine(p1, p2, Color.BLACK);
		ShallowLine lineCopy = lineOriginal.clone();
		
		/*System.out.println(lineOriginal);
		System.out.println(lineCopy);*/
		
		/*lineOriginal.getStartPoint().setX(100);
		System.out.println(lineCopy.getStartPoint().getX());*/
		
		DeepLine lineDeepOriginal = new DeepLine(p1, p2, Color.BLACK);
		DeepLine lineDeepCopy = lineDeepOriginal.clone();
		
		lineDeepOriginal.getStartPoint().setX(200);
		System.out.println(lineDeepCopy.getStartPoint().getX());
	}

}
