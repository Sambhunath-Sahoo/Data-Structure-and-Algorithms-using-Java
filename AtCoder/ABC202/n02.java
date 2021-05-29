import java.util.*;

class n02{
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        StringBuilder str1 = new StringBuilder(str);
        str1 = str1.reverse();

        for(int i=0; i < str1.length(); i++){
            if(str1.charAt(i)=='9'){
                System.out.print('6');
            }else if(str1.charAt(i)==('6')){
                System.out.print('9');
            }else{
                System.out.print(str1.charAt(i));
            }
            
        }
    }
}