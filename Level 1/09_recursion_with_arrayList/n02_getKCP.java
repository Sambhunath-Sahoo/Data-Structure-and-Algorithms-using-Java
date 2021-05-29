import java.io.*;
import java.util.*;

public class n02_getKCP {

    static String codes[] = {
            ".;",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tu",
            "vwx",
            "yz"
        };

    public static void main(String[] args) throws Exception {
       Scanner scn = new Scanner(System.in);
       String str = scn.nextLine();
       System.out.println(getKPC(str)); 
    }

    public static ArrayList<String> getKPC(String str) {
       
       if(str.length()==0){
          ArrayList<String> ans =  new ArrayList<>();
          ans.add("");
          return ans;
       }

       char ch = str.charAt(0);
       String ros = str.substring(1);
       ArrayList<String> ans = getKPC(ros);
       ArrayList<String> mr = new ArrayList<>();


       String chstr = codes[ch - '0'];
       for(int i=0; i<chstr.length(); i++){
           char chr = chstr.charAt(i);
            for(int j=0; j<ans.size(); j++) {
                mr.add(chr+ans.get(j));
            }
       }
       
    return mr;
    }

}