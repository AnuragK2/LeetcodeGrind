class Solution {

    Integer memo[][][];

    public int cherryPickup(int[][] grid) {
        int rows=grid.length;
        int cols=grid[0].length;
        memo=new Integer[rows+1][cols+1][cols+1];
        return helper(grid,0,0,cols-1);
    }
    public int helper(int[][] grid,int currRow,int acol, int bcol){
        if(acol<0 || bcol<0 || acol>=grid[0].length || bcol>=grid[0].length) return 0;
        if(currRow==grid.length) return 0;
        if(memo[currRow][acol][bcol]!=null)
        return memo[currRow][acol][bcol];
        int res=0;
        res+=grid[currRow][acol];
        res+=grid[currRow][bcol];
        int max=0;
        for(int i=acol-1;i<=acol+1;i++){
            for(int j=bcol-1;j<=bcol+1;j++){
                if(i<j){
                    max=Math.max(max,helper(grid,currRow+1,i,j));
                }
            }
        }
        res+=max;
        return memo[currRow][acol][bcol]=res;
    }
    // public int helper(int[][] grid,int currRow, int acol,int bcol){
    //     if(acol<0 || bcol<0 || acol>=grid[0].length || bcol>=grid[0].length) return 0;
    //     if(currRow==grid.length) return 0;
    //     int res=0;
    //     res+=grid[currRow][acol];
    //     res+=grid[currRow][bcol];
    //     int max=0;
    //     for(int i=acol-1;i<=acol+1;i++){
    //         for(int j=bcol-1;j<=bcol+1;j++){
    //             if(i<j){
    //                 max=Math.max(max,helper(grid,currRow+1,i,j));
    //             }
    //         }
    //     }
    //     res+=max;
    //     return res;
    // }


}