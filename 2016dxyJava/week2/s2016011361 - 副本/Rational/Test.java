package Rational;
import java.util.*;
import java.io.*;
public class Test{
	public static void main(String[] args)throws IOException{
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		Scanner cin=new Scanner(System.in);
		int x=cin.nextInt();
		int y=cin.nextInt();
		Rational now=new Rational(x,y);
		System.out.println("\nThe rational now is:  ");now.printRational();
		for (;;){
			String s=reader.readLine();
			int fz=cin.nextInt();
			int fm=cin.nextInt();
			Rational tmp=new Rational(fz,fm);
			if (s.equals("+")) now.add(tmp).printRational();
			else if (s.equals("-")) now.sub(tmp).printRational();
			else if (s.equals("*")) now.mul(tmp).printRational();
			else if (s.equals("/")) now.div(tmp).printRational();
			else break;
			System.out.println("The rational now is:  ");now.printReal();System.out.println('\n');
		}
		cin.close();
	}
}
