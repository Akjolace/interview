/*
#39.
Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.

The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the frequency of at least one of the chosen numbers is different.

It is guaranteed that the number of unique combinations that sum up to target is less than 150 combinations for the given input.
 */

public class CombinationSum{
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<>();
        backtrack(list, temp, candidates, target, 0);
        return list;
    }

    public void backtrack(List<List<Integer>> list, List<Integer> temp, int[] candidates, int target, int index){
        if(target == 0){
            list.add(new ArrayList<>(temp));
        }
        if(target < 0){
            return;
        }
        for(int i = index; i < candidates.length; i++){
            if(candidates[i] > target){
                continue;
            }
            temp.add(candidates[i]);
            backtrack(list, temp, candidates, target - candidates[i], i);
            temp.remove(temp.size() - 1);
        }
    }
}