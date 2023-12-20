class Solution {
    public int buyChoco(int[] prices, int money) {
         int minCost=Integer.MAX_VALUE;
        int n=prices.length;

        for(int i=0;i<n-1;i++) {
            for(int j=i+1;j<n;j++) {
                int totalCost=prices[i]+prices[j];
                if(totalCost<=money) {
                    minCost=Math.min(minCost, totalCost);
                }
            }
        }

        if(minCost>money) {
            return money;
        }else{
            return money-minCost;
        }
    }
}