class Solution {
    public int tribonacci(int n) {

        //TABULATION
        // if(n < 3)   return n == 0 ? 0 : 1;
        // int[] res = new int[n+1];
        // res[0] = 0;
        // res[1] = 1;
        // res[2] = 1;
        // // this array res will store the tribonacci values as fasten up the process, it is special property of DP
        // for(int i = 3; i <= n; i++)
        //     res[i] = res[i-1] + res[i-2] + res[i-3];
        // return res[n];

        // MEMOIZATION
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return solve(n,dp);
    }
    public static int solve(int n, int[] dp){
        if(n==0){
            return 0;
        }
        if(n==1||n==2){
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        return dp[n]=solve(n-1,dp)+solve(n-2,dp)+solve(n-3,dp);
    }

}