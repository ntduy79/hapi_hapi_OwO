//Given an aray  integers and an integer k, find out whether thể are two disticnt indices i and j
// in the arach such that nums[i] = nums[j] and the absolute difference between i and j is at most k




import java.util.HashMap;

public class containsDuplicatesII {
    public boolean containsNearByDuplicate(int [] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            if(map.containsKey(current) && i - map.get(current) <= k) {
                return true;
            } else {
                map.put(current, i);
            }
        }
        return false;
    }
}
