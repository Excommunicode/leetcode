class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int leftIndex = 0;
        int rightIndex = 0;

        Set<Character> uniqueElements = new HashSet<>();

        while (rightIndex != s.length()) {
            boolean isAdded = false;
            boolean isUniqueIndex = false;
            int size = uniqueElements.size();
            uniqueElements.add(s.charAt(rightIndex));

            if (uniqueElements.size() == size) {
                isUniqueIndex = true;
            }


            if (isUniqueIndex) {
                while (!isAdded) {
                    uniqueElements.remove(s.charAt(leftIndex));
                    isAdded = uniqueElements.add(s.charAt(rightIndex));
                    leftIndex++;
                }
            }
            ans = Math.max(ans, rightIndex - leftIndex + 1);
            rightIndex++;
        }
        return ans;
    }
}