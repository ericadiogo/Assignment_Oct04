package assignment_oct04_part1;

public class Circle extends AbstractShape {
	// Step 3: Implement Concrete Classes
	// Create two concrete classes that extend `AbstractShape`. Name them `Circle` and `Rectangle`. For each class:
	// - Implement the constructor(s) to initialize the necessary attributes.
	// - Override the abstract methods `area()` and `perimeter()` to provide specific implementations for each shape.

	public double radius;

	public Circle(String color, double radius) {
		super(color);
		this.color = color;
		this.radius = radius;
	}

	
	@Override
	public String toString() {
		return "Circle [color=" + color + ", radius=" + radius + "]";
	}


	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (Math.PI * Math.pow(radius, 2));
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return (Math.PI * 2 * radius);
	}	
}
