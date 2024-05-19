import java.util.HashSet;
import java.util.Set;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int num : nums) {
            uniqueNumbers.add(num);
        }
        return uniqueNumbers.size() != nums.length;
    }
}