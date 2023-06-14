class Solution {
    public int maxDepth(String s) {
        Stack<String> st=new Stack<>();
        int depth=0;
        int cnt=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                st.push("(");
                cnt++;
            }else if(c==')'){
                st.pop();
                cnt--;
            }
            depth=Math.max(depth,cnt);
        }
        return depth;
    }
}