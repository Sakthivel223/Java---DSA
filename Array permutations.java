class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> curr = new ArrayList<>();
        backtrack(nums,res,curr);
        return res;
    }
    private void backtrack(int []nums,List<List<Integer>> res,ArrayList<Integer> curr)
    {
        if(curr.size() == nums.length)
        {
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i : nums)
        {
            if(curr.contains(i))
                continue;
            curr.add(i);
            backtrack(nums,res,curr);
            curr.removeLast();
        }
    }
}
