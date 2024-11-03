class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer[]> letterCountingMap = new HashMap<>();

        for (int i = 0; i < ransomNote.length(); i++) {
            char magazineChar = ransomNote.charAt(i);
            if (!letterCountingMap.containsKey(magazineChar)) {
                Integer[] counts = new Integer[2];
                counts[0] = 0;
                letterCountingMap.put(magazineChar, counts);
            }
            Integer[] counts = letterCountingMap.get(magazineChar);
            if (counts[0] == null) {
                continue;
            }
            counts[0]++;
            letterCountingMap.put(magazineChar, counts);
        }


        for (int i = 0; i < magazine.length(); i++) {
            char magazineChar = magazine.charAt(i);
            if (letterCountingMap.containsKey(magazineChar)) {

                Integer[] counts = letterCountingMap.get(magazineChar);
                if (counts[0] == null) {
                    continue;
                }
                if (counts[1] != null) {
                    counts[1]++;
                } else {
                    counts[1] = 1;
                }

                letterCountingMap.put(magazineChar, counts);
            }
        }

        for (Integer[] value : letterCountingMap.values()) {
            if (Objects.isNull(value[1]) || value[0] > value[1]) {
                return false;
            }
        }

        return true;
    }
}