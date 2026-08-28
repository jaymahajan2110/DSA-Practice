class Solution {

    public boolean canJump(int[] nums) {

        int farthest = 0;

        for (int i = 0; i < nums.length; i++) {

            // Cannot even reach this index
            if (i > farthest) {
                return false;
            }

            // Update farthest reachable position
            farthest = Math.max(farthest, i + nums[i]);

            // Already reached the last index
            if (farthest >= nums.length - 1) {
                return true;
            }
        }

        return false;
    }
}