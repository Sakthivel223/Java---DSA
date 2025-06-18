import java.util.*;
class Main
{
  static boolean f = false;
  public static void main(String[]args)
  {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    char a[][] = new char[n][n];
    for(char[] row : a)
      Arrays.fill(row,'.');
    HashSet<Integer> cols = new HashSet<>();
    HashSet<Integer> pd = new HashSet<>();
    HashSet<Integer> nd = new HashSet<>();
    backtrack(a,0,n,cols,pd,nd);
    if(!f) System.out.print("-1");
  }
  public static void backtrack(char a[][], int r, int n, HashSet<Integer> cols, HashSet<Integer> pd, HashSet<Integer> nd)
  {
    if(f) return;
    if(r == n)
    {
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n;j++)
      {
        if(a[i][j] == 'Q')
          System.out.print((j + 1) + " ");
      }
    }
      f = true;
      return;
    }
    for(int c = 0; c < n; c++)
    {
      if(cols.contains(c) || pd.contains(r + c) || nd.contains(r - c))
        continue;
      a[r][c] = 'Q';
      cols.add(c);
      pd.add(r + c);
      nd.add(r - c);
      backtrack(a,r + 1, n, cols, pd, nd);
      a[r][c] = '.';
      cols.remove(c);
      pd.remove(r + c);
      nd.remove(r - c);
    } 
  }
}
