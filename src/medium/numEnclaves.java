package medium;
/*给你一个大小为 m x n 的二进制矩阵 grid ，其中 0 表示一个海洋单元格、1 表示一个陆地单元格。
一次 移动 是指从一个陆地单元格走到另一个相邻（上、下、左、右）的陆地单元格或跨过 grid 的边界。
返回网格中 无法 在任意次数的移动中离开网格边界的陆地单元格的数量。

DFS解法
* */
public class numEnclaves {
    public int numEnclaves(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int res = 0;
        boolean[][] flag = new boolean[row][col];
        for(int i =0; i < col;i++){
               if(grid[0][i] ==1 ) dfs(grid,flag,0,i);
               if(grid[row-1][i] ==1 ) dfs(grid,flag,row-1,i);
        }
        for(int i =0; i < row;i++){
            if(grid[i][0] ==1 )dfs(grid,flag,i,0);
            if(grid[i][col-1] ==1 )dfs(grid,flag,i,col-1);
        }
        for(int i= 0;i < row;i++)
            for(int j =0 ;j < col;j++)
            {
                if(grid[i][j] ==1 && flag[i][j] == false)
                    res++;
            }
        return res;
    }

    private void dfs(int[][] grid, boolean[][] flag, int i, int j) {
        if(grid[i][j] ==1 )flag[i][j] =true;
        else
            return;
        if(i <flag.length-1 && grid[i+1][j] == 1 && flag[i+1][j]== false ) dfs(grid, flag,i+1,j);
        if(j<grid[0].length -1 && grid[i][j+1] == 1&& flag[i][j+1]== false)dfs(grid, flag,i,j+1);
        if(i>0 && grid[i-1][j] == 1&& flag[i-1][j]== false) dfs(grid, flag,i-1,j);
        if(j >0 &&grid[i][j-1] == 1&& flag[i][j-1]== false) dfs(grid, flag,i,j-1);
        return;
    }

}
