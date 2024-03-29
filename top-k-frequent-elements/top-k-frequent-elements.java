class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> mp=new HashMap<>();
        for(int num:nums){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->mp.get(b)-mp.get(a));
        for(int key:mp.keySet()){
            pq.add(key);
        }
        // ArrayList<Integer> ans=new ArrayList<>();
        
        // for(int i=0;i<k;i++){
        //     ans.add(pq.poll());
        // }
        // return ans;
        int ans[] = new int[k];
        for(int i = 0; i < k; i++){
            ans[i] = pq.poll();
        }
        return ans;
    }
}