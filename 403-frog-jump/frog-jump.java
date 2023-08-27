class Solution {
    public boolean canCross(int[] stones) {
        HashMap<Integer, HashSet<Integer>> mp=new HashMap<>();
        for(int i=0;i<stones.length;i++){
            mp.put(stones[i],new HashSet<>());
        }
        mp.get(stones[0]).add(1);
        for(int i=0;i<stones.length;i++){
            int currStone=stones[i];
            HashSet<Integer> jumps=mp.get(currStone);
            for(int jump:jumps){
                int pos=currStone+jump;
                if(pos==stones[stones.length-1]){
                    return true;
                }
                if(mp.containsKey(pos)==true){
                    if(jump-1>0){
                        mp.get(pos).add(jump-1);
                    }
                    mp.get(pos).add(jump);
                    mp.get(pos).add(jump+1);
                }
            }
        }
        return false;
    }
}