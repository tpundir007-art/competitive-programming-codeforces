//339A
import java.util.*;
public class xeniamaths 
{
    public static void main(String[] args) {
        Scanner so=new Scanner(System.in);
        String s=so.next();
        String c[]=s.split("\\+");//we use regex for a better logic..
        Arrays.sort(c);
        String r=String.join("+",c);
        System.out.println(r);
        so.close();
    }
    
}
//other method
//iterate through the string..look for + ..create an array..sort it.. join them again..
// basically we are increasing the workload of spliiting if we didn't know the regex

