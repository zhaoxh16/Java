package complexShape;

public class Circle extends Shape {
	protected double radius;
	
	public Circle(){
		super();
		this.radius = 0;
	}
	
	public Circle(double radius){
		this.radius = radius;
	}
	
	public Circle(double radius, String color, boolean filled){
		super(color,filled);
		this.radius = radius;
	}
	
	public double getRadius(){
		return radius;
	}
	
	public void setRadius(double radius){
		this.radius = radius;
	}
	
	public double getArea(){
		return 3.1415926*radius*radius;
	}
	
	public double getPerimeter(){
		return 3.1415926*radius*2;
	}
	
	public String toString(){
		return "circle";
	}

}
