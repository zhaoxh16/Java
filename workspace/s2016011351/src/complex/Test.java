package complex;
import java.util.Scanner;

public class Test {
	public static void main(String[] args){
		while(true){
			Scanner sc = new Scanner(System.in);
			System.out.print("�������һ������ʵ���� ");
			double realPart1 = sc.nextDouble();
			System.out.print("�������һ�������鲿�� ");
			double imagPart1 = sc.nextDouble();
			System.out.print("������ڶ�������ʵ���� ");
			double realPart2 = sc.nextDouble();
			System.out.print("������ڶ��������鲿�� ");
			double imagPart2 = sc.nextDouble();
			Complex a = new Complex(realPart1, imagPart1);
			Complex b = new Complex(realPart2, imagPart2);
			System.out.print("����ĵ�һ����Ϊ�� ");
			a.print();
			System.out.print("����ĵڶ�����Ϊ�� ");
			b.print();
			System.out.print("������Ϊ�� ");
			a.add(b).print();
			System.out.print("������Ϊ�� ");
			a.sub(b).print();
			System.out.println("���롰-1���˳�������������������");
			if(sc.nextInt() == -1)
				break;
		}
	}
}
