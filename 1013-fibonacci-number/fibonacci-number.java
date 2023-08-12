class Solution {
    //MEMOIZATION
    // public int solve(int n, int dp[]){
    //     if(n==0 || n==1){
    //         return n;
    //     }
    //     if(dp[n]!=-1){
    //         return dp[n];
    //     }
    //     dp[n]=solve(n-1,dp)+solve(n-2,dp);
    //     return dp[n];
    // }
    // public int fib(int n) {
    //     int[] dp=new int[n+1];
    //     Arrays.fill(dp,-1);
    //     return solve(n,dp);
    // }

    //TABULATION
    public int solve(int n){
        if(n==0)
        return 0;
        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public int fib(int n){
        return solve(n);
    }
}