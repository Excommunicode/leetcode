class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> uniqueNumbers = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (uniqueNumbers.containsKey(nums[i])) {
                return true;
            }
            uniqueNumbers.put(nums[i], i);
        }
        return false;
    }
}