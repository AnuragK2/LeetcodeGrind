class Solution {
    public int deleteAndEarn(int[] nums) {
        int n=10001;
        int[] freq=new int[n];
        for(int num:nums){
            freq[num]+=num;
        }
        return solve(freq);
    }
    public int solve(int[] nums){
        int[] dp=new int[nums.length+1];
        Arrays.fill(dp,-1);
        return helper(nums,0,dp);
    }
    private int helper(int[] nums,int idx,int[] dp){
        if(idx>=nums.length)
        return 0;
        if(dp[idx]!=-1)
        return dp[idx];
        return dp[idx]=Math.max(helper(nums,idx+2,dp)+nums[idx],helper(nums,idx+1,dp));
    }
}