class Solution {
    public int missingNumber(int[] nums) {
        // int n=nums.length;
        // int sum=(n*(n+1))/2;
        // for(int i=0;i<n;i++){
        //     sum-=nums[i];
        // }
        // return sum;
        Arrays.sort(nums);
        int left=0, right=nums.length;
        int mid=left+(right-left)/2;
        while(left<right){
            mid=left+(right-left)/2;
            if(nums[mid]>mid)right=mid;
            else left=mid+1;
        }
        return left;
    }
}