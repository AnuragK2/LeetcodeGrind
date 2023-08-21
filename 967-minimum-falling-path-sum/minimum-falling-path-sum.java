class Solution {

    //Memoization

    // public static int solve(int i,int j,int m,int[][] matrix,int[][] dp){
    //     if(j<0 || j>=m){
    //         return Integer.MAX_VALUE;
    //     }
    //     if(i==0){
    //         return matrix[0][j];
    //     }
    //     if(dp[i][j]!=-1){
    //         return dp[i][j];
    //     }
    //     int st=solve(i-1,j,m,matrix,dp);
    //     int dl=solve(i-1,j-1,m,matrix,dp);
    //     int dr=solve(i-1,j+1,m,matrix,dp);
    //     return dp[i][j]=Math.min(st,Math.min(dl,dr))+matrix[i][j];
    // }
    public int minFallingPathSum(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int result=Integer.MAX_VALUE;
        int[][] dp=new int[n][m];
        for(int i=0;i<n;i++){
            dp[0][i]=matrix[0][i];
        }
        for(int i=1;i<m;i++){
            for(int j=0;j<n;j++){
                int up=matrix[i][j]+dp[i-1][j],left=matrix[i][j],right=matrix[i][j];
                if(j>0) left+=dp[i-1][j-1];
                else left=(int)Math.pow(10,9);
                if(j<n-1) right+=dp[i-1][j+1];
                else right=(int)Math.pow(10,9);
                dp[i][j]=Math.min(up,Math.min(left,right));
            }
        }
        for(int i=0;i<n;i++){
            result=Math.min(result,dp[m-1][i]);
        }
        return result;
    }
}