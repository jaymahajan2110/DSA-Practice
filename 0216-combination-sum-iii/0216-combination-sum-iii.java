class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        Answer(k,n,1,0,new ArrayList<>(),result);
        return result;
    }
    static void Answer(int k , int n ,int index, int sum,List<Integer> curr,List<List<Integer>> result){
        if (sum == n && k == 0){
            result.add(new ArrayList(curr));
            return 
            ;
        }
        if (k<0 || sum>n){
            return;
        }
        for (int i = index ;i<=9 ;i++){
            curr.add(i);
            Answer(k-1,n,i+1,sum+i,curr,result);
            curr.remove(curr.size()-1);
        }
    }
}