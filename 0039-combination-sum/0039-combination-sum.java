class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();

        Answer(candidates, target, 0, 0,
               new ArrayList<>(), result);

        return result;
    }

    static void Answer(int[] candidates, int target,
                       int index, int sum,
                       List<Integer> current,
                       List<List<Integer>> result) {

        if (sum == target) {
            result.add(new ArrayList<>(current));
            return;
        }

        if (index == candidates.length || sum > target) {
            return;
        }

        // Take the current element
        current.add(candidates[index]);

        Answer(candidates, target, index,
               sum + candidates[index],
               current, result);

        // Backtrack
        current.remove(current.size() - 1);

        // Don't take the current element
        Answer(candidates, target, index + 1,
               sum, current, result);
    }
}