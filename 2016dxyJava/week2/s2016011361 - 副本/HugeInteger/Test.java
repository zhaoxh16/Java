package HugeInteger;
import java.util.*;
import java.io.*;
public class Test{
	public static void main(String[] args)throws IOException{
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		Scanner cin=new Scanner(System.in);
		String s=reader.readLine();
		HugeInteger now=new HugeInteger(s);
		System.out.println(now.outputHugeInteger());
		for (;;){
			s=reader.readLine();
			if (s.equals("exit")){
				System.out.println("Program Ended....");
				break;
			}
			String ss=reader.readLine();
			HugeInteger tmp=new HugeInteger(ss);
			if (s.equals("+")){
				System.out.println(now.addHugeIntegers(tmp).outputHugeInteger());
			}
			else if (s.equals("-")){
				System.out.println(now.substractHugeIntegers(tmp).outputHugeInteger());
			}
			else if (s.equals("==")){
				if (now.isEqualTo(tmp)) System.out.println("True");
				else System.out.println("False");
			}
			else if (s.equals("!=")){
				if (now.isNotEqualTo(tmp)) System.out.println("True");
				else System.out.println("False");
			}
			else if (s.equals(">")){
				if (now.isGreaterThan(tmp)) System.out.println("True");
				else System.out.println("False");
			}
			else if (s.equals("<")){
				if (now.isLessThan(tmp)) System.out.println("True");
				else System.out.println("False");
			}
			else if (s.equals(">=")){
				if (now.isGreaterThanOrEqualTo(tmp)) System.out.println("True");
				else System.out.println("False");
			}
			else if (s.equals("<=")){
				if (now.isLessThanOrEqualTo(tmp)) System.out.println("True");
				else System.out.println("False");
			}
			else System.out.println("Invalid Input!");
		}
		cin.close();
	}
}
