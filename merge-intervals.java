class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(it -> it[0]));
        ArrayList<int []> res = new ArrayList<>();
        int [] newinterval = intervals[0];
        res.add(newinterval);
        for(int [] i : intervals)
        {
            if(i[0] <= newinterval[1])
                newinterval[1] = Math.max(i[1],newinterval[1]);
            else
            {
                newinterval = i;
                res.add(newinterval);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}
