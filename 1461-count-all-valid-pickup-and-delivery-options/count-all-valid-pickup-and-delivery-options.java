class Solution {
    public static int solve(int n){
        int mod=(int)Math.pow(10,9)+7;
        if(n==1){
            return 1;
        }
        if(n==2){
            return 6;
        }
        long ans=solve(n-1);
        int oddno=2*(n-1)+1;
        long totalperm=(long)(((long)oddno*(oddno+1))/2)%mod;
        return (int)((ans*totalperm)%mod);
    }
    public int countOrders(int n) {
        return solve(n);
    }
}