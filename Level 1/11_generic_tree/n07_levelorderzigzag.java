import java.util.*;

public class n07_levelorderzigzag {

    public static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static Node construct(Integer arr[]) {

        Stack<Node> st = new Stack<>();
        Node root = new Node();
        root.data = arr[0];
        st.push(root);
        for(int i=1; i<arr.length; i++) {
            if(arr[i]==null){
                st.pop();
            }else{
                Node nn = new Node();
                nn.data = arr[i];
                st.peek().children.add(nn);
                st.push(nn);
            }
        }
        return root;
    }

    public static void levelorderlinewisezigzag(Node root) {
        Stack<Node> mst = new Stack<>();
        Stack<Node> cst= new Stack<>();
        mst.push(root);

        int level = 0;
        while(mst.size() > 0) {
            Node rn = mst.pop();
            System.out.print(rn.data+" ");
            if(level%2==0){
                for(Node child: rn.children) {
                    cst.push(child);
                }
            }else{
                for(int i=rn.children.size()-1; i>=0; i--){
                    cst.push(rn.children.get(i));
                }
            }
            if(mst.size()==0){
                mst = cst;
                cst=new Stack<>();
                System.out.println();
                level++;
            }
        }
    }

    

    public static void main(String args[]) {
        Integer[] arr = {10, 20, 50, null, 60, null, null, 30, 70, null, 80, 110, null, 120, null, null, 90, null, null, 40, 100, null, null, null};
        Node root = construct(arr);
        levelorderlinewisezigzag(root);
    }
}