class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0;
        int max_ans = 0;
        for (int i = 0;i<nums.length;i++){
            if (nums[i] == 1){
                ans++;
            }
            else{
                if (max_ans < ans){
                    max_ans = ans;
                }ans = 0;
            }
            if (max_ans < ans){
                    max_ans = ans;
                }
        }return max_ans;
    }
}