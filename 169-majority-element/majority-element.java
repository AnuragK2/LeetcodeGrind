class Solution {
    public int majorityElement(int[] nums) {
        // Arrays.sort(nums);
        // return nums[nums.length/2];
        HashMap<Integer, Integer> mp=new HashMap<>();
        int res=0;
        for(int it:nums){
            if(!mp.containsKey(it))
            mp.put(it,1);
            else
            mp.put(it,mp.get(it)+1);
            if(mp.get(it)>nums.length/2){
                res=it;
                break;
            }
        }
        return res;
    }
}