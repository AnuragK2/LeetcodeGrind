class Solution {
    private boolean ispossible(int[] nums,int p, int diff){
        int n=nums.length;
        for(int i=1;i<n;i++){
            if(nums[i]-nums[i-1]<=diff){
                p--;
                i++;
            }
        }
        return p<=0;
    }
    public int minimizeMax(int[] nums, int p) {
        int n=nums.length;
        Arrays.sort(nums);
        int left=0;
        int right=nums[n-1]-nums[0];
        int ans=right;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(ispossible(nums,p,mid)){
                ans=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return ans;
    }
}