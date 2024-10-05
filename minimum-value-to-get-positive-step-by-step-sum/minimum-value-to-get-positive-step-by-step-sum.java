class Solution {
    public int minStartValue(int[] nums) {
        int sum = 1;
        int count = 1;
        int leftIndex = 0;
        while (true) {
            if (leftIndex >= nums.length) {
                return count;
            }

            sum += nums[leftIndex];

            leftIndex++;
            if (sum < 1) {
                count++;
                sum = count;
                leftIndex = 0;
            }




        }
    }
}