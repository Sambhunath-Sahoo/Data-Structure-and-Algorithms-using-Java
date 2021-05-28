// Words - K Selection - 1
import java.io.*;
import java.util.*;

public class n16 {
    
    public static void generateSelection(int idx, String str, int ssf, int ts, String asf) {
        
        if(idx == str.length()){
            if(ssf == ts) {
                System.out.println(asf);
            }
            return;
        }

        generateSelection(idx+1, str, ssf+1, ts, asf+str.charAt(idx));
        generateSelection(idx+1, str, ssf+0, ts, asf);
    }


    public static void main(String[] args) throws Exception {
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

      generateSelection(0, ustr, 0, k, "");

    }

}