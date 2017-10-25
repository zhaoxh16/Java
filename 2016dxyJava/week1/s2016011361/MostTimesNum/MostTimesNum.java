package MostTimesNum;

public class MostTimesNum {
	int get(int[] a,int n){
		int ans=0,res=-999999999;
		for (int i=0;i<n;i++){
			int cnt=0;
			for (int j=0;j<n;j++){
				if (a[j]==a[i]) cnt++;
			}
			cnt--;
			if (cnt>ans){
				ans=cnt;
				res=a[i];
			}
			else if (cnt==ans){
				if (a[i]<res) res=a[i];
			}
		}
		return res;
	}
}