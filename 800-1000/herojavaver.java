//236A
import java.util.*;
public class herojavaver {
public static void main(String[] args)
{
    Scanner so=new Scanner(System.in);
    String s=so.next();
    Set <Character> set=new HashSet<Character>();
    for(char ch: s.toCharArray())
    {
        set.add(ch);
    }
   if(set.size()%2==0)
    System.out.println("CHAT WITH HER!");
   else
    System.out.println("IGNORE HIM!");
so.close();
}
}
