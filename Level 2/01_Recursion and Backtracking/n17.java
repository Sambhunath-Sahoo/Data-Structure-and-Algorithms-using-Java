// Words - K Selection - 2
import java.io.*;
import java.util.*;

public class n17 {
    
    public static void generateSelection(String ustr, int cs, int ts, int lc, String asf) {

        if(cs>ts){
            System.out.println(asf);
            return;
        }

        for (int i=lc+1; i<ustr.length(); i++) {
            generateSelection(ustr, cs+1, ts, i, asf+ustr.charAt(i));
        }
    }
    
    
    public static void main(String[] args){
      
      Scanner scn = new Scanner(System.in);

      String str = scn.nextLine();
      int k = scn.nextInt();

      HashSet<Character> unique = new HashSet<>();
      String ustr = "";

      for(char c: str.toCharArray()) {
          if(unique.contains(c)==false) {
              unique.add(c);
              ustr += c;
          }
      }

        generateSelection(ustr, 1, k, -1, "");

    }

}