class Solution {
    public int sumSubarrayMins(int[] arr) {

        long MOD = 1_000_000_007;
        long ans = 0;

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i <= arr.length; i++) {

            while (!stack.isEmpty() &&
                   (i == arr.length || arr[stack.peek()] > arr[i])) {

                int mid = stack.pop();

                int left = stack.isEmpty() ? -1 : stack.peek();
                int right = i;

                long leftChoices = mid - left;
                long rightChoices = right - mid;

                long contribution =
                    (long) arr[mid] * leftChoices % MOD * rightChoices % MOD;

                ans = (ans + contribution) % MOD;
            }

            if (i < arr.length) {
                stack.push(i);
            }
        }

        return (int) ans;
    }
}