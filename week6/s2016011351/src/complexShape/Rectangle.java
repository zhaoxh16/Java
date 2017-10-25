package complexShape;

public class Rectangle extends Shape{
	protected double width;
	protected double length;
	public Rectangle(){
		super();
		width = 0;
		length = 0;
	}
	
	public Rectangle(double width, double length){
		super();
		this.width = width;
		this.length = length;
	}
	
	public Rectangle(double width, double length, String color, boolean filled){
		super(color,filled);
		this.width = width;
		this.length = length;
	}
	
	public double getWidth(){
		return this.width;
	}
	
	public void setWidth(double width){
		this.width= width;
	}
	
	public double getLength(){
		return this.length;
	}
	
	public void setLength(double length){
		this.length = length;
	}
	
	public double getArea(){
		return length*width;
	}
	
	public double getPerimeter(){
		return 2*length+2*width;
	}
	
	public String toString(){
		return "rectangle";
	}
}

