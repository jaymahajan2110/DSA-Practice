class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        Answer(nums,0,new ArrayList<>(),result);
        return result;
    }
    static void Answer(int[] nums,int index,ArrayList<Integer> curr ,List<List<Integer>> result){
        
        result.add(new ArrayList(curr));
        for (int i = index;i<nums.length;i++){
            if (i>index && nums[i]==nums[i-1]){
                continue;
            }
            curr.add(nums[i]);
            Answer(nums,i+1,curr,result);
            curr.remove(curr.size()-1);   
        }
    }
}