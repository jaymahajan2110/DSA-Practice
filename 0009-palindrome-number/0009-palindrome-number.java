class Solution {
    public boolean isPalindrome(int x) {
        String str1 = String.valueOf(x);

        if (str1.charAt(0) == '-') {
            return false;
        }

        int start = 0;
        int end = str1.length() - 1;

        while (start < end) {
            if (str1.charAt(start) != str1.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}