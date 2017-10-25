package NumSplit;
import java.util.*;
public class NumSplit {
	void split(int x){
		int[] a=new int[10];
		int cnt=-1;
		while (x>0){
			a[++cnt]=x%10;
			x/=10;
		}
		for (;cnt>=0;cnt--){
			System.out.print(a[cnt]);
			System.out.print(" ");
		}
	}
}
