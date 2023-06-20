class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n=nums.length;
        int boundary=2*k+1;
        long[] pre=new long[n+1];
        for(int i=0;i<n;i++){
            pre[i+1]=pre[i]+nums[i];
        }
        int res[]=new int[n];
        Arrays.fill(res,-1);
        for(int i=k;i<n-k;i++){
            res[i]=(int)((pre[i+k+1]-pre[i-k])/boundary);
        }
        return res;
    }
}