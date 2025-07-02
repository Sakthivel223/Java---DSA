class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int res = Integer.MAX_VALUE;
        int l = 0, sum = 0;
        for(int r=0;r<n;r++)
        {
            sum += nums[r];
            while(sum >= target)
            {
                if(r - l + 1 < res)
                    res = r - l + 1;
                sum -= nums[l];
                l++;
            }
        }
        if(res == Integer.MAX_VALUE) return 0;
        else return res;
    }
}
