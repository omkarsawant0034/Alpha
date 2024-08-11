public class detectLoop {

    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static Node Head;

    public void printAll() {
        Node temp = Head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.err.print("null");
    }

    public boolean detectCycle() {
        Node slow = Head;
        Node fast = Head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {

        detectLoop ll = new detectLoop();
        Head = ll.new Node(1);
        Head.next = ll.new Node(2);
        Head.next.next = ll.new Node(3);
        Head.next.next.next = ll.new Node(4);
        Head.next.next.next.next = Head.next;
        System.out.println(ll.detectCycle());
        // ll.printAll();
    }
}
