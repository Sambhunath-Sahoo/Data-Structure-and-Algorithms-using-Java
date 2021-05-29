import java.util.*;

public class n13 {

    public static void main(String args[]) {
       
		Scanner s=new Scanner(System.in);
		int[] arr=new int[3];
		
        for(int i=0;i<3;i++){
			String str=s.next();
			char[] c=str.toCharArray();
			if(c[1]=='>') arr[c[0]-'A']+=1;
			else arr[c[2]-'A']+=1;
		}
		
        if(arr[0]!=2 && arr[1]!=2 && arr[2]!=2){
            System.out.println("Impossible");
        }
        else{
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					if(i==arr[j]){
						char ch='A';
						ch+=j;
						System.out.print(ch);
						break;
					}
				}
			}
		}
    }
}