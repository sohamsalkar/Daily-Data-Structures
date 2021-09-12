import java.util.*;

class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class LL {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) // 1 3 5 // 0 2 4 7 8 9
    {
        ListNode res = new ListNode(-1);
        ListNode x = res;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                x.next = l1;
                l1 = l1.next;
            } else {
                x.next = l2;
                l2 = l2.next;
            }
            x = x.next;
        }
        if (l1 != null) {
            x.next = l1;
        } else if (l2 != null) {
            x.next = l2;
        }
        return res.next;
    }

    static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {

        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(3);
        head1.next.next = new ListNode(5);

        ListNode head2 = new ListNode(0);
        head2.next = new ListNode(1);
        head2.next.next = new ListNode(2);
        head2.next.next.next = new ListNode(5);
        head2.next.next.next.next = new ListNode(6);
        head2.next.next.next.next.next = head2.next;

        // ListNode mergedhead = mergeTwoLists(head1, head2);
        // printList(mergedhead);
        // countNodes(head2.next);

    }

}
