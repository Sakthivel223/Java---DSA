import java.util.*;
class Main
{
  public static void main(String [] args)
  {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int a[][] = new int[n][n];
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n;j++)
        a[i][j] = s.nextInt();
    }
    for(int i=0;i<n;i++)
    {
      for(int j=n-1;j>=0;j--)
      {
        System.out.print(a[j][i] + " ");
      }
      System.out.println();
    }
  }
}
