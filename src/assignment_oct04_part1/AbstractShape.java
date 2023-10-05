package assignment_oct04_part1;

public abstract class AbstractShape implements Shape {
	
	// Step 2: Create an Abstract Class
	// Create an abstract class named `AbstractShape` that implements the `Shape` interface. 
	// This class should include an instance variable for the color of the shape (a string) 
	// and provide a constructor to initialize it. It should also declare abstract methods 
	// for `area()` and `perimeter()`.
	
	String color;
	
	public AbstractShape(String color) {
		super();
		this.color = color;
	}

	public abstract double area();
	
	public abstract double perimeter();

}
