import java.util.*;
class Main
{
  public static void reverse(int a[],int l, int r)
  {
    while(l < r)
    {
      int t = a[l];
      a[l] = a[r];
      a[r] = t;
      l++;
      r--;
    }
  }
  public static void main(String[]args)
  {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int d = s.nextInt();
    int a[] = new int[n];
    for(int i=0;i<n;i++)
      a[i] = s.nextInt();
    int k = d % n;
    reverse(a,0,k - 1);
    reverse(a,k,n - 1);
    reverse(a,0,n - 1);
    for(int i : a)
      System.out.print(i + " ");
  }
}
