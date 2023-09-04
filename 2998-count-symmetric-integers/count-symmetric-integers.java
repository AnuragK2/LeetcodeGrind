class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int res=0;
        for(int i=low;i<=high;i++){
            if(istrue(i))
            res++;
        }
        return res;
    }
    public boolean istrue(int num){
        String s=Integer.toString(num);
        int n=s.length();
        if(n%2==1){
            return false;
        }
        int leftsum=0;
        int rightsum=0;
        for(int i=0;i<n/2;i++){
            leftsum+=s.charAt(i)-'0';
            rightsum+=s.charAt(n-i-1)-'0';
        }
        return leftsum==rightsum;
    }
}