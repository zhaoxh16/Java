package rational;

public class Rational {
	int a;
	int b;
	
	private int getGCD(int a, int b){
		if(a<b){
			int c = a;
			a = b;
			b = c;
		}
		//a>=b
		while(b!=0){
			a = a%b;
			int c = a;
			a = b;
			b = c;
		}
		if(a>0)
			return a;
		else
			return -a;
	}
	
	private int getLCM(int a,int b){
		int lcm = a*b/getGCD(a,b);
		if(lcm>0)
			return lcm;
		else
			return -lcm;
	}
	
	public Rational(int a, int b){
		int gcd = getGCD(a,b);
		a = a/gcd;
		b = b/gcd;
		boolean flag = false;
		if(a<0){
			flag = !flag;
			a = -a;
		}
		if(b<0){
			flag = !flag;
			b = -b;
		}
		if(flag)
			a = -a;
		this.a = a;
		this.b = b;
	}
	
	public Rational add(Rational a){
		int lcm = getLCM(this.b,a.b);
		int x1 = lcm/this.b;
		int x2 = lcm/a.b;
		int a1 = x1*this.a;
		int a2 = x2*a.a;
		return new Rational(a1+a2, lcm);
	}
	
	public Rational sub(Rational a){
		int lcm = getLCM(this.b,a.b);
		int x1 = lcm/this.b;
		int x2 = lcm/a.b;
		int a1 = x1*this.a;
		int a2 = x2*a.a;
		return new Rational(a1-a2, lcm);
	}
	
	public Rational mul(Rational a){
		return new Rational(this.a*a.a,this.b*a.b);
	}

	public Rational div(Rational a){
		return new Rational(this.a*a.b,this.b*a.a);
	}
	
	public void printRational(){
		System.out.print(this.a);
		if(this.b == 1){
			System.out.print('\n');
		}else{
			System.out.print('/');
			System.out.print(b);
			System.out.print('\n');
		}
	}
	
	public void printReal(){
		System.out.println((double)this.a/this.b);
	}
}
