package leetcode;

public class unique_path_2 {
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        	if(m == 0 || n == 0) return 0;
		int res[][] = new int[m][n];
		if(obstacleGrid[0][0] == 0)
            res[0][0] = 1;
        for(int i = 1;i < m;i ++){
            if(obstacleGrid[i][0] == 0)
        	res[i][0] = res[i-1][0];
        }
        for(int i = 1;i < n;i ++){
            if(obstacleGrid[0][i] == 0)
        	res[0][i] = res[0][i-1];
        }
        for(int i = 1;i < m;i ++){
        	for(int j = 1;j < n;j ++){
        	    if(obstacleGrid[i][j] == 0)
        		res[i][j] = res[i-1][j] + res[i][j -1];
        	}
        }
        return res[m-1][n -1];
    }
}
