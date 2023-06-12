class Solution {
    public List<String> summaryRanges(int[] nums) {
        int n=nums.length;
        List<String> ans=new ArrayList<String>(n);
        for(int i=0;i<n;i++){
            int x=nums[i];
            while(i<n-1 && nums[i]+1==nums[i+1]){
                i++;
            }
            if(x!=nums[i]){
                ans.add(x+"->"+nums[i]);
            }else{
                ans.add(x+"");
            }
        }
        return ans;
    }
}