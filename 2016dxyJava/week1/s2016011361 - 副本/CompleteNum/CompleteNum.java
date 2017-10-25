package CompleteNum;

public class CompleteNum {
	boolean check(long x){
		long tmp=0;
		for (long i=1;i*i<=x;i++){
			if (x%i!=0) continue;
			tmp+=i;
			if (i*i!=x) tmp+=x/i;
		}
		tmp-=x;
		if (tmp==x) return true;
		else return false;
	}
}
