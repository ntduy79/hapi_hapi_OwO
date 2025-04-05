//2619. Array Prototype Last
//        Easy
//Companies
//        Hint
//Write code that enhances all arrays such that you can call the array.last() method on any array and it will return the last element. If there are no elements in the array, it should return -1.
//
//You may assume the array is the output of JSON.parse.
//
//
//
//        Example 1:
//
//Input: nums = [null, {}, 3]
//Output: 3
//Explanation: Calling nums.last() should return the last element: 3.
//Example 2:
//
//Input: nums = []
//Output: -1
//Explanation: Because there are no elements, return -1.
//
//
//Constraints:
public class lastElementArr {
    import java.util.List;

    public class ArrayUtils {

        public static <T> T last(List<T> list) {
            if (list == null || list.isEmpty()) {
                return null; // or return -1 or any other value based on your needs
            }
            return list.get(list.size() - 1);
        }

        public static void main(String[] args) {
            // Example usage
            List<Integer> arr = List.of(1, 2, 3);
            System.out.println(last(arr));  // Output: 3

            List<Integer> emptyArr = List.of();
            System.out.println(last(emptyArr));  // Output: null (or -1 if you prefer)
        }
    }

}
