import java.io.*;
import java.util.*;

public class n01_mfc {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }else{
                map.put(ch, 1);
            }
        }
        
        int mf = map.get(str.charAt(0));
        char mfc = str.charAt(0);
        for(Character key: map.keySet()){
            if(mf < map.get(key)){
                mf= map.get(key);
                mfc = key;
            }
        }
        
        System.out.println(mfc);
        
    }

}