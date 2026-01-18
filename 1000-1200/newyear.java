import java.util.*;
//29th dec A
public class newyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            boolean bad = false;
            for (int i = 0; i + 3 < n; i++)
                if (s.charAt(i)=='2' && s.charAt(i+1)=='0' && s.charAt(i+2)=='2' && s.charAt(i+3)=='5')
                    bad = true;
            if (!bad) 
            { 
                System.out.println(0); 
                continue; 
            }

            int ans = 10; // max edits that can be done is less than equal to 4
            for (int i = 0; i + 3 < n; i++) {
                int c = 0;
                if (s.charAt(i) != '2')
                     c++;
                if (s.charAt(i+1) != '0') 
                    c++;
                if (s.charAt(i+2) != '2') 
                    c++;
                if (s.charAt(i+3) != '6')
                     c++;
                if (c < ans) ans = c;
            }

            int cnt = 0;
            for (int i = 0; i + 3 < n; i++)
                if (s.charAt(i)=='2' && s.charAt(i+1)=='0' && s.charAt(i+2)=='2' && s.charAt(i+3)=='5') {
                    cnt++;
                    i += 3;
                }
            if (cnt < ans) 
                ans = cnt;
            System.out.println(ans);
            sc.close();
        }
    }
}

