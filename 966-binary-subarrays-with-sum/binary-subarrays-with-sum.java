class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return solve(nums,goal)-solve(nums,goal-1);
    }
    public static int solve(int[] arr,int goal){
        int ans=0;
        int sum=0;
        int n=arr.length;
        int i=0;
        int j=0;
        while(j<n){
            sum+=arr[j];
            j++;
            while(i<j && sum>goal){
                sum-=arr[i];
                i++;
            }
            ans+=j-i+1;
        }
        return ans;
    }
}