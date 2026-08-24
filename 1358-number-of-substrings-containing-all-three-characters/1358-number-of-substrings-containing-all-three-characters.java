class Solution {
    public int numberOfSubstrings(String s) {

        int[] freq = new int[3];

        int left = 0;
        int count = 0;

        for (int right = 0; right < s.length(); right++) {

            int index = s.charAt(right) - 'a';
            freq[index]++;

            while (freq[0] >= 1 && freq[1] >= 1 && freq[2] >= 1) {

                count += s.length() - right;

                freq[s.charAt(left) - 'a']--;
                left++;
            }
        }

        return count;
    }
}