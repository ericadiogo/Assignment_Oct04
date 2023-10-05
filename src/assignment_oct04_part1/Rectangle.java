package assignment_oct04_part1;

public class Rectangle extends AbstractShape{
	// Step 3: Implement Concrete Classes
	// Create two concrete classes that extend `AbstractShape`. Name them `Circle` and `Rectangle`. For each class:
	// - Implement the constructor(s) to initialize the necessary attributes.
	// - Override the abstract methods `area()` and `perimeter()` to provide specific implementations for each shape.

	public double height, width;

	public Rectangle(String color, double height, double width) {
		super(color);
		this.color = color;
		this.height = height;
		this.width = width;
	}

	
	@Override
	public String toString() {
		return "Rectangle [color=" + color + ", height=" + height + ", width=" + width + "]";
	}


	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (height * width);
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return ((2 * height) + (2 * width));
	}	
}
