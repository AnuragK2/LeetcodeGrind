class Solution {
    public boolean canBeEqual(String s1, String s2) {
        char[] ch=s1.toCharArray();
        if(s1.equals(s2)){
            return true;
        }
        for(int i=0;i<2;i++){
            if(ch[i]==s2.charAt(i+2)){
                char tmp=ch[i];
                ch[i]=ch[i+2];
                ch[i+2]=tmp;
            }
            if(String.valueOf(ch).equals(s2)){
                return true;
            }
        }
        return false;
    }
}