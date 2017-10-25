package HugeInteger;

public class HugeInteger{
	int len,flag;
	int[] a=new int[81];
	HugeInteger(String s){
		for (int i=0;i<81;i++) a[i]=0;
		if (s.charAt(0)=='-'){
			flag=-1;
			s=s.substring(1,s.length());
		}
		else flag=1;
		len=s.length();
		//System.out.println("len="+len);
		if (len>40) len=40;
		for (int i=len-1;i>=0;i--){
			a[i]=s.charAt(len-i-1)-'0';
			//System.out.println(a[i]);
		}
	}
	void FuZhi(HugeInteger x,HugeInteger y){
		x.len=y.len;
		x.flag=y.flag;
		for (int i=0;i<len;i++)
			x.a[i]=y.a[i];
	}
	void inputHugeInteger(String s){
		if (s.charAt(0)=='-'){
			flag=-1;
			s=s.substring(1,s.length());
		}
		else flag=1;
		len=s.length();
		if (len>40) len=40;
		for (int i=len-1;i>=0;i--)
			a[i]=s.charAt(len-i-1)-'0';
	}
	String outputHugeInteger(){
		if (len==0) return "0";
		String s="";
		if (flag==-1) s+="-";
		for (int i=len-1;i>=0;i--){
			s+=(char)('0'+a[i]);
			//System.out.println(s);
		}
		return s;
	}
	void Xiao(){
		if (len==0){
			flag=1;
			a[0]=0;
			return;
		}
		for (int i=0;i<len-1;i++){
			if (a[i]>9){
				a[i+1]+=a[i]/10;
				a[i]%=10;
			}
			if (a[i]<0){
				a[i+1]--;
				a[i]+=10;
			}
		}
		while (len<45&&a[len-1]>9){
			a[len]=a[len-1]/10;
			a[len-1]%=10;
			len++;
		}
		while (len>0&&a[len-1]==0) len--;
		if (len>40) len=40;
		for (int i=len;i<81;i++) a[i]=0;
	}
	HugeInteger abs(HugeInteger y){
		HugeInteger tmp=new HugeInteger("0");
		FuZhi(tmp,y);
		if (tmp.flag==-1) tmp.flag=1;
		return tmp;
	}
	boolean isEqualTo(HugeInteger y){
		if (flag!=y.flag) return false;
		if (len!=y.len) return false;
		for (int i=0;i<len;i++)
			if (a[i]!=y.a[i]) return false;
		return true;
	}
	boolean isNotEqualTo(HugeInteger y){
		return !isEqualTo(y);
	}
	boolean Compare0(HugeInteger x,HugeInteger y){
		if (x.len>y.len) return false;
		if (x.len<y.len) return true;
		for (int i=x.len-1;i>=0;i--){
			if (x.a[i]<y.a[i]) return true;
			if (x.a[i]>y.a[i]) return false;
		}
		return false;
	}
	boolean isGreaterThan(HugeInteger y){
		if (isEqualTo(y)) return false;
		if (flag==1&&y.flag==-1) return true;
		if (flag==-1&&y.flag==1) return false;
		if (flag==1) return !Compare0(this,y);
		return Compare0(this,y);
	}
	boolean isLessThan(HugeInteger y){
		if (isEqualTo(y)) return false;
		return !isGreaterThan(y);
	}
	boolean isGreaterThanOrEqualTo(HugeInteger y){
		return isGreaterThan(y)||isEqualTo(y);
	}
	boolean isLessThanOrEqualTo(HugeInteger y){
		return isLessThan(y)||isEqualTo(y);
	}
	HugeInteger add0(HugeInteger x,HugeInteger y){
		x.Xiao();
		y.Xiao();
		HugeInteger res=new HugeInteger("0");
		if (x.len>y.len) res.len=x.len;
		else res.len=y.len;
		for (int i=0;i<len;i++)
			res.a[i]=x.a[i]+y.a[i];
		res.Xiao();
		return res;
	}
	HugeInteger sub0(HugeInteger x,HugeInteger y){
		//System.out.println("--------------------------- sub0 -----------------------------");
		//System.out.println("x:"+x.outputHugeInteger());
		//System.out.println("y:"+y.outputHugeInteger());
		x.Xiao();
		y.Xiao();
		HugeInteger res=new HugeInteger("0");
		if (x.len>y.len) res.len=x.len;
		else res.len=y.len;
		for (int i=0;i<len;i++)
			res.a[i]=x.a[i]-y.a[i];
		res.Xiao();
		//System.out.println("res:"+res.outputHugeInteger());
		return res;
	}
	HugeInteger addHugeIntegers(HugeInteger y){
		if (flag==y.flag){
			HugeInteger res=add0(this,y);
			res.flag=flag;
			res.Xiao();
			return res;
		}
		else{
			HugeInteger x=this,res=new HugeInteger("0");
			//System.out.println("y.flag="+y.flag);
			if (abs(x).isGreaterThan(abs(y))){
				res=sub0(x,y);
				res.flag=x.flag;
				res.Xiao();
				return res;
			}
			else{
				//System.out.println("y.flag="+y.flag);
				res=sub0(y,x);
				//System.out.println("y.flag="+y.flag);
				res.flag=y.flag;
				res.Xiao();
				return res;
			}
		}
	}
	HugeInteger substractHugeIntegers(HugeInteger y){
		y.flag=-y.flag;
		return addHugeIntegers(y);
	}
}
