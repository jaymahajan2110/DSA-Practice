class Solution {
    public boolean predictTheWinner(int[] nums) {
        int n = nums.length;
        Integer[][] dp = new Integer[n][n];

        return score(nums, 0, n - 1, dp) >= 0;
    }

    private int score(int[] nums, int left, int right, Integer[][] dp) {
        if (left == right) {
            return nums[left];
        }

        if (dp[left][right] != null) {
            return dp[left][right];
        }

        int pickLeft = nums[left] - score(nums, left + 1, right, dp);
        int pickRight = nums[right] - score(nums, left, right - 1, dp);

        dp[left][right] = Math.max(pickLeft, pickRight);

        return dp[left][right];
    }
}