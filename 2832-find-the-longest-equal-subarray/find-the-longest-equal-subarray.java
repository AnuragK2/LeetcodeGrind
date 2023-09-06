class Solution {
    public int longestEqualSubarray(List<Integer> nums, int k) {
        int maxfreq=0;
        int left=0;
        int n=nums.size();
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int right=0;right<n;right++){
            mp.put(nums.get(right),mp.getOrDefault(nums.get(right),0)+1);
            maxfreq=Math.max(maxfreq,mp.get(nums.get(right)));
            if(right-left+1-maxfreq>k){
                mp.put(nums.get(left),mp.get(nums.get(left))-1);
                left++;
            }
        }
        return maxfreq;
    }
}