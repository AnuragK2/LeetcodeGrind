class Solution {

    //Recursive

    // public static int solve(int[] days, int[] costs,int index){
    //     if(index>=days.length){
    //         return 0;
    //     }
    //     int option1=costs[0]+solve(days,costs,index+1);
    //     int i;
    //     for(i=index;i<days.length && days[i]<days[index]+7;i++);
    //     int option2=costs[1]+solve(days,costs,i);
    //     for(i=index;i<days.length && days[i]<days[index]+30;i++);
    //     int option3=costs[2]+solve(days,costs,i);
    //     return Math.min(option1,Math.min(option2,option3));
    // }

    //MEMOIZATION

    public static int solve(int[] days, int[] costs,int index,int[] dp){
        if(index>=days.length){
            return 0;
        }
        if(dp[index]!=-1){
            return dp[index];
        }
        int option1=costs[0]+solve(days,costs,index+1,dp);
        int i;
        for(i=index;i<days.length && days[i]<days[index]+7;i++);
        int option2=costs[1]+solve(days,costs,i,dp);
        for(i=index;i<days.length && days[i]<days[index]+30;i++);
        int option3=costs[2]+solve(days,costs,i,dp);
        int ans=Math.min(option1,Math.min(option2,option3));
        return dp[index]=ans;
    }
    public int mincostTickets(int[] days, int[] costs) {
        int[] dp=new int[days.length+1];
        Arrays.fill(dp,-1);
        return solve(days,costs,0,dp);
    }
}