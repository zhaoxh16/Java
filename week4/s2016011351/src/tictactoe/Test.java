package tictactoe;

public class Test {
	public static void main(String args[]){
		TicTacToe game = new TicTacToe();
		int step = args[0].length()/5;
		boolean flag = false;
		for(int i=0;i<step;i++){
			String order = args[0].substring(i*5, i*5+5);
			int x = order.charAt(1)-48;
			int y = order.charAt(3)-48;
			--x;
			--y;
			if(game.next(x, y)){
				flag = true;
				break;
			}
		}
		System.out.print(flag);
	}
}
