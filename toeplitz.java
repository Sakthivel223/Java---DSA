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
    for(int i=0;i<r-1;i++)
    {
      for(int j=0;j<c-1;j++)
      {
        if(a[i][j] != a[i+1][j+1])
        {
          System.out.print("false");
          return;
        }
      }
    }
    System.out.print("true");
}
}
