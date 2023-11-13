class Solution {
    
    public static String sortVowels(String s) {
        PriorityQueue<Character> vowels = new PriorityQueue<>();
        for (char c : s.toCharArray()) {
            if (isVowel(c)) {
                vowels.offer(c);
            }
        }
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (isVowel(c)) {
                result.append(vowels.poll());
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
