package Complex;
import java.util.*;
public class Test {
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		double x1=cin.nextDouble();
		double y1=cin.nextDouble();
		double x2=cin.nextDouble();
		double y2=cin.nextDouble();
		Complex A=new Complex(x1,y1);
		Complex B=new Complex(x2,y2);
		A.sub(B).print();
		A.print();
		cin.close();
	}
}