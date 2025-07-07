class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) 
    {
        List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> curr = new ArrayList<>();
        backtrack(0,curr,candidates,0,res,target);
        return res;    
    }
    private void backtrack(int i,ArrayList<Integer>curr,int[] candidates,int sum, List<List<Integer>> res,int target)
    {
        if(sum == target)
        {
            res.add(new ArrayList<>(curr));
            return;
        }
        if(i >= candidates.length || sum > target)
            return;

        curr.add(candidates[i]);
        backtrack(i,curr,candidates,sum + candidates[i],res,target);
        curr.removeLast();
        backtrack(i + 1,curr,candidates,sum,res,target);
    }
}
