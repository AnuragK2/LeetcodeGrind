class Solution {
    public static int solve(int[] values,int i,int j,int[][] dp){
        if(i+1==j){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int ans=Integer.MAX_VALUE;
        for(int k=i+1;k<j;k++){
            ans=Math.min(ans,values[i]*values[j]*values[k]+solve(values,i,k,dp)+solve(values,k,j,dp));
        }
        return dp[i][j]=ans;
    }
    public int minScoreTriangulation(int[] values) {
        int[][] dp=new int[values.length][values.length];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return solve(values,0,values.length-1,dp);
    }
}