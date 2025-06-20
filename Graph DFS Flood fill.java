import java.util.*;
class Main
{
  public static void main(String[]args)
  {
    Scanner s = new Scanner(System.in);
    int r = s.nextInt();
    int c = s.nextInt();
    int a[][] = new int[r][c];
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        a[i][j] = s.nextInt();
      }
    }
    int sr = s.nextInt();
    int sc = s.nextInt();
    int n = s.nextInt();
    int o = a[sr][sc];
    if(o != n)
    {
      dfs(a,sr,sc,o,n);
    }
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
        System.out.print(a[i][j] + " ");
      System.out.println();
    }
  }
  public static void dfs(int a[][],int i,int j,int o,int n)
  {
    if(i >= a.length || i < 0 || j >= a[0].length || j < 0)
      return;
      
    if(a[i][j] != o) return;
      
    a[i][j] = n;
    dfs(a,i+1,j,o,n);
    dfs(a,i-1,j,o,n);
    dfs(a,i,j+1,o,n);
    dfs(a,i,j-1,o,n);
  }
}
