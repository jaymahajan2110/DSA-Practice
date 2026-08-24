class Solution {
    public int maxScore(int[] cardPoints, int k) {

        int n = cardPoints.length;
        int windowSize = n - k;

        int total = 0;

        for (int num : cardPoints) {
            total += num;
        }

        // If k == n, take all cards
        if (windowSize == 0) {
            return total;
        }

        // Sum of first window
        int windowSum = 0;

        for (int i = 0; i < windowSize; i++) {
            windowSum += cardPoints[i];
        }

        int minWindow = windowSum;

        // Sliding window
        for (int right = windowSize; right < n; right++) {

            windowSum += cardPoints[right];
            windowSum -= cardPoints[right - windowSize];

            minWindow = Math.min(minWindow, windowSum);
        }

        return total - minWindow;
    }
}