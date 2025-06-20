import java.util.*;
class Main
{
  static ArrayList<ArrayList<Integer>> res = new ArrayList<>();
  static ArrayList<Integer> current = new ArrayList<>();
  public static void main(String[] args) 
    {
      try (Scanner s = new Scanner(System.in)) {
          int n = s.nextInt();
          int a[] = new int[n];
          for(int i=0;i<n;i++)
              a[i]  = s.nextInt();
          capturesubset(a, 0, n);
          for(ArrayList<Integer> subset : res)
          {
              System.out.println(subset);
          }
      }
    }
    static void capturesubset(int a[],int i,int n)
    {
        
          if(i == n)
          {
              res.add(new ArrayList<>(current));
              return;
          }
          current.add(a[i]);
          capturesubset(a, i+1, n);
          current.remove(current.size() - 1);
          capturesubset(a, i+1, n);
    }
  }
