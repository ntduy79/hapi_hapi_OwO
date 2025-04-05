import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class emptyObjectNull {
//    2727. Is Object Empty
//            Solved
//    Easy
//            Companies
//    Given an object or an array, return if it is empty.
//
//    An empty object contains no key-value pairs.
//    An empty array contains no elements.
//    You may assume the object or array is the output of JSON.parse.
//
//
//
//            Example 1:
//
//    Input: obj = {"x": 5, "y": 42}
//    Output: false
//    Explanation: The object has 2 key-value pairs so it is not empty.
//            Example 2:
//
//    Input: obj = {}
//    Output: true
//    Explanation: The object doesn't have any key-value pairs so it is empty.
//    Example 3:
//
//    Input: obj = [null, false, 0]
//    Output: false
//    Explanation: The array has 3 elements so it is not empty.
    /**
     * @param {Object|Array} obj
     * @return {boolean}
     */
  import java.util.*;

    public class Utils {

        public static boolean isEmpty(Object obj) {
            if (obj instanceof List<?>) {
                return ((List<?>) obj).isEmpty();
            } else if (obj instanceof Map<?, ?>) {
                return ((Map<?, ?>) obj).isEmpty();
            } else if (obj instanceof Object[]) {
                return ((Object[]) obj).length == 0;
            } else {
                // Optional: throw exception or return true for unsupported types
                return true;
            }
        }

        // Test the method
        public static void main(String[] args) {
            List<Integer> list = new ArrayList<>();
            Map<String, String> map = new HashMap<>();
            String[] array = new String[0];

            System.out.println(isEmpty(list));  // true
            System.out.println(isEmpty(map));   // true
            System.out.println(isEmpty(array)); // true
        }
    }

}
