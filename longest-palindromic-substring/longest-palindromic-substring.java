class Solution {
    private int low, maxlen;
    public String longestPalindrome(String s) {
        int n=s.length();
        if(n<2)
        return s;
        for(int i=0;i<n-1;i++){
            solve(s,i,i);
            solve(s,i,i+1);
        }
        return s.substring(low,low+maxlen);
    }
    private void solve(String s,int j,int k){
        while(j>=0 && k<s.length() && s.charAt(j)==s.charAt(k)){
            j--;
            k++;
        }
        if(maxlen<k-j-1){
            low=j+1;
            maxlen=k-j-1;
        }
    }
}