package hugeinteger;
import java.util.Scanner;

public class Test {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ����");
		String str1 = sc.nextLine();
		System.out.println("������ڶ�����");
		String str2 = sc.nextLine();
		HugeInteger integer1 = new HugeInteger(str1);
		HugeInteger integer2 = new HugeInteger(str2);
		integer1.outputHugeInteger();
		System.out.print("\n");
		integer2.outputHugeInteger();
		System.out.print("\n");
		System.out.println(integer1.isEqualTo(integer2));
		System.out.println(integer1.isNotEqualTo(integer2));
		System.out.println(integer1.isGreaterThan(integer2));
		System.out.println(integer1.isLessThan(integer2));
		System.out.println(integer1.isGreaterThanOrEqualTo(integer2));
		System.out.println(integer1.isLessThanOrEqualTo(integer2));
		integer1.addHugeInteger(integer2).outputHugeInteger();
		System.out.print("\n");
		integer1.subHugeInteger(integer2).outputHugeInteger();
		System.out.print("\n");
		System.out.println("���޸ĵڶ�����");
		String str3 = sc.nextLine();
		integer2.inputHugeInteger(str3);
		integer2.outputHugeInteger();
		System.out.print("\n");
		System.out.println(integer1.isEqualTo(integer2));
		System.out.println(integer1.isNotEqualTo(integer2));
		System.out.println(integer1.isGreaterThan(integer2));
		System.out.println(integer1.isLessThan(integer2));
		System.out.println(integer1.isGreaterThanOrEqualTo(integer2));
		System.out.println(integer1.isLessThanOrEqualTo(integer2));
		integer1.addHugeInteger(integer2).outputHugeInteger();
		System.out.print("\n");
		integer1.subHugeInteger(integer2).outputHugeInteger();
		System.out.print("\n");
		
		
		
	}

}
