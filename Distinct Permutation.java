import java.util.*;
class Main
  {
    public static void main(String[]args)
    {
      Scanner s = new Scanner(System.in);
      String str = s.next();
      HashSet<String> set = new HashSet<>();
      perm(str,"",set);
    }
    public static void perm(String str, String ans, HashSet <String> set)
    {
      if(str.length() == 0)
      {
        if(!set.contains(ans))
        {
          set.add(ans);
          System.out.println(ans);
        }
        return;
    }
      for(int i = 0;i < str.length() ; i++)
        {
          char ch = str.charAt(i);
          String rest = str.substring(0,i) + str.substring(i + 1);
          perm(rest, ans + ch, set);
        }
  }
  }
