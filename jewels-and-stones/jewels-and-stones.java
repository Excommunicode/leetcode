class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int ans = 0;
        
        for (int i = 0; i < stones.length(); i++) {
            if (jewels.indexOf(stones.charAt(i)) != -1) {
                ans++;
            }
        }
        return ans;
    }
}