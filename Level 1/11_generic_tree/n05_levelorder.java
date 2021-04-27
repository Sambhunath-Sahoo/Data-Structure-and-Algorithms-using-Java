import java.util.*;

public class n05_levelorder {

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

    public static void display(Node node) {
        String str = node.data + " -> ";
        for(int i=0; i<node.children.size(); i++){
            str += node.children.get(i).data +", ";
        }
        str += ".";
        System.out.println(str);
        for(int i=0; i<node.children.size(); i++){
            display(node.children.get(i));
        }
    }

   public static void levelordertraversal(Node node) {
       Queue<Node> q = new ArrayDeque<>();
       q.add(node);

       while(q.size() > 0) {
           Node rn = q.remove();
           System.out.print(rn.data + " ");
           for(Node child: rn.children) {
               q.add(child);
           }
       }
   }


    public static void main(String args[]) {
        Integer[] arr = {10, 20, 50, null, 60, null, null, 30, 70, null, 80, 110, null, 120, null, null, 90, null, null, 40, 100, null, null, null};
        Node root = construct(arr);
        levelordertraversal(root);
    }
}