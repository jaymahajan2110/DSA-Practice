class Solution {
    public int characterReplacement(String s, int k) {

        int[] freq = new int[26];

        int left = 0;
        int maxFreq = 0;
        int max = 0;

        for (int right = 0; right < s.length(); right++) {

            int index = s.charAt(right) - 'A';

            // Add current character
            freq[index]++;

            // Highest frequency character in the window
            maxFreq = Math.max(maxFreq, freq[index]);

            // Number of replacements needed > k
            while (right - left + 1 - maxFreq > k) {

                freq[s.charAt(left) - 'A']--;

                left++;
            }

            // Current valid window
            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}