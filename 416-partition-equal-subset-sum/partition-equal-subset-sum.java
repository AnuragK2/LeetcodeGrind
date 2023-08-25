class Solution {

    //RECURSION

    // public static boolean solve(int[] nums,int idx,int k){
    //     if(k==0){
    //         return true;
    //     }
    //     if(idx==0){
    //         return nums[0]==k;
    //     }
    //     boolean nottake=solve(nums,idx-1,k);
    //     boolean take=false;
    //     if(nums[idx]<=k){
    //         take=solve(nums,idx-1,k-nums[idx]);
    //     }
    //     return take||nottake;
    // }

    //MEMOIZATION

    public static boolean solveMem(int[] nums,int idx,int k,int[][] dp){
        if(k==0){
            return true;
        }
        if(idx==0){
            return nums[0]==k;
        }
        if(dp[idx][k]!=-1){
            return dp[idx][k]==0?false:true;
        }
        boolean nottake=solveMem(nums,idx-1,k,dp);
        boolean take=false;
        if(nums[idx]<=k){
            take=solveMem(nums,idx-1,k-nums[idx],dp);
        }
        dp[idx][k]=take||nottake?1:0;
        return take||nottake;
    }
    public boolean canPartition(int[] nums) {
        int totalsum=0;
        for(int i=0;i<nums.length;i++){
            totalsum+=nums[i];
        }
        if(totalsum%2==1){
            return false;
        }else{
        int target=totalsum/2;
        int[][] dp=new int[nums.length][target+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return solveMem(nums,nums.length-1,target,dp);
        }
    }
}