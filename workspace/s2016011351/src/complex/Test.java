package complex;
import java.util.Scanner;

public class Test {
	public static void main(String[] args){
		while(true){
			Scanner sc = new Scanner(System.in);
			System.out.print("请输入第一个数的实部： ");
			double realPart1 = sc.nextDouble();
			System.out.print("请输入第一个数的虚部： ");
			double imagPart1 = sc.nextDouble();
			System.out.print("请输入第二个数的实部： ");
			double realPart2 = sc.nextDouble();
			System.out.print("请输入第二个数的虚部： ");
			double imagPart2 = sc.nextDouble();
			Complex a = new Complex(realPart1, imagPart1);
			Complex b = new Complex(realPart2, imagPart2);
			System.out.print("输入的第一个数为： ");
			a.print();
			System.out.print("输入的第二个数为： ");
			b.print();
			System.out.print("两数和为： ");
			a.add(b).print();
			System.out.print("两数差为： ");
			a.sub(b).print();
			System.out.println("输入“-1”退出，输入其他整数继续");
			if(sc.nextInt() == -1)
				break;
		}
	}
}
