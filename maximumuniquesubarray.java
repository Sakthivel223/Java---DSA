class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet <Integer> set = new HashSet<>();
        int l = 0, r = 0, max = 0, sum = 0;
        while(r < nums.length)
        {
            while(set.contains(nums[r]))
            {
                set.remove(nums[l]);
                sum -= nums[l];
                l++;
            }
            set.add(nums[r]);
            sum += nums[r];
            max = Math.max(max,sum);
            r++;
        }
        return max;
    }
}
