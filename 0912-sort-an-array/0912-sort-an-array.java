class Solution {
    public int[] sortArray(int[] nums) {
        if(nums.length <= 1) {
            return nums;
        }
        
        int[] sort = new int[nums.length];

        int[] left = sortArray(Arrays.copyOfRange(nums, 0, nums.length / 2));

        int[] right = sortArray(Arrays.copyOfRange(nums, nums.length / 2, nums.length));

        int leftIdx = 0;
        int rightIdx = 0;
        int retIdx= 0;

        while (leftIdx < left.length && rightIdx < right.length){

            if(left[leftIdx] >= right[rightIdx]){
                sort[retIdx] = right[rightIdx];
                rightIdx++;
            } else {
                sort[retIdx] = left[leftIdx];
                leftIdx++;
            }
            retIdx++;
        }
        while (leftIdx < left.length){
            sort[retIdx] = left[leftIdx];
            leftIdx++;
            retIdx++;
        }
        while (rightIdx < right.length){
            sort[retIdx] = right[rightIdx];
            rightIdx++;
            retIdx++;
        }

        return sort;
    }
}