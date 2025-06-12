import java.util.*;
class Main
{
  public static int countsmallerthanequal(int row[], int target)
  {
    int l = 0, r = row.length;
    while(l < r)
    {
      int m = (l + r) / 2;
      if(row[m] <= target)
        l= m + 1;
      else
        r = m;
    }
    return r;
  }
  public static int median(int a[][], int r, int c)
  {
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    for(int i=0;i<r;i++)
    {
      min = Math.min(min,a[i][0]);
      max = Math.max(max,a[i][c - 1]);
    }
    int desired = ((r * c) + 1) / 2;
    while(min  < max)
    {
      int mid = (min + max) / 2;
      int place = 0;
      for(int i=0;i<r;i++)
        place += countsmallerthanequal(a[i],mid);
      if(place < desired)
        min = mid + 1;
      else
        max = mid;
    }
    return max;
  }
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
    System.out.print(median(a,r,c));
  }
}
