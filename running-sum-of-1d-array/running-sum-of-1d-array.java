class Solution {
    public int[] runningSum(int[] nums) {
        int[] sumNums = new int[nums.length];
        sumNums[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            sumNums[i] = nums[i] + sumNums[i - 1];
        }
        return sumNums;
    }
}