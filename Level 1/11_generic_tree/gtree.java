import java.util.*;

public class gtree {

    public static class Node {
        int data;
        ArrayList<Node> children;

        public Node(int data) {
            this.data = data;
            this.children = new ArrayList<>();
        }
    } 

    public static void display(Node node) {
        // our work
        String str = node.data + " -> ";
        for (Node child : node.children) {
            str += child.data + ", ";
        }
        str += ".";
        System.out.println(str);
        // faith
        for (Node child : node.children) {
            display(child);
        }
    }

    public static Node construct(Integer[] data) {
        Node root = null;

        Stack<Node> st = new Stack<>();
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                st.pop();
            } else {
                //  make a new node
                Node nn = new Node(data[i]);
                // push into the children of stack top node
                if (st.size() > 0) {
                    st.peek().children.add(nn);
                } else {
                    root = nn;
                }
                // push into stack
                st.push(nn);
            }
        }
        return root; 
    }


    public static void fun() {
        Integer[] data = {10, 20, 50, null, 60, null, null, 30, 70, null, 80, 110, null,
             120, null, null, 90, null, null, 40, 100, null, null, null};
        Node root = construct(data);
        display(root);
    }

    public static void main(String args[]) {
        fun();
    }
}