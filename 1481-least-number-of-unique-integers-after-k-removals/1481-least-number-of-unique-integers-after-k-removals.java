import java.util.*;

class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr)
            map.put(num, map.getOrDefault(num, 0) + 1);
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(map.values());
        
        int count = map.size(); // Total unique integers
        
        while (!minHeap.isEmpty() && k > 0) {
            int freq = minHeap.poll(); // Get the smallest frequency
            k -= freq; // Remove occurrences of the current integer
            if (k >= 0)
                count--; // Reduce the count of unique integers
        }
        
        return count;
    }
}
