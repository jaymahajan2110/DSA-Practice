class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(candidates);

        Answer(candidates, target, 0, 0,
               new ArrayList<>(), result);

        return result;
    }

    static void Answer(int[] candidates, int target,
                       int sum, int index,
                       List<Integer> current,
                       List<List<Integer>> result) {

        if (sum == target) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = index; i < candidates.length; i++) {

            // Skip duplicate choices at the same level
            if (i > index && candidates[i] == candidates[i - 1]) {
                continue;
            }

            // Since array is sorted, everything after i is >= candidates[i]
            if (sum + candidates[i] > target) {
                break;
            }

            current.add(candidates[i]);

            Answer(candidates, target,
                   sum + candidates[i],
                   i + 1,
                   current,
                   result);

            current.remove(current.size() - 1);
        }
    }
}