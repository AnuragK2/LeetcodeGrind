class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        boolean[] visited=new boolean[n];
        int cnt=0;
        for(int i=0;i<n;i++){
            if(!visited[i]){
                dfs(isConnected,i,visited);
                cnt++;
                
            }
        }
        return cnt;
    }
    private void dfs(int[][]arr,int i,boolean[]visited){
        for(int j=0;j<arr[i].length;j++){
            if(!visited[j]&&arr[i][j]!=0){
                visited[j]=true;
                dfs(arr,j,visited);
            }
        }
    }
}