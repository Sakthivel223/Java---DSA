import java.util.*;
class Main
{
  public static void main(String[]args)
  {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int a[] = new int[n];
    for(int i=0;i<n;i++)
      a[i] = s.nextInt();
    int maxsum = a[0], sum = a[0];
    for(int i=1;i<n;i++)
    {
      sum = Math.max(sum + a[i], a[i]);
      maxsum = Math.max(sum,maxsum);
    }
    System.out.print(maxsum);
  }
}
