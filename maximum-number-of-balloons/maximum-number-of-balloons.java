    class Solution {
        public int maxNumberOfBalloons(String text) {
            Map<Character, Integer> elements = new HashMap<>();
            String balloon = "balloon";
            int minCurrency = Integer.MAX_VALUE;
            int sum = 0;
            for (int i = 0; i < text.length(); i++) {
                if (balloon.indexOf(text.charAt(i)) == -1) {
                    continue;
                }
                elements.put(text.charAt(i), elements.getOrDefault(text.charAt(i), 0) + 1);
            }
    
    
            for (Integer value : elements.values()) {
                sum += value;
                minCurrency = Math.min(minCurrency, value);
            }
    
    
            if (elements.size() == 5) {
                return Math.min(Math.min(elements.get('l'), elements.get('o')) / 2, minCurrency);
            }
    
            return 0;
    
        }
    }