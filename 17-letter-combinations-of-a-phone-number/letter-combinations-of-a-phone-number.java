class Solution {
    public List<String> letterCombinations(String digits) {
        String digitletter[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> ans=new ArrayList<String>();
        if(digits.length()==0)
        return ans;
        ans.add("");
        for(int i=0;i<digits.length();i++){
            ans=combine(digitletter[digits.charAt(i)-'0'],ans);
        }
        return ans;
    }
    public static List<String> combine(String digit,List<String> l){
        List<String> ans=new ArrayList<String>();
        for(int i=0;i<digit.length();i++){
            for(String x:l){
                ans.add(x+digit.charAt(i));
            }
        }
        return ans;
    }
}