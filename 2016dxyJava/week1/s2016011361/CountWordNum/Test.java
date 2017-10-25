package CountWordNum;
import java.util.*;
public class Test {
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		String s=cin.nextLine();
		int len=s.length(),cnt=0;
		String[] a=new String[100];
		for (int l=0,r=0;l<len;l++){
			r=l;
			while (r<len&&s.charAt(r)!=' ') r++;
			cnt++;
			a[cnt-1]=s.substring(l,r);
			l=r;
		}
		//for (int i=0;i<cnt;i++) System.out.println(a[i]);
		CountWordNum counter=new CountWordNum();
		int ans=counter.count(a,cnt);
		System.out.println(ans);
	}
}