public class zigzagLL {

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

    public Node zigzag(Node Head) {
        // get Mid
        Node mid = getMid(Head);
        Node newHead = mid.next;
        mid.next = null;

        // reverse 2nd Half
        Node prev = null;
        Node curr = newHead;
        Node next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // merge ZigZag
        Node Lhead = Head;
        Node Rhead = prev;

        while (Lhead != null && Rhead != null) {
            Node nextL = Lhead.next;
            Node nextR = Rhead.next;

            Lhead.next = Rhead;
            Rhead.next = nextL;

            Lhead = nextL;
            Rhead = nextR;

        }
        return Head;
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
        zigzagLL ll = new zigzagLL();
        Node Head = ll.new Node(1);
        Head.next = ll.new Node(2);
        Head.next.next = ll.new Node(3);
        Head.next.next.next = ll.new Node(4);
        Head.next.next.next.next = ll.new Node(5);
        ll.zigzag(Head);
        ll.printAll(Head);

    }
}
