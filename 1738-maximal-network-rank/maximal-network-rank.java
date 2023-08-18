class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
        HashMap<Integer,HashSet<Integer>> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            mp.put(i, new HashSet<Integer>());
        }
        int m=roads.length;
        for(int i=0;i<m;i++){
            mp.get(roads[i][0]).add(roads[i][1]);
            mp.get(roads[i][1]).add(roads[i][0]);
        }
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j)continue;
                int tmp=0;
                if(mp.get(i).contains(j))tmp--;
                tmp+=mp.get(i).size()+mp.get(j).size();
                max=Math.max(tmp,max);
            }
        }
        return max;
    }
}