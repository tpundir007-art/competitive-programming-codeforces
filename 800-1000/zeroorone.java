//https://codeforces.com/problemset/problem/2183/A
import java.util.*;
 
public class zeroorone 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) 
            {
            int n = sc.nextInt();
            int first = sc.nextInt();
            int last = first;
 
            for (int i = 1; i < n; i++) {
                last = sc.nextInt();
            }
 
            if (first == 1 || last == 1) {
                System.out.println("Alice");
            } else {
                System.out.println("Bob");
            }
        }
        sc.close();
    }
}
