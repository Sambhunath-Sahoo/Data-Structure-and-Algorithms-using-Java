import java.util.*;

public class n15 {

    public static void main(String args[]) {
        Scanner scn=new Scanner(System.in);
		
        int n=scn.nextInt();

        String str="ROYGBIV".repeat(n/7);

        int remainder = n%7;

        String arr[]={"", "G", "GB", "YGB", "YGBI", "OYGBI", "OYGBIV"};

        str+=arr[remainder];

        System.out.print(str);
    }
}