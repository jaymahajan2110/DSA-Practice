class Solution {

    private int square(int number) {
        int sum = 0;
        while (number > 0) {
            int rem = number % 10;
            sum += rem * rem;
            number /= 10;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = square(slow);
            fast = square(square(fast));
        } while (slow != fast);

        return slow == 1;
    }
}