class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder string = new StringBuilder();
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word + " ");
            StringBuilder reverse = reversedWord.reverse();
            string.append(reverse);
        }
        return string.toString().trim();
    }
}