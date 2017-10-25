package rational;
import java.util.Scanner;

public class Test {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入第一个分数的分子");
		int a1 = sc.nextInt();
		System.out.print("请输入第一个分数的分母");
		int b1 = sc.nextInt();
		System.out.print("请输入第二个分数的分子");
		int a2 = sc.nextInt();
		System.out.print("请输入第二个分数的分母");
		int b2 = sc.nextInt();
		Rational a = new Rational(a1,b1);
		Rational b = new Rational(a2,b2);
		a.printRational();
		a.printReal();
		b.printRational();
		b.printReal();
		a.add(b).printRational();
		a.add(b).printReal();
		a.sub(b).printRational();
		a.sub(b).printReal();
		a.mul(b).printRational();
		a.mul(b).printReal();
		a.div(b).printRational();
		a.div(b).printReal();
	}

}
