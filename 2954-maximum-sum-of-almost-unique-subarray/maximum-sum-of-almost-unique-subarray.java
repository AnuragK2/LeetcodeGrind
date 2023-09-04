class Solution {
    public long maxSum(List<Integer> nums, int m, int k) {
        HashMap<Integer, Integer> mp=new HashMap<>();
        long sum=0;
        long tempsum=0;
        for(int i=0;i<k;i++){
            mp.put(nums.get(i),mp.getOrDefault(nums.get(i),0)+1);
            tempsum+=nums.get(i);
        }
        int idx=0;
        if(mp.size()>=m){
            sum=Math.max(sum,tempsum);
        }
        for(int i=k;i<nums.size();i++){
            int freq=mp.get(nums.get(idx));
            if(freq==1)mp.remove(nums.get(idx));
            else if(freq>1) mp.put(nums.get(idx),mp.get(nums.get(idx))-1);
            tempsum-=nums.get(idx);
            tempsum+=nums.get(i);
            idx++;
            mp.put(nums.get(i),mp.getOrDefault(nums.get(i),0)+1);
            if(mp.size()>=m)sum=Math.max(sum,tempsum);
        }
        return sum;
    }
}