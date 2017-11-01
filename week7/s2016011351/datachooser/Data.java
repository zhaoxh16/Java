package datachooser;

public class Data {
	private String data;
	private int sortedData;
	
	public Data(String data) {
		this.data = data;
		//��ǰ������û�õĶ�ȥ��
		int pos = 0;
		char myChar = data.charAt(pos);
		for(int i=0;i<4;++i) {
			while(myChar==' ') {
				++pos;
				myChar = data.charAt(pos);
			}
			while(myChar!=' ') {
				++pos;
				myChar = data.charAt(pos);
			}
		}
		//��ȡ�����е���,����sortedData
		while(myChar== ' ') {
			++pos;
			myChar = data.charAt(pos);
		}
		sortedData = 0;
		while(myChar!=' ') {
			sortedData*=10;
			sortedData+=Character.getNumericValue(myChar);
			++pos;
			myChar = data.charAt(pos);
		}
	}
	
	public boolean isLessOrEqualTo(Data anotherData) {
		return this.sortedData<=anotherData.sortedData;
	}
	
	public int getSortedData() {
		return this.sortedData;
	}
	
	public String getData() {
		return this.data;
	}
}
