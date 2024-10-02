
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int leftIndex = 0;
        int rightIndex = 0;
        int curr = 0;
        double result;

        while (rightIndex - leftIndex != k) {
            curr += nums[rightIndex];
            rightIndex++;
        }
        
        result = (double) curr / k;
        
        if (nums.length == k) {
            return result;
        }

        while (rightIndex < nums.length) {
            
            curr -= nums[leftIndex];
            curr += nums[rightIndex];
            
            rightIndex++;
            leftIndex++;
            
            result = Math.max(result, (double) curr / k);
        }
        return result;


    }
}