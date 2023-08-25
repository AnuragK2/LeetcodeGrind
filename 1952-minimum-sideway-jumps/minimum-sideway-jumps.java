class Solution {
    public static int solve(int[] obstacles,int currlane,int currpos,int[][] dp){
        int n=obstacles.length-1;
        if(currpos==n){
            return 0;
        }
        if(dp[currlane][currpos]!=-1){
            return dp[currlane][currpos];
        }
        if(obstacles[currpos+1]!=currlane){
            return solve(obstacles,currlane,currpos+1,dp);
        }else{
           int ans=Integer.MAX_VALUE;
           for(int i=1;i<=3;i++){
               if(currlane!=i && obstacles[currpos]!=i){
                   ans=Math.min(ans,1+solve(obstacles,i,currpos,dp));
               }
           }
           return dp[currlane][currpos]=ans; 
        }

    }
    public int minSideJumps(int[] obstacles) {
        int[][] dp=new int[4][obstacles.length];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return solve(obstacles,2,0,dp);
    }
}