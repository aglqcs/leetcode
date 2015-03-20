package leetcode;

public class word_search {
	//TODO
	 public static boolean exist(char[][] board, String word) {
		 	if(word == null || word.length() == 0) return false;
	        int row = board.length;
	        int col = board[0].length;
	        for(int i = 0;i < row;i ++){
	        	for(int j = 0;j < col;j ++){
	        		if(board[i][j] == word.charAt(0)){
	        			System.out.println();
	        			int [][]occupy = new int[row][col];
	        			if(rec(board,occupy,word,i,j,i,j)) return true;
	        		}
	        	}
	        }
	        return false;
	 }
	 public static boolean rec(char [][]board,int [][]occupy,String word,int x,int y,int ox,int oy){
		System.out.println(x + " " + y +" " +ox + " " + oy);
		 if(word.length() == 0) return true;
		 if(x < 0 || y < 0 || x >= board.length || y >= board[0].length) return false;
		 if(occupy[x][y] == 1) {
			 return false;
		 }
		 if(board[x][y] != word.charAt(0)) return false;
		 if(word.length() == 1) return true;
		 occupy[x][y] = 1;
		 
		 if(x != 0){
			 //can search up
			 int o2[][] = occupy.clone();
			 if(rec(board,o2,word.substring(1),x - 1,y,x,y))
				 return true;
		 }
		 
		 if(y != 0){
			 int o2[][] = occupy.clone();
			 if(rec(board,o2,word.substring(1),x,y - 1,x,y))
				 return true;
		 }
		 
		 if(x != board.length - 1){
			 int o2[][] = occupy.clone();
			 if(rec(board,o2,word.substring(1),x + 1,y,x,y))
				 return true;
		 }
		 if(y != board[0].length - 1){
			 int o2[][] = occupy.clone();
			 if(rec(board,o2,word.substring(1),x,y + 1,x,y))
				 return true;
		 }
		 
		 return false;
	 }
	 public static void main(String []args){
		 /*char [][]board = { {'A','B','C','E'},
				 			{'S','F','C','S'},
				 			{'A','D','E','E'}};
		 */
		 /*char [][]board = {{'a','a'}};
		 */
		/* char [][]board = { {'C','A','A'},
				 			{'A','A','A'},
				 			{'B','C','D'}};
		 */
		 char [][]board = { {'A','B','C','E'},
				 			{'S','F','E','S'},
				 			{'A','D','E','E'}};
		 System.out.println(exist(board,"ABCESEEEFS"));
	 }
}
