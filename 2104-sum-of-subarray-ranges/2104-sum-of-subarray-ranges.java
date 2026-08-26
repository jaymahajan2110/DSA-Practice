class Solution {
    public long subArrayRanges(int[] nums) {

        long min_ans = 0;
        long max_ans = 0;

        Stack<Integer> stack = new Stack<>();

        // Sum of subarray minimums
        for (int i = 0; i <= nums.length; i++) {

            while (!stack.isEmpty() &&
                   (i == nums.length || nums[stack.peek()] > nums[i])) {

                int mid = stack.pop();

                int left = stack.isEmpty() ? -1 : stack.peek();
                int right = i;

                long leftChoices = mid - left;
                long rightChoices = right - mid;

                min_ans += (long) nums[mid] * leftChoices * rightChoices;
            }

            if (i < nums.length) {
                stack.push(i);
            }
        }

        stack.clear();

        // Sum of subarray maximums
        for (int i = 0; i <= nums.length; i++) {

            while (!stack.isEmpty() &&
                   (i == nums.length || nums[stack.peek()] < nums[i])) {

                int mid = stack.pop();

                int left = stack.isEmpty() ? -1 : stack.peek();
                int right = i;

                long leftChoices = mid - left;
                long rightChoices = right - mid;

                max_ans += (long) nums[mid] * leftChoices * rightChoices;
            }

            if (i < nums.length) {
                stack.push(i);
            }
        }

        return max_ans - min_ans;
    }
}