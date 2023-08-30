class Solution {
    public long minimumReplacement(int[] nums) {
        int n=nums.length;
        long ans=0;
        int currmin=nums[n-1];
        for(int i=n-2;i>=0;i--){
                int steps=nums[i]/currmin;
                if((nums[i])%currmin!=0){
                    steps++;
                    currmin=nums[i]/steps;
                }
            ans+=steps-1;
        }
        return ans;
    }
}