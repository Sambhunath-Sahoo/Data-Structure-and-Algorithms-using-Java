import java.util.*;
class Main {
    
    public static class ListNode {
        int val = 0;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    // Middle element of a linkedlist(1st mid)
    public static ListNode midNode(ListNode head) {
        if(head==null || head.next==null) return head;
        
        ListNode s = head, f = head;
        while(f.next!=null && f.next.next!=null) {
            s = s.next;
            f=f.next.next;
        }
        return s;
    }

    // Middle element of a linkedlist(2st mid) leetcode
    public static ListNode midNode(ListNode head) {
        if(head==null || head.next==null) return head;
        
        ListNode s = head, f = head;
        while(f!=null && f.next!=null) {
            s = s.next;
            f=f.next.next;
        }
        return s;
    }

    // reverse a linkedlist here
    public static ListNode reverse(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode curr = head;
        ListNode prev = null;
        while (curr != null) {
            ListNode forw = curr.next; // backup

            curr.next = prev; // link

            prev = curr; // move
            curr = forw;
        }
        return prev;
    }

    // is palidrome
     public static boolean isPalindrome(ListNode head) {
       if(head==null || head.next == null) return true;

       ListNode mid = midNode(head);  // got the mid
       ListNode nhead = mid.next;          // new head = mid for 2nd part
       mid.next = null;

       nhead = reverse(nhead);
       
       ListNode c1 = head, c2 = nhead;
       while (c2 != null) {
           if(c1.val != c2.val) {
               return false;
           }

           c1 = c1.next;
           c2 = c2.next;
       }
       return true;
    }




    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        while (n-- > 0) {
            prev.next = new ListNode(scn.nextInt());
            prev = prev.next;
        }

        ListNode head = midNode(dummy.next);
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}