class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left=1;
        int right=1000000;
        while(left<=right){
            int mid=(left+right)/2;
            long sum=getDivSum(nums,mid);
            if(sum>threshold){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return left;
    }
    
    private long getDivSum(int[] nums,int divisor){
        long sum=0;
        for(int it:nums){
            sum+=(it-1)/divisor+1;
        }
        return sum;
    }
}