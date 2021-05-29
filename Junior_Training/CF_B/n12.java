import java.util.*;

public class n12 {

    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
		
		String str=s.next();
		int t,c=0;
		
        while(str.length()>1){
            t=0;
            for(int i=0;i<str.length(); i++){
                t += str.charAt(i) - '0';
            }
            str = t + "";
            c++;
        }
		
		System.out.println(c);
    }
}