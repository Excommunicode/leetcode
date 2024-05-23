class Solution {
    public boolean isPalindrome(long x) {
        if (x < 0 ){
            return false;
        }
        StringBuilder stringBuilder = new StringBuilder(String.format("%d", x));
        stringBuilder.reverse();
        long a = Long.parseLong(stringBuilder.toString());
        return x == a;
    }
}
