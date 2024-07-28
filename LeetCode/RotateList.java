public class RotateList {

    public class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public Node head;

    // Add First 
    public void AddFirst(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Rotate LL to right by k 
    public void rotateLL(int k) {
        if (head == null || head.next == null) {
            return;
        }
        Node temp = head;
        int length = 1;
        while (temp.next != null) {
            length++;
            temp = temp.next;
        }
        temp.next = head; // Make it circular

        k = k % length;
        int cut = length - k;

        Node cutNode = head;
        for (int p = 1; p < cut; p++) {
            cutNode = cutNode.next;
        }
        head = cutNode.next;
        cutNode.next = null;
    }

    // mergeTwoLists
    public Node mergeTwoLists(Node list1, Node list2) {
        Node dummy = new Node(-1);
        Node current = dummy;

        Node list1ptr = list1;
        Node list2ptr = list2;

        // Merge 
        while (list1ptr != null && list2ptr != null) {
            if (list1ptr.val <= list2ptr.val) {
                current.next = list1ptr;
                list1ptr = list1ptr.next;
            } else {
                current.next = list2ptr;
                list2ptr = list2ptr.next;
            }
            current = current.next;
        }


        if (list1ptr != null) {
            current.next = list1ptr;
        } else {
            current.next = list2ptr;
        }

        return dummy.next; // Return the head of the merged list
    }

    // Print Nodes
    public void printAll() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.print("null\n");
    }

    public static void main(String args[]) {
        RotateList rl1 = new RotateList();
        Node head1 = rl1.new Node(1);
        head1.next = rl1.new Node(3);
        head1.next.next = rl1.new Node(5);

        RotateList rl2 = new RotateList();
        Node head2 = rl2.new Node(2);
        head2.next = rl2.new Node(4);
        head2.next.next = rl2.new Node(6);

        RotateList rl3 = new RotateList();
        rl3.head = rl3.mergeTwoLists(head1, head2);
        rl3.printAll(); 
    }
}
