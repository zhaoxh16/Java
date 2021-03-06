package complexShape;

public class Test {
	public static void main(String args[]){
		Shape[] myShape = new Shape[3];
		myShape[0] = new Circle(1,"green",true);
		testShape(myShape[0]);
		myShape[1] = new Rectangle(2,3,"blue",true);
		testShape(myShape[1]);
		myShape[2] = new Square(4,"black",true);
		testShape(myShape[2]);
	}
	
	public static void testShape(Shape shape){
		System.out.println(shape.getColor());
		shape.setColor("yellow");
		System.out.println(shape.getColor());
		System.out.println(shape.isFilled());
		shape.setFilled(false);
		System.out.println(shape.isFilled());
		System.out.println(shape.getArea());
		System.out.println(shape.getPerimeter());
		System.out.println(shape.toString());
	}
}
