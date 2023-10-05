package assignment_oct04_part1;

public class Triangle extends AbstractShape{
	
	// Step 5 : 
	// Implement additional shape classes such as `Triangle` or `Square` and add 
	// them to the polymorphic array in the `Main` class. Demonstrate the flexibility
	// and extensibility of your design.
	
	public double base, height;

	public Triangle(String color, double base, double height) {
		super(color);
		this.color = color;
		this.base = base;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Triangle [color=" + color + "base=" + base + ", height=" + height + "]";
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (base * height)/2;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		double side = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
		return base + height + side; //only if it is a triangle rectangle
	}

}
