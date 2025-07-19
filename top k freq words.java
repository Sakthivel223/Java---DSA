class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        ArrayList <String> res = new ArrayList<>();
        LinkedHashMap <String,Integer> m = new LinkedHashMap<>();
        for(String i : words)
            m.put(i,m.getOrDefault(i,0) + 1);
        PriorityQueue<String> q = new PriorityQueue<>((a, b) -> 
        {
            if (m.get(a).equals(m.get(b))) 
                return a.compareTo(b); 
            return m.get(b) - m.get(a); 
        });
        int c = 0;
        for(String key : m.keySet())
        {
            q.add(key);
        }
        while(c < k)
        {
            res.add(q.poll());
            c++;
        }
        return res;
    }
}
