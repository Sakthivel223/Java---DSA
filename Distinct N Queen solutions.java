class Solution {
    public int backtrack(int r,int n,boolean cols[],boolean pd[],boolean nd[])
    {
        if(r == n)
            return 1;
        int count = 0;
        for(int c=0;c<n;c++)
        {
            int p = r + c;
            int nn = (r - c) + (n - 1);
            if(cols[c] || pd[p] || nd[nn]) 
                continue;
            cols[c] = pd[p] = nd[nn] = true; 
            count += backtrack(r + 1,n,cols,pd,nd);
            cols[c] = pd[p] = nd[nn] = false; 
        }
        return count;
    }
    public int totalNQueens(int n) {
       boolean cols[] = new boolean[n];
       boolean pd[] = new boolean[2 * n - 1];
       boolean nd[] = new boolean[2 * n - 1];
       return backtrack(0,n,cols,pd,nd);
    }
}
