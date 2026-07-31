class Solution {
    public int[] runningSum(int[] nums) {
        int[] result = new int [nums.length];
        for (int i = nums.length -1;i>=0;i--){
            int sum =0;
            for (int j = i;j>=0;j--){
                sum = sum + nums[j];
                
            }result[i]=sum;
        }return result;
        
    }
}