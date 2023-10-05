class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> mp=new HashMap<>();
        List<Integer> ans=new ArrayList<>();
        for(int it:nums){
            mp.put(it,mp.getOrDefault(it,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:mp.entrySet()){
            if(entry.getValue()>n/3){
                ans.add(entry.getKey());
            }
        }
        return ans;
    }
}