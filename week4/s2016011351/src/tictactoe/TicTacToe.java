package tictactoe;

public class TicTacToe {
	public TicTacToe(){
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				a[i][j] = 0;
		player = 1;
	}
	
	private boolean isEnd(){
		for(int i=0;i<3;i++){
			if(a[i][0] == 0)
				continue;
			else if(a[i][0] == a[i][1] && a[i][1] == a[i][2])
				return true;
		}
		for(int i = 0;i<3;i++){
			if(a[0][i] == 0)
				continue;
			else if(a[0][i] == a[1][i] && a[1][i] == a[2][i])
				return true;
		}
		if(a[0][0]!=0&&a[0][0] == a[1][1]&&a[1][1] == a[2][2])
			return true;
		if(a[2][0]!=0&&a[2][0] == a[1][1]&&a[1][1] == a[0][2])
			return true;
		return false;
	}
	
	public boolean next(int x,int y){
		a[x][y] = player;
		player = 3 - player;
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(a[i][j]);
				System.out.print(' ');
			}
			System.out.print('\n');
		}
		System.out.print('\n');
		return isEnd();
	}
	
	private int[][] a = new int[3][3];
	private int player;
}
