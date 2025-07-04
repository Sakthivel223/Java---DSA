class Solution {
    public String frequencySort(String s) {
        LinkedHashMap <Character,Integer> m = new LinkedHashMap<>();
        for(char c : s.toCharArray())
            m.put(c,m.getOrDefault(c,0) + 1);
        PriorityQueue <Character> q = new PriorityQueue<>((a,b) -> m.get(b) - m.get(a));
        StringBuilder sb = new StringBuilder();
        for(char key : m.keySet()) q.add(key);
        while(!q.isEmpty())
        {
            char key = q.poll();
            for(int i=1;i<=m.get(key);i++)
                sb.append(key);
        }
        return sb.toString();
    }
}
