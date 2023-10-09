class Solution {
    public static int solve(int[] nums1,int[] nums2,int i,int j,int[][] dp){
        if(i>=nums1.length || j>=nums2.length){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int nottake1=solve(nums1,nums2,i+1,j,dp);
        int nottake2=solve(nums1,nums2,i,j+1,dp);
        int take=nums1[i]*nums2[j]+solve(nums1,nums2,i+1,j+1,dp);
        return dp[i][j]=Math.max(nottake1,Math.max(nottake2,take));
    }
    public int maxDotProduct(int[] nums1, int[] nums2) {
        int max1=Integer.MIN_VALUE;
        int min1=Integer.MAX_VALUE;
        int max2=Integer.MIN_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]>max1){
                max1=nums1[i];
            }
        }
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]<min1){
                min1=nums1[i];
            }
        }
        for(int i=0;i<nums2.length;i++){
            if(nums2[i]>max2){
                max2=nums2[i];
            }
        }
        for(int i=0;i<nums2.length;i++){
            if(nums2[i]<min2){
                min2=nums2[i];
            }
        }
        if((max1<0 && min2>0)||(max2<0 && min1>0)){
            return Math.max(max1*min2,max2*min1);
        }
        int[][] dp=new int[nums1.length][nums2.length];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return solve(nums1,nums2,0,0,dp);
    }
}