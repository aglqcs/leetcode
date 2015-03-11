package leetcode;

public class Spiral_Matrix_II {
	public static int[][] generateMatrix(int n) {
		int [][]k = new int[n][n];
		int direction = 1;
		//      1  
		//   3      2
		//      4
		
		int x = 0;
		int y = 0;
        for(int i = 1;i <= n * n;i ++){
        	//System.out.println(x + " "+y);
        	k[x][y] = i;
        	if(direction == 1){
        		if( y == n - 1 || k[x][y+1] != 0){
        			direction = 2;
        			if(x == n-1 || k[x +1][y] != 0){
        				break;
        			}
        			x ++;
        		}
        		else{
        			y ++;
        		}
        	}
        	else if(direction == 2){
        		if( x == n-1 || k[x + 1][y] != 0){
        			direction = 3;
        			if( y == 0 || k[x][y-1] != 0){
        				break;
        			}
        			y --;
        		}
        		else{
        			x ++;
        		}
        	}
        	else if(direction == 3){
        		if( y == 0 || k[x][y - 1] != 0){
        			direction = 4;
        			if( x == 0 || k[x - 1][y] != 0){
        				break;
        			}
        			x --;
        		}
        		else{
        			y --;
        		}
        	}
        	else if(direction == 4){
        		if( x == 0 || k[x - 1][y] != 0){
        			direction = 1;
        			if( y == n-1 || k[x][y + 1] != 0){
        				break;
        			}
        			y++;
        		}
        		else{
        			x --;
        		}
        	}
        }
        return k;
    }
	public static void main(String []args){
		int n = 7;
	
		int [][]k = generateMatrix(n);
		for(int i = 0;i < n;i ++){
			for(int j = 0;j < n;j ++){
				System.out.print(k[i][j] + " ");
			}
			System.out.println();
		}
	}
}
