class Solution {
    int count = 0, max = 0;
    public int countMaxOrSubsets(int[] nums) {
        for(int i : nums)
            max |= i;
        backtrack(0,nums,0);
        return count;
    }
    public void backtrack(int idx, int nums[], int curr)
    {
        if(idx == nums.length)
        {
            if(curr == max)
                count++;
            return;
        }
        backtrack(idx + 1, nums, nums[idx] | curr );
        backtrack(idx + 1, nums, curr);
    }
}
