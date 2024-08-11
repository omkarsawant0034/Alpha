public class mergeSortLL {

    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public Node getMid(Node Head) {
        Node slow = Head;
        Node fast = Head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node mergeLL(Node head1, Node head2) {
        Node newLL = new Node(-1);
        Node temp = newLL;

        while (head1 != null && head2 != null) {
            if (head1.val <= head2.val) {
                temp.next = head1;
                temp = temp.next;
                head1 = head1.next;
            } else {
                temp.next = head2;
                temp = temp.next;
                head2 = head2.next;

            }
        }

        while (head1 != null) {
            temp.next = head1;
            temp = temp.next;
            head1 = head1.next;
        }

        while (head2 != null) {
            temp.next = head2;
            temp = temp.next;
            head2 = head2.next;
        }

        return newLL.next;
    }

    public Node mergesortLL(Node Head) {

        if (Head == null || Head.next == null) {
            return Head;
        }
        // find mid
        Node mid = getMid(Head);

        Node rightHead = mid.next;
        // divide LL
        mid.next = null;

        Node newLeftLL = mergesortLL(Head);
        Node newRightLL = mergesortLL(rightHead);

        return mergeLL(newLeftLL, newRightLL);
    }

    public void printAll(Node Head) {

        Node temp = Head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public static void main(String args[]) {
        mergeSortLL ll = new mergeSortLL();
        Node Head = ll.new Node(4);
        Head.next = ll.new Node(3);
        Head.next.next = ll.new Node(2);
        Head.next.next.next = ll.new Node(1);
        ll.printAll(Head);
        Head = ll.mergesortLL(Head);
        ll.printAll(Head);

    }
}
