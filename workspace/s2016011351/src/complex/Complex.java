package complex;

public class Complex {
	private double realPart;
	private double imaginaryPart;
	
	public Complex(double realPart, double imaginaryPart) {
		this.realPart = realPart;
		this.imaginaryPart = imaginaryPart;
	}
	
	public Complex add(Complex anotherComplex){
		double realPart = this.realPart+anotherComplex.realPart;
		double imaginaryPart = this.imaginaryPart+anotherComplex.imaginaryPart;
		return new Complex(realPart,imaginaryPart);
	}
	
	public Complex sub(Complex anotherComplex){
		double realPart = this.realPart-anotherComplex.realPart;
		double imaginaryPart = this.imaginaryPart-anotherComplex.imaginaryPart;
		return new Complex(realPart,imaginaryPart);
	}
	
	public void print(){
		System.out.print(this.realPart);
		if(this.imaginaryPart==0){
			System.out.print('\n');
			return;
		}
		else if(this.imaginaryPart>0)
			System.out.print('+');
		System.out.print(this.imaginaryPart);
		System.out.print("i\n");
		
	}

}
