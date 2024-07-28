import java.util.HashMap;

public class cpyListWithRandomPtr {
    
    // Definition for a Node.
    class Node {
        int val;
        Node next;
        Node random;
    
        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node head;

    // Method to create a deep copy of the list
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }

        // HashMap to store the mapping of original nodes to their copies
        HashMap<Node, Node> cpyNode = new HashMap<>();
        Node temp = head;

        // First pass: Create a copy of each node and store in the HashMap
        while (temp != null) {
            Node newNode = new Node(temp.val); // Create a new node with the same value
            cpyNode.put(temp, newNode); // Map the original node to the copied node
            temp = temp.next; // Move to the next node
        }

        // Second pass: Assign next and random pointers for the copied nodes
        temp = head; // Reset temp to head
        while (temp != null) {
            Node copiedNode = cpyNode.get(temp); // Get the copied node
            copiedNode.next = cpyNode.get(temp.next); // Set the next pointer
            copiedNode.random = cpyNode.get(temp.random); // Set the random pointer
            temp = temp.next; // Move to the next node
        }

        // Return the head of the copied linked list
        return cpyNode.get(head);
    }

    public static void main(String args[]) {
        // Create an instance of the class
        cpyListWithRandomPtr ll = new cpyListWithRandomPtr();
        
        // Create a list and test the copyRandomList method
        Node head = ll.new Node(1);
        head.next = ll.new Node(2);
        head.next.next = ll.new Node(3);

        // Setting up random pointers
        head.random = head.next.next; // 1 -> 3
        head.next.random = head; // 2 -> 1
        head.next.next.random = head.next; // 3 -> 2

        // Copy the list
        Node copiedListHead = ll.copyRandomList(head);

        // Display the copied list
        Node temp = copiedListHead;
        while (temp != null) {
            System.out.println("Node value: " + temp.val);
            System.out.println("Random pointer points to: " + (temp.random != null ? temp.random.val : "null"));
            temp = temp.next;
        }
    }
}
