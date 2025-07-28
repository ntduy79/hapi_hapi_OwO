/*
Given a string s, rearrange the characters of s so that any two adjacent characters are not the same.
Return any possible rearrangement of s or return "" if not possible.  */


import java.util.PriorityQueue;

public class reorganizeString {
    public String reorganizeString(String s) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        int maxAllowed = (s.length() + 1) / 2;
        for (int c : count) {
            if (c > maxAllowed) return "";
        }

        // Sort characters by frequency
        PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> count[b - 'a'] - count[a - 'a']);
        for (char c = 'a'; c <= 'z'; c++) {
            if (count[c - 'a'] > 0) pq.offer(c);
        }

        char[] result = new char[s.length()];
        int index = 0;

        while (!pq.isEmpty()) {
            char ch = pq.poll();
            int freq = count[ch - 'a'];

            for (int i = 0; i < freq; i++) {
                if (index >= s.length()) index = 1; // move to odd index
                result[index] = ch;
                index += 2;
            }
        }

        return new String(result);
    }
}
