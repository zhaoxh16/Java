
package hugeinteger;

public class HugeInteger {
	int[] a = new int[40];
	int length = 0;
	boolean isPositive = true;
	HugeInteger(String integer){
		for(int i=0;i<40;i++){
			a[i] = 0;
		}
		if(integer.length() == 0)
			return;
		//处理负号
		if(integer.charAt(0) == '-'){
			isPositive = false;
			integer = integer.substring(1, integer.length());
		}else isPositive = true;
		//预处理前面的0
		int flag = 0;
		for(int i=0;i<integer.length();i++){
			if(integer.charAt(i) == '0')
				flag++;
			else
				break;
		}
		integer = integer.substring(flag,integer.length());
		for(int i=0;i<integer.length()&&i<40;i++){
			a[i] = integer.charAt(integer.length()-1-i)-'0';
			++length;
		}
	}

	void inputHugeInteger(String integer){
		length = 0;
		for(int i=0;i<40;i++){
			a[i] = 0;
		}
		if(integer.length() == 0){
			isPositive = true;
			return;
		}
		if(integer.charAt(0) == '-'){
			isPositive = false;
			integer = integer.substring(1, integer.length());
		}else{
			isPositive = true;
		}
		//预处理前面的0
		int flag = 0;
		for(int i=0;i<integer.length();i++){
			if(integer.charAt(i) == '0')
				flag++;
			else
				break;
		}
		integer = integer.substring(flag,integer.length());
		for(int i=0;i<integer.length()&&i<40;i++){
			a[i] = integer.charAt(integer.length()-1-i)-'0';
			++length;
		}
	}

	void outputHugeInteger(){
		if(!isPositive)
			System.out.print('-');
		if(length == 0)
			System.out.print('0');
		for(int i=length-1;i>=0;i--){
			System.out.print(a[i]);
		}
	}

	HugeInteger addHugeInteger(HugeInteger integer){
		if(isPositive&&integer.isPositive)
			return _add(integer);
		else if(isPositive&&!integer.isPositive)
			return _sub(integer);
		else if(!isPositive&&integer.isPositive)
			return integer._sub(this);
		else{
			HugeInteger newInteger = _add(integer);
			newInteger.isPositive = false;
			return newInteger;
		}
	}
	
	HugeInteger subHugeInteger(HugeInteger integer){
		if(isPositive&&integer.isPositive)
			return _sub(integer);
		else if(isPositive&&!integer.isPositive)
			return _add(integer);
		else if(!isPositive&&integer.isPositive){
			HugeInteger newInteger = _add(integer);
			newInteger.isPositive = false;
			return newInteger;
		}else{
			return integer._sub(this);
		}
	}
	
	//无视符号
	HugeInteger _add(HugeInteger integer){
		char[] a = new char[40];
		for(int i=0;i<40;i++){
			a[i] = '0';
		}
		int flag = 0;
		for(int i=0;i<40;i++){
			int temp = this.a[i]+integer.a[i]+flag;
			if(temp>=10){
				temp-=10;
				flag = 1;
			}else{
				flag = 0;
			}
			a[40-i-1] = (char)(temp+'0');
		}
		return new HugeInteger(String.valueOf(a));
	}
	
	HugeInteger _sub(HugeInteger integer){
		char[] a = new char[41];
		for(int i=0;i<41;i++){
			a[i] = '0';
		}
		int flag = 0;
		char[] b = new char[40];
		char[] c = new char[40];
		for(int i=0;i<40;i++){
			b[i] = (char)(this.a[40-i-1]+'0');
			c[i] = (char)(integer.a[40-i-1]+'0');
		}
		HugeInteger intb = new HugeInteger(String.valueOf(b));
		HugeInteger intc = new HugeInteger(String.valueOf(c));
		if(intb.isLessThan(intc)){
			HugeInteger intd = new HugeInteger(String.valueOf(b));
			intb = intc;
			intc = intd;
			a[0] = '-';
		}
		for(int i = 0;i<40&&(i<intb.length||i<intc.length);i++){
			int temp = intb.a[i]-intc.a[i]+flag;
			if(temp<0){
				flag = -1;
				temp+=10;
			}else{
				flag = 0;
			}
			a[41-i-1] = (char)(temp+'0');
		}
		return new HugeInteger(String.valueOf(a));
	}

	boolean isEqualTo(HugeInteger integer){
		if(length!=integer.length)
			return false;
		else if(isPositive != integer.isPositive)
			return false;
		else{
			for(int i=length-1;i>=0;i--){
				if(a[i]!=integer.a[i])
					return false;
			}
			return true;
		}
	}

	boolean isNotEqualTo(HugeInteger integer){
		return !isEqualTo(integer);
	}

	boolean isGreaterThan(HugeInteger integer){
		if(isPositive&&!integer.isPositive)
			return true;
		else if(!isPositive&& integer.isPositive)
			return false;
		else if(isPositive){
			if(length>integer.length)
				return true;
			else if(length<integer.length)
				return false;
			else{
				for(int i=length-1;i>=0;i--){
					if(a[i]>integer.a[i])
						return true;
					else if(a[i]<integer.a[i])
						return false;
				}
				return false;
			}
		}
		else{
			if(length>integer.length)
				return false;
			else if(length<integer.length)
				return true;
			else{
				for(int i=length-1;i>=0;i--){
					if(a[i]>integer.a[i])
						return false;
					else if(a[i]<integer.a[i])
						return true;
				}
				return false;
			}
		}
	}

	boolean isLessThan(HugeInteger integer){
		if(isPositive&&!integer.isPositive)
			return false;
		else if(!isPositive&& integer.isPositive)
			return true;
		else if(isPositive){
			if(length>integer.length)
				return false;
			else if(length<integer.length)
				return true;
			else{
				for(int i=length-1;i>=0;i--){
					if(a[i]>integer.a[i])
						return false;
					else if(a[i]<integer.a[i])
						return true;
				}
				return false;
			}
		}
		else{
			if(length>integer.length)
				return true;
			else if(length<integer.length)
				return false;
			else{
				for(int i=length-1;i>=0;i--){
					if(a[i]>integer.a[i])
						return true;
					else if(a[i]<integer.a[i])
						return false;
				}
				return false;
			}
		}
	}

	boolean isGreaterThanOrEqualTo(HugeInteger integer){
		if(isLessThan(integer))
			return false;
		else
			return true;
	}

	boolean isLessThanOrEqualTo(HugeInteger integer){
		if(isGreaterThan(integer))
			return false;
		else
			return true;
	}
}
