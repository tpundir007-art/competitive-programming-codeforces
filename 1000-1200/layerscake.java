// contest problem - 29th december problem B
import java.util.*;

public class layerscake {
    public static void main(String[] args) {
        Scanner so = new Scanner(System.in);
        int t = so.nextInt();

        while (t-- > 0) {
            long a = so.nextLong();
            long b = so.nextLong();

            int res = 0;

            // whiteee startt
            boolean x = true;
            int layer = 0;
            long size = 1;
            long w = a;
            long d = b;

            while (true) {
                if (x) {
                    if (w < size) break;
                    w -= size;
                } else {
                    if (d < size) break;
                    d -= size;
                }
                layer++;
                size *= 2;
                x = !x;
            }
            res = layer;

            // let's start with darkk chocolatee
            x = false;
            layer = 0;
            size = 1;
            w = a;
            d = b;

            while (true) {
                if (x) {
                    if (w < size) break;
                    w -= size;
                } else {
                    if (d < size) break;
                    d -= size;
                }
                layer++;
                size *= 2;
                x = !x;
            }

            res = Math.max(res, layer);
            System.out.println(res);
            so.close();
        }
    }
}
 

