import java.util.*;

public class n01{
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int n3 = scn.nextInt();

        int arr[] = { 0, 6, 5, 4, 3, 2, 1};
        System.out.println(arr[n1]+arr[n2]+arr[n3]);
    }
}