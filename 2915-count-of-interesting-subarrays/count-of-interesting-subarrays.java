class Solution {
    public long countInterestingSubarrays(List<Integer> nums, int modulo, int k) {
        int n=nums.size();
        long arr[]=new long[n+1];
        HashMap<Long,Integer> mp=new HashMap<>();
        arr[0]=0;
        mp.put(0L,1);
        long ans=0;
        for(int i=0;i<n;i++){
            long curr=nums.get(i);
            arr[i+1]=(arr[i]+(curr%modulo==k ?1:0))%modulo;
            long val=(arr[i+1]-k+modulo)%modulo;
            ans+=mp.getOrDefault(val,0);
            mp.put(arr[i+1],mp.getOrDefault(arr[i+1],0)+1);
        }
        return ans;
    }
}