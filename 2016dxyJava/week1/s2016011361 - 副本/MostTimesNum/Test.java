package MostTimesNum;
import java.io.*;
import java.util.Scanner;
public class Test {
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int[] a=new int[n];
		for (int i=0;i<n;i++) a[i]=cin.nextInt();
		MostTimesNum finder=new MostTimesNum();
		int ans=finder.get(a,n);
		System.out.println(ans);
	}
}