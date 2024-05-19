class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> uniqueNumbers = new HashMap<>();
        for (int num : nums) {
            if (uniqueNumbers.containsKey(num)) {
                return true;
            }
            uniqueNumbers.put(num,num);
        }
        return false;
    }
}