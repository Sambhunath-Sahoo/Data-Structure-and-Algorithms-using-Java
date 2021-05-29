import java.io.*;
import java.util.*;

public class n01_getSubSequence {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println(gss(str));
    }

    public static ArrayList<String> gss(String str) {
        
        if(str.length()==0){
            ArrayList<String> ans = new ArrayList<>();
            ans.add("");
            return ans;
        }        
        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rr = gss(ros);
        ArrayList<String> mr = new ArrayList<>();
        
        for(String sr: rr) {
            mr.add(sr);
        }
        for(String sr: rr) {
            mr.add(ch+sr);
        }
        return mr;
    }

}