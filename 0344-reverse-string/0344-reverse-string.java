class Solution {
    public void reverseString(char[] s) {
        List<Character> reversed = new ArrayList<>();
        for (char c : s) {
            reversed.add(c);

        }
        List<Character> reversed1 = reversed.reversed();

        for (int i = 0; i < s.length; i++) {
            s[i] = reversed1.get(i);
        }
    }
}