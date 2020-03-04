package com.deadsec.factory;

import com.deadsec.model.Rectangle;
import com.deadsec.model.Shape;
import com.deadsec.model.Square;

public class ShapeFactory {

	public static Shape getShape(String shape) {
		
		if(shape.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}else if(shape.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		}else {
			return null;
		}
	}
}
