class Solution {

    //Recursion

    // public static int solve(List<List<Integer>> triangle,int i,int j){
    //     if(i==triangle.size()-1)
    //     return triangle.get(triangle.size()-1).get(j);
    //     int down=triangle.get(i).get(j)+solve(triangle,i+1,j);
    //     int diagonal=triangle.get(i).get(j)+solve(triangle,i+1,j+1);
    //     return Math.min(down,diagonal);
    // }

    //Memoization

    public static int solve(List<List<Integer>> triangle,int i,int j,int[][] dp){
        if(i==triangle.size()-1){
            return triangle.get(triangle.size()-1).get(j);
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int down=triangle.get(i).get(j)+solve(triangle,i+1,j,dp);
        int diagonal=triangle.get(i).get(j)+solve(triangle,i+1,j+1,dp);
        dp[i][j]=Math.min(down,diagonal);
        return dp[i][j];
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int[][] dp=new int[triangle.size()][triangle.size()];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return solve(triangle,0,0,dp);
    }
}