//228A
import java.util.*;
public class horse 
{
    public static void main(String[] args) {
        Scanner so=new Scanner(System.in);
        
        int a[]=new int[4];
        for(int i=0;i<4;i++)
            a[i]=so.nextInt();
        Set <Integer> set=new HashSet<Integer>();
        for(int i:a)
        {
            set.add(i);
        }
        System.out.println(4-set.size());
        so.close();
    } 
}
