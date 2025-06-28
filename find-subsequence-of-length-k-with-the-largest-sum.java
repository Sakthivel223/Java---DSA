class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int s [] = nums.clone();
        Arrays.sort(s);
        LinkedHashMap <Integer,Integer> m = new LinkedHashMap<>(); 
        for(int i = s.length - k; i < s.length; i++)
            m.put(s[i],m.getOrDefault(s[i],0) + 1);

        int res [] = new int[k];
        int idx = 0;
        for(int i : nums)
        {
            if(m.containsKey(i) && m.get(i) > 0)
            {
                res[idx++] = i;
                m.put(i,m.get(i) - 1);
                if(idx == k) break;
            }
        }
        return res;
    }
}
