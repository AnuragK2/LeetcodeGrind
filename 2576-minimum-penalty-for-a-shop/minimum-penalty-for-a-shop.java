class Solution {
    public int bestClosingTime(String customers) {
        int maxi=0;
        int score=0;
        int ans=-1;
        for(int i=0;i<customers.length();i++){
            score+=(customers.charAt(i)=='Y')?1:-1;
            if(score>maxi){
                maxi=score;
                ans=i;
            }
        }
        return ans+1;
    }
}