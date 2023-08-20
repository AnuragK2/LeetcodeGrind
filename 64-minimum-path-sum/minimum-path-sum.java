class Solution {

    //Recursion
    
    // public static int solve(int i,int j,int[][] grid){
    //     if(i==0 && j==0){
    //         return grid[0][0];
    //     }
    //     if(i<0 || j<0){
    //         return (int)Math.pow(10,9);
    //     }
    //     int up=grid[i][j]+solve(i-1,j,grid);
    //     int left=grid[i][j]+solve(i,j-1,grid);
    //     return Math.min(up,left);
    //     }

        //Memoization
    public static int solve(int i,int j,int[][] grid, int[][] dp){
        if(i==0 && j==0){
            return dp[i][j]=grid[0][0];
        }
        if(i<0 || j<0){
            return (int)Math.pow(10,9);
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int up=grid[i][j]+solve(i-1,j,grid,dp);
        int left=grid[i][j]+solve(i,j-1,grid,dp);
        dp[i][j]=Math.min(up,left);
        return dp[i][j];
    }

    public int minPathSum(int[][] grid) {
        // int m=grid.length;
        // int n=grid[0].length;
        // for(int i=1;i<m;i++){
        //     grid[i][0]+=grid[i-1][0];
        // }
        // for(int i=1;i<n;i++){
        //     grid[0][i]+=grid[0][i-1];
        // }
        // for(int i=1;i<m;i++){
        //     for(int j=1;j<n;j++){
        //         grid[i][j]+=Math.min(grid[i-1][j],grid[i][j-1]);
        //     }
        // }
        // return grid[m-1][n-1];
        int i=grid.length;
        int j=grid[0].length;
        int[][] dp=new int[i][j];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return solve(i-1,j-1,grid,dp);
    }
}