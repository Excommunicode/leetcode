class Solution {
    public boolean isPalindrome(String s) {
        String s1 = s.toLowerCase().replace(" ", "").replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder sss = new StringBuilder(s1);
        String string = sss.reverse().toString();
        return string.equals(s1);
    }
}
