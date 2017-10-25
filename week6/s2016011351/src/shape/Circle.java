package shape;

public class Circle extends Shape {
	public double radius;
	public Circle(double radius){
		this.radius = radius;
	}
	public double getArea(){
		area = 3.1415926*radius*radius;
		return area;
	}

}
