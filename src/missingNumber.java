//cho 1 mảng có độ dài n
//tìm số missing trong mảng
//
//1) For loop đi qua mảng => sort
//với kí tự nào miss thì in ra kết quả

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

//Solution 1:
public class missingNumber {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int expected = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != expected) {
                return expected;
            }
            expected++;
        }
        return expected;
    }

public int missingNumberSolution2 (int [] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i: nums) {
            set.add(i);
        }
        for (int i = 0; i <= nums.length; i++) {
            if(!set.contains(i)) {
                return i;
            }
        }
        return -1;
    }

public int missingNumberSolution3 (int [] nums) {
            int n = nums.length;
            int sumExpected = n * (n + 1) / 2;  // The expected sum from 0 to n
            int sumActual = 0;

            // Calculate the sum of the numbers in the array
            for (int num : nums) {
                sumActual += num;
            }

            // The missing number is the difference between expected sum and actual sum
            return sumExpected - sumActual;
        }
    }
