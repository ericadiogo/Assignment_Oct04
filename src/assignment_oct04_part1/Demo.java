package assignment_oct04_part1;

public class Demo {
	// Step 4: Demonstrate Polymorphism
	// In your `Main` class, create an array of `Shape` references and store instances of both
	// `Circle` and `Rectangle` in the array. Then, iterate through the array and for each 
	// shape, print out its color, area, and perimeter.
	
	// Step 6: Testing
	// Write a test program in the `Main` class to demonstrate that your classes and their 
	// methods work correctly. Instantiate objects of `Circle` and `Rectangle`, and use them in
	// your test program.


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape sh[] = new Shape[8];
		
		sh[0] = new Circle("red",2.5);
		sh[1] = new Circle("yellow",2);
		sh[2] = new Rectangle("blue",2,3);
		sh[3] = new Rectangle("green",3,5);
		sh[4] = new Triangle("purple",3,4);
		sh[5] = new Triangle("grey",6,8);
		sh[6] = new Square("white",5);
		sh[7] = new Square("black",6);
		
		for (int i = 0; i < sh.length; i++) {
			System.out.println(sh[i].toString());
			System.out.println("Area: " + sh[i].area());
			System.out.println("Perimeter: " + sh[i].perimeter());
		}		
	}

}
