import java.util.*;
public class n16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();
        String s=sc.next() , ans="";

		for(int i=0;i<n;i++) {
			if((n-i)%2!=0)
                ans+=s.charAt(i);
			else
                ans=s.charAt(i)+ans;
		}	

		System.out.println(ans);

	}

}