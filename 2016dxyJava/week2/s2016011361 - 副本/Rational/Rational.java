package Rational;

public class Rational{
	int fz,fm,flag;
	int gcd(int x,int y){if (y==0) return x;return gcd(y,x%y);}
	int abs(int x){if (x<0) return -x;return x;}
	void Xiao(){
		//System.out.println("fz="+fz+"  fm="+fm);
		int tmp=gcd(fz,fm);
		fz/=tmp;
		fm/=tmp;
		if (fz==0) flag=1;
	}
	Rational(int _fz,int _fm){
		if (_fz*_fm<0) flag=-1;
		else flag=1;
		fz=abs(_fz);
		fm=abs(_fm);
		Xiao();
	}
	boolean Compare0(Rational a,Rational b){//a<b
		if (a.fz*b.fm<b.fz*a.fm) return true;
		return false;
	}
	Rational add0(Rational a,Rational b){
		Rational res=new Rational(0,1);
		res.fm=a.fm*b.fm;
		res.fz=a.fz*b.fm+b.fz*a.fm;
		res.Xiao();
		return res;
	}
	Rational sub0(Rational a,Rational b){
		Rational res=new Rational(0,1);
		res.fm=a.fm*b.fm;
		res.fz=a.fz*b.fm-b.fz*a.fm;
		res.Xiao();
		return res;
	}
	Rational add(Rational b){
		Rational a=this,res=new Rational(0,1);
		if (a.flag*b.flag==-1){
			if (Compare0(a,b)){
				Rational tmp=a;
				a=b;
				b=tmp;
			}
			res.flag=a.flag;
			Rational tmp=sub0(a,b);
			res.fz=tmp.fz;
			res.fm=tmp.fm;
		}
		else{
			res.flag=a.flag;
			Rational tmp=add0(a,b);
			res.fz=tmp.fz;
			res.fm=tmp.fm;
		}
		res.Xiao();
		return res;
	}
	Rational sub(Rational b){
		Rational a=this,res=new Rational(0,1);
		if (a.flag*b.flag==-1){
			res.flag=a.flag;
			Rational tmp=add0(a,b);
			res.fz=tmp.fz;
			res.fm=tmp.fm;
		}
		else if (Compare0(a,b)){
			res.flag=-a.flag;
			Rational tmp=sub0(b,a);
			res.fz=tmp.fz;
			res.fm=tmp.fm;
		}
		else{
			res.flag=a.flag;
			Rational tmp=sub0(a,b);
			res.fz=tmp.fz;
			res.fm=tmp.fm;
		}
		res.Xiao();
		return res;
	}
	Rational mul(Rational b){
		Rational a=this,res=new Rational(0,1);
		res.flag=a.flag*b.flag;
		res.fz=a.fz*b.fz;
		res.fm=a.fm*b.fm;
		//System.out.println("res.fz="+res.fz+"  res.fm="+res.fm);
		res.Xiao();
		return res;
	}
	Rational div(Rational b){
		if (b.fz==0){
			System.out.println("The divisor can't be 0 !!!");
			return b;
		}
		Rational a=this;
		int t=b.fz;b.fz=b.fm;b.fm=t;
		Rational res=a.mul(b);
		return res;
	}
	void printRational(){
		Xiao();
		//System.out.println("fz="+fz+"  fm="+fm);
		if (fz==0){
			System.out.println(0);
			return;
		}
		if (flag==-1) System.out.print('-');
		if (fz==fm) System.out.println(1);
		else System.out.println(fz+"/"+fm);
	}
	void printReal(){
		Xiao();
		if (fz==0){
			System.out.println(0);
			return;
		}
		if (flag==-1) System.out.print('-');
		double res=(double)fz/fm;
		System.out.println(res);
	}
}