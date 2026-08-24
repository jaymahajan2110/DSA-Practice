class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        // Find next greater element for every element in nums2
        for (int i = nums2.length - 1; i >= 0; i--) {

            // Remove elements that cannot be the answer
            while (!stack.isEmpty() && stack.peek() <= nums2[i]) {
                stack.pop();
            }

            // If stack is empty, no greater element exists
            if (stack.isEmpty()) {
                map.put(nums2[i], -1);
            } else {
                map.put(nums2[i], stack.peek());
            }

            // Current element becomes a candidate
            stack.push(nums2[i]);
        }

        // Build answer for nums1
        int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]);
        }

        return ans;
    }
}