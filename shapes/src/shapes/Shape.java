package shapes;

public class Shape {
	private String name;
	Shape(String aName){name = aName;}
	public String getName() { return name; }
	public float calculateArea() { return 0.0f; }
	
	public void main(String argv[]){
		System.out.println("hi");
		Circle c = new Circle("Circle C",3);
		Square s = new Square("Square S",4);
		Shape shapeArray[] = {c,s};
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