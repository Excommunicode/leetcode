class Solution {
    public int missingNumber(int[] nums) {
        List<Integer> numbers = new ArrayList<>();
        for (int num : nums) {
            numbers.add(num);
        }
        List<Integer> collect = numbers.stream()
                .sorted()
                .toList();
        int x = 0;
        int i = collect.getFirst();
        if (i == 1) {
            return 0;
        }

        while (i < collect.size()) {
            if (i != collect.get(x)) {
                return i;
            }
            x++;
            i++;
        }
        return i;
    }
}