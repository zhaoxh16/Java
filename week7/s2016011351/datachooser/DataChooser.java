package datachooser;
import java.io.*;

public class DataChooser {
	Data[] dataArray;
	public int size;
	public void readData() {
		size = 36801;
		dataArray = new Data[36801];
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					new FileInputStream("data.txt")));
			for(int i=0;i<36801;++i) {
				dataArray[i] = new Data(br.readLine());
			}
		}catch(IOException e){
			System.out.println("文件打开失败");
		}
	}
	
	public void sort(int low, int high) {
		if(low>=high - 1)
			return;
		int p = low;
		int q = high - 1;
		Data key = dataArray[low];
		while(p<q) {
			while(p<q&&key.isLessOrEqualTo(dataArray[q])) {
				--q;
			}dataArray[p] = dataArray[q];
			while(p<q&&dataArray[p].isLessOrEqualTo(key)) {
				++p;
			}dataArray[q] = dataArray[p];
		}
		dataArray[p] = key;
		sort(low,p);
		sort(p+1,high);
	}
	
	public void show() {
		System.out.println(dataArray[0].getSortedData());
		try {
			FileWriter fr = new FileWriter("newData.txt");
			BufferedWriter bfw = new BufferedWriter(fr);
			for(int i=0;i<size;++i) {
				bfw.write(dataArray[i].getData());
				bfw.write("\n");
			}
			bfw.flush();
			bfw.close();
			fr.close();
		}catch(IOException e) {
			System.out.println("文件写入失败");
		}
	}

}
