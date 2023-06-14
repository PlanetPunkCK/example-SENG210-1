package example;

/* default values are 1 for both height and width.
A no-arg constructor that creates a default rectangle.
A constructor that creates a rectangle with the specified width and height.
A method named getArea() that returns the area of this rectangle.
A method named getPerimeter() that returns the perimeter.
Draw the UML diagram for the class then implement the class. 
Write a test program that creates two Rectangle objects—one with width 4 and height 40, 
and the other with width 3.5 and height 35.9. Display the width, height, area, and 
perimeter of each rectangle in this order*/


// comment 1 added
public class testRectangle{
	public static void main(String[] args) {
		Rectangle R1 = new Rectangle(4, 40);
		Rectangle R2 = new Rectangle(3.5, 35.9);
		Rectangle R3 = new Rectangle();
		
		System.out.println("The width of R1 is: " + R1.width);
		System.out.println("The height of R1 is: " + R1.height);
		System.out.println("The Area of R1 is: " + R1.getArea());
		System.out.println("The Perimeter of R1 is: " + R1.getPerimeter());
		
		System.out.println();
		
		System.out.println("The width of R2 is: " + R2.width);
		System.out.println("The height of R2 is: " + R2.height);
		System.out.println("The Area of R2 is: " + R2.getArea());
		System.out.println("The Perimeter of R2 is: " + R2.getPerimeter());
		
		System.out.println();
		
		System.out.println("The width of R3 is: " + R3.width);
		System.out.println("The height of R3 is: " + R3.height);
		System.out.println("The Area of R3 is: " + R3.getArea());
		System.out.println("The Perimeter of R3 is: " + R3.getPerimeter());
	}
  
}


// comment 2 added 
class Rectangle{
	double width;
	double height;
	
	Rectangle(){
		height = 1;
		width = 1;
	}
	
	Rectangle(double newW, double newH){
		height = newH;
		width = newW;
	}
   
	double getArea(){
		return width * height;
	}
	
	double getPerimeter(){
		return (width + height) * 2;
	}
}

// comment 3 -- new class needed
class NewRectangle{

}

// comment 4 -- new nonsense class needed
class DoubleRectangle{
	
}

