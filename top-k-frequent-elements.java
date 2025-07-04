class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        LinkedHashMap <Integer, Integer> m = new LinkedHashMap<>();
        for(int i : nums)
            m.put(i,m.getOrDefault(i,0) + 1);
        PriorityQueue <Integer> heap = new PriorityQueue<>((a,b) -> m.get(b) - m.get(a));
        for(int key : m.keySet())
            heap.add(key);
        int res[] = new int[k];
        for(int i=0;i<k;i++)
        {
            res[i] = heap.poll();
        }
        return res;
    }
}
