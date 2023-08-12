class Solution {
    public int climbStairs(int n) {
        return solve(new int[n+1],n);
    }
    int solve(int dp[],int n){
        if(n==0 || n==1){
            return 1;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        dp[n]=solve(dp,n-1)+solve(dp,n-2);
        return dp[n];
    }
}