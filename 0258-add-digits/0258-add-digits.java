class Solution {
    public int addDigits(int num) {
        String s = String.valueOf(num);
        String[] strings = s.split("");
        int x = 0;
        int y = 0;
        while (x < strings.length) {
            y += Integer.parseInt(strings[x]);
            x++;
        }

        if (y > 9) {
            y = addDigits(y);
        }
        return y;
    }
}
