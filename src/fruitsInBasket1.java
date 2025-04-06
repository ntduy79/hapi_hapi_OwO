import java.util.HashMap;
import java.util.Map;

public class Solution {
        public int totalFruit(int[] fruits) {
            // Edge case
            if (fruits == null || fruits.length == 0) {
                return 0;
            }

            int maxLength = 0;
            int left = 0;
            Map<Integer, Integer> basket = new HashMap<>();

            // Use sliding window approach
            for (int right = 0; right < fruits.length; right++) {
                // Add current fruit to basket
                basket.put(fruits[right], basket.getOrDefault(fruits[right], 0) + 1);

                // If we have more than 2 types of fruit, shrink window from left
                while (basket.size() > 2) {
                    basket.put(fruits[left], basket.get(fruits[left]) - 1);
                    if (basket.get(fruits[left]) == 0) {
                        basket.remove(fruits[left]);
                    }
                    left++;
                }

                // Update max length
                maxLength = Math.max(maxLength, right - left + 1);
            }

            return maxLength;
        }
    }
}
