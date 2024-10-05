class Solution {
    public int[] getAverages(int[] nums, int k) {
        int size = nums.length;
        long[] sumNums = new long[size];
        int[] result = new int[size];
        sumNums[0] = nums[0];

        for (int i = 1; i < size; i++) {
            sumNums[i] = nums[i] + sumNums[i - 1];
        }

        for (int i = 0; i < size; i++) {

            if (i < k || size - i <= k) {
                result[i] = -1;
                continue;
            }


            if (i - k - 1 >= 0) {
                result[i] = (int) ((sumNums[i + k] - sumNums[i - k - 1]) / (k + k + 1));
            } else {
                result[i] = (int) (sumNums[i + k]  / (k + k + 1));
            }



        }
        return result;

    }
}