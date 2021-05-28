// Words - K Length Words - 1
import java.io.*;
import java.util.*;

public class n18 {

  public static void generationofwords(int cc, String str, int ssf, int ts, Character[] sports) {
      
      if(cc == str.length()){
          if(ssf == ts){
              for(int i=0; i<sports.length; i++){
                  System.out.print(sports[i]);
              }
              System.out.println();
          }
          return;
      }

      char ch = str.charAt(cc);
      for(int i = 0; i <sports.length; i++){
          if(sports[i]==null){
              sports[i] = ch;
              generationofwords(cc+1, str, ssf+1, ts, sports);
              sports[i] = null;
          }
      }
      generationofwords(cc+1, str, ssf+0, ts, sports);
  }
 

  public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        int k = Integer.parseInt(br.readLine());

        HashSet<Character> unique = new HashSet<>();
        String ustr = "";
       
        for (char ch : str.toCharArray()) {
        if (unique.contains(ch) == false) {
            unique.add(ch);
            ustr += ch;
        }
      }

    Character[] sports = new Character[k];
    generationofwords(0, ustr, 0, k, sports);
  }

}