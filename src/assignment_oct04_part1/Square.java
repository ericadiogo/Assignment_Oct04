package assignment_oct04_part1;

public class Square extends AbstractShape{

	// Step 5 : 
	// Implement additional shape classes such as `Triangle` or `Square` and add
	// them to the polymorphic array in the `Main` class. Demonstrate the flexibility
	// and extensibility of your design.
	
	public double side;

	public Square(String color, double side) {
		super(color);
		this.side = side;
	}

	@Override
	public String toString() {
		return "Square [color=" + color + ", side=" + side + "]";
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (Math.pow(side, 2));
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return (4 * side);
	}
}
