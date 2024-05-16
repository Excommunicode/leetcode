class Solution {
    public int searchInsert(int[] nums, int target) {
       int x = 0;
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            if (nums[i] == target) {
                return i;
            } else {
                if (nums[i] > target) {
                    x = i;
                    break;
                }
            }
        }
        if (nums[size -1] < target) {
            x = size;
        }
        return x;
        
    }
}