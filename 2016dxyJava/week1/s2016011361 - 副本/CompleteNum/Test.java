package CompleteNum;
import java.io.*;
public class Test {
	public static void main(String[] args)throws IOException{
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String s=reader.readLine();
		long x=Long.parseLong(s);
		CompleteNum checker=new CompleteNum();
		if (checker.check(x)) System.out.println("yes");
		else System.out.println("no");
	}
}
