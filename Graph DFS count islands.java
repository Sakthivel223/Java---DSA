import java.util.*;
class Main
{
  public static void main(String[]args)
  {
    Scanner s = new Scanner(System.in);
    int r = s.nextInt();
    int c = s.nextInt();
    char a[][] = new char[r][c];
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
        a[i][j] = s.next().charAt(0);
    }
    int count = 0;
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
        if(a[i][j] == '1')
        {
          dfs(a,i,j,r,c);
          count++;
        }
    }
    System.out.print(count);
  }
  public static void dfs(char a[][], int i,int j,int r,int c)
  {
    if(i >= r || i < 0 || j >= c || j < 0 || a[i][j] != '1')
      return;
      
    a[i][j] = '#';
    dfs(a,i+1,j,r,c);
    dfs(a,i-1,j,r,c);
    dfs(a,i,j+1,r,c);
    dfs(a,i,j-1,r,c);
  }
}
