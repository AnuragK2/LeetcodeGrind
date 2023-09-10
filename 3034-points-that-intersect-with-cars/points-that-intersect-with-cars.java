class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        HashSet<Integer> st=new HashSet<>();
        for(List<Integer> res:nums){
            for(int i=res.get(0);i<=res.get(1);i++){
                st.add(i);
            }
        }
        return st.size();
    }
}