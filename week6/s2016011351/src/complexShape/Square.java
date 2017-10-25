package complexShape;

public class Square extends Rectangle{
	public Square(){}
	
	public Square(double side){
		super(side,side);
	}
	
	public Square(double side, String color, boolean filled){
		 super(side,side,color,filled);
	}
	
	public double getSide(){
		return this.length;
	}
	
	public void setSide(double side){
		this.length = this.width = side;
	}
	
	public void setWidth(double side){
		setSide(side);
	}
	
	public void setLength(double side){
		setSide(side);
	}
	
	public String toString(){
		return "square";
	}

}
