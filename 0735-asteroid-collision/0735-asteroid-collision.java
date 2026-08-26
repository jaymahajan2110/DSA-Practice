class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {

            int current = asteroids[i];
            boolean alive = true;

            while (!stack.isEmpty()
                    && stack.peek() > 0
                    && current < 0) {

                if (Math.abs(stack.peek()) > Math.abs(current)) {

                    alive = false;
                    break;

                } else if (Math.abs(stack.peek()) < Math.abs(current)) {

                    stack.pop();

                } else {

                    stack.pop();
                    alive = false;
                    break;
                }
            }

            if (alive) {
                stack.push(current);
            }
        }

        int[] ans = new int[stack.size()];

        for (int i = stack.size() - 1; i >= 0; i--) {
            ans[i] = stack.pop();
        }

        return ans;
    }
}