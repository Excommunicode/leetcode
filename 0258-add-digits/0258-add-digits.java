class Solution {
    public int addDigits(int num) {
        String s = String.valueOf(num);
        int x = 0;
        int y = 0;
        while (x < s.length()) {
            y += Integer.parseInt(String.valueOf(s.charAt(x)));
            x++;
        }
        return y > 9 ? addDigits(y) : y;
    }
}
