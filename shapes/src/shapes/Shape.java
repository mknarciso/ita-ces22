package shapes;

public class Shape {
	private String name;
	Shape(String aName){name = aName;}
	public String getName() { return name; }
	public float calculateArea() { return 0.0f; }
	
	public static void main(String []args) throws Exception {
		Circle c = new Circle("Circle C",3);
		Square s = new Square("Square S",4);
		Triangle t = new Triangle("Triangle T",3,4);
		Shape shapeArray[] = {c,s,t};
		for (int i=0;i<shapeArray.length; i++){
			System.out.println("The area of " + shapeArray[i].getName() + " is " + 
								shapeArray[i].calculateArea() + " sq. cm.\n");
		}
		
	}
}

class Circle extends Shape{
	private int radius;
	Circle(String aName, int r){
		super (aName);
		radius = r;
	}
	public float calculateArea() {
		float area;
		area = 3.14f * radius * radius;
		return area;
	}
}

class Square extends Shape{
	private int side;
	Square (String aName, int s){
		super(aName);
		side=s;
	}
	public float calculateArea() {
		int area;
		area = side * side;
		return area;
	}
}

class Triangle extends Shape {
	private int base, high;
	Triangle (String aName, int b, int h){
		super(aName);
		base = b;
		high = h;
	}
	public float calculateArea(){
		return (base*high)/2;
	}
}