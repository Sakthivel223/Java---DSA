class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList <String> res = new ArrayList<>();
        backtrack(0,0,"",n,res);
        return res;
    }
    public void backtrack(int o, int c, String s, int n, ArrayList<String> a)
    {
        if(o == c && o + c == n * 2)
        {
            a.add(s);
            return;
        }
        if(o < n)
            backtrack(o + 1, c, s + "(", n , a);
        if(c < o)
            backtrack(o, c + 1, s + ")", n, a);
    }
}
