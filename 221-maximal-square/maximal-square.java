class Solution {

    int maxi=0;

    //Recursion
    // public int solve(char[][] matrix,int i,int j){
    //     if(i>=matrix.length || j>=matrix[0].length)
    //     return 0;
    //     int right=solve(matrix,i,j+1);
    //     int diagonal=solve(matrix,i+1,j+1);
    //     int down=solve(matrix,i+1,j);
    //     int ans=0;
    //     if(matrix[i][j]=='1'){
    //         ans=1+Math.min(right,Math.min(diagonal,down));
    //         maxi=Math.max(maxi,ans);
    //     }else{
    //         return 0;
    //     }
    //     return ans;
    // }
    
    //Memoization
    public int solve(char[][] matrix,int i,int j,int[][] dp){
        if(i>=matrix.length || j>=matrix[0].length){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int right=solve(matrix,i,j+1,dp);
        int diagonal=solve(matrix,i+1,j+1,dp);
        int down=solve(matrix,i+1,j,dp);
        int ans=0;
        if(matrix[i][j]=='1'){
            ans=1+Math.min(right,Math.min(diagonal,down));
            maxi=Math.max(maxi,ans);
        }else{
            return 0;
        }
        return dp[i][j]=ans;
    }

    public int maximalSquare(char[][] matrix) {
        int[][] dp=new int[matrix.length][matrix[0].length];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        solve(matrix,0,0,dp);
        return maxi*maxi;
    }
}