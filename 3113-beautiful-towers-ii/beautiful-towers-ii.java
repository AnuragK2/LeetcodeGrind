class Solution {
    public static void prefixsum(List<Integer> arr,double[] presum){
        int n=arr.size();
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr.get(st.peek())>=arr.get(i)){
                st.pop();
            }
            double diffsum=0;
            if(!st.isEmpty()){
                diffsum=((double)arr.get(i)*(i-st.peek()));
                diffsum+=presum[st.peek()];
            }else{
                diffsum=((double)arr.get(i)*(i+1));
            }
            presum[i]=diffsum;
            st.push(i);
        }
    }
    public static void suffixsum(List<Integer> arr, double[] sufsum){
        int n=arr.size();
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr.get(st.peek())>=arr.get(i)){
                st.pop();
            }
            double diffsum=0;
            if(!st.isEmpty()){
                diffsum=((double)arr.get(i)*(st.peek()-i));
                diffsum+=sufsum[st.peek()];
            }else{
                diffsum=((double)arr.get(i)*(n-i));
            }
            sufsum[i]=diffsum;
            st.push(i);
        }
    }
    public long maximumSumOfHeights(List<Integer> maxHeights) {
        int n=maxHeights.size();
        double[] presum=new double[n];
        double[] sufsum=new double[n];
        prefixsum(maxHeights,presum);
        suffixsum(maxHeights,sufsum);
        double maxi=Long.MIN_VALUE;
        for(int i=0;i<n;i++){
            double currsum=((double)presum[i]+sufsum[i])-maxHeights.get(i);
            maxi=Math.max(maxi,currsum);
        }
        return (long)maxi;
    }
}