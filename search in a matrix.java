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
        a[i][j] = s.nextInt();
    }
    int target = s.nextInt();
    int i = 0, j = c - 1;
    while(i < r && j >= 0)
    {
      if(target < a[i][j])
        j--;
      else if(target > a[i][j])
        i++;
      else
      {
        System.out.print("YES");
        return;
      }
    }
    System.out.print("NO");
  }
}
