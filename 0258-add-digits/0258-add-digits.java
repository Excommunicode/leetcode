class Solution {
    public int addDigits(int num) {
        int y = 0;
        String s = String.valueOf(num);
        for (int i = 0; i < s.length(); i++) {
            y += Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        return y > 9 ? addDigits(y) : y;
    }
}
