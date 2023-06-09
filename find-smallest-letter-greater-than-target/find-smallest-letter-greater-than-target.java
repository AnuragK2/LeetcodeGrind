class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        // int n=letters.length;
        // for(int i=0;i<n;i++){
        //     if(letters[i]>target)
        //     return letters[i];
        // }
        // return letters[0];

        int start=0;
        int end=letters.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(letters[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return letters[start%letters.length];
    }
}