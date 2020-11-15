/*
40

Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sum to target.

Each number in candidates may only be used once in the combination.

Note: The solution set must not contain duplicate combinations.
 */

public class CombinationSum2{
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> subList = new ArrayList<Integer>();
        Arrays.sort(candidates);
        backtrack(list, subList, candidates, target, 0);
        return list;
    }

    public void backtrack(List<List<Integer>> list, List<Integer> subList, int[] candidates, int target, int index){
        if(target < 0) {
            return;
        }
        if(candidates[index] > target){
            return;
        }
        for(int i = index; i < candidates.length; i++){
            if(candidates[i] > target){
                continue;
            }
            if(i > index && candidates[i] > candidates[i - 1]){
                continue;
            }
            subList.add(candidates[i]);
            backtrack(list, subList, candidates, target - candidates[i], i + 1);
            subList.remove(subList.size() - 1);
        }
    }
}