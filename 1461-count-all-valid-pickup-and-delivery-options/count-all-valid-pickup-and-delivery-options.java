class Solution {
    public static int solve(int n,int[] dp){
        int mod=(int)Math.pow(10,9)+7;
        if(n==1){
            return 1;
        }
        if(n==2){
            return 6;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        long ans=solve(n-1,dp);
        int oddno=2*(n-1)+1;
        long totalperm=(long)(((long)oddno*(oddno+1))/2)%mod;
        return dp[n]=(int)((ans*totalperm)%mod);
    }
    public int countOrders(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return solve(n,dp);
    }
}