import java.util.ArrayList;
import java.util.List;

public class ChunkArray {

    /**
     * Splits the input array into chunks of specified size.
     *
     * @param arr  the input array
     * @param size the desired chunk size
     * @return a list of chunks (sublists)
     */
    public static List<List<Integer>> chunk(int[] arr, int size) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i += size) {
            List<Integer> chunk = new ArrayList<>();

            // Add up to 'size' elements, or stop if we reach the end of the array
            for (int j = i; j < i + size && j < arr.length; j++) {
                chunk.add(arr[j]);
            }

            result.add(chunk);
        }

        return result;
    }

    // Optional: main method for testing
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int size = 2;

        List<List<Integer>> chunks = chunk(arr, size);
        System.out.println(chunks); // Output: [[1, 2], [3, 4], [5]]
    }
}
