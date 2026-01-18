//counting number of bits actually

import java.util.Scanner;

public class bacteria 
{
    public static void main(String[] args) {
        Scanner so = new Scanner(System.in);
        int n=so.nextInt();
        System.out.println(Integer.bitCount(n));
        so.close();
    }
    
}
