package CountWordNum;

public class CountWordNum {
	int count(String[] a,int n){
		int res=0;
		for (int i=0;i<n;i++){
			//System.out.println("\n-------------------------------------------------------");
			boolean flag=false;
			for (int j=0;j<i;j++){
				if (a[i].equals(a[j])) flag=true;
			}
			if (flag==false) res++;
			//System.out.println(res);
		}
		return res;
	}
}