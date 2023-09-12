class Solution {
    public int minDeletions(String s) {
        HashMap<Character, Integer> mp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(mp.containsKey(s.charAt(i))){
                mp.put(s.charAt(i),mp.get(s.charAt(i))+1);
            }else{
                mp.put(s.charAt(i),1);
            }
        }
        int cnt=0;
        HashSet<Integer> st=new HashSet<>();
        for(Character it:mp.keySet()){
            int val=mp.get(it);
            while(val>0 && st.contains(val)){
                cnt++;
                val--;
            }
            st.add(val);
        }
        return cnt;
    }
}