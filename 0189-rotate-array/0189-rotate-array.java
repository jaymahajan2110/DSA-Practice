
class Solution {
    public void rotate(int[] nums, int k) {

        int n = nums.length;
        if (n == 0) return;

        k = k % n;

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int index = (i + k) % n;
            result[index] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = result[i];
        }
    }
}