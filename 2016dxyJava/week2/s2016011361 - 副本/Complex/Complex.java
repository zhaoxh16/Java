package Complex;

public class Complex {
	double realPart,imaginaryPart;
	Complex(double r,double i){
		realPart=r;
		imaginaryPart=i;
	}
	Complex add(Complex x){
		Complex res=new Complex(realPart+x.realPart,imaginaryPart+x.imaginaryPart);
		return res;
	}
	Complex sub(Complex x){
		Complex res=new Complex(realPart-x.realPart,imaginaryPart-x.imaginaryPart);
		return res;
	}
	double abs(double x){
		if (x>0) return x;
		return -x;
	}
	void print(){
		double eps=1e-9;
		if (abs(realPart)<eps&&abs(imaginaryPart)<eps){
			System.out.println(0);
		}
		else if (abs(realPart)<eps){
			System.out.print(imaginaryPart);
			System.out.println("i");
		}
		else if (abs(imaginaryPart)<eps){
			System.out.println(realPart);
		}
		else{
			System.out.print(realPart);
			if (imaginaryPart>0) System.out.print("+");
			System.out.print(imaginaryPart);
			System.out.println("i");
		}
	}
}