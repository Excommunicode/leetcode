class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        String string = "";
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word + " ");
            StringBuilder reverse = reversedWord.reverse();
            string += reverse;
        }
        return string.trim();
    }
}