public class pushAtBottom {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class Stack {

        public Node Head = null;

        // isEmpty
        public boolean isEmpty() {
            return Head == null;
        }

        // push
        public void push(int data) {

            Node newNode = new Node(data);

            if (isEmpty()) {
                Head = newNode;
                return;
            }

            newNode.next = Head;
            Head = newNode;
        }

        // pop
        public Node pop() {

            if (isEmpty()) {
                return null;
            }

            Node top = Head;
            Head = Head.next;
            return top;
        }

        // peek
        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return Head.data;
        }

        // pushAtBottom 1
        public void pushAtBottom(int data) {
            Node newNode = new Node(data);

            if (isEmpty()) {
                Head = newNode;
                return;
            }

            Node dummy = new Node(-1);
            Node curr = dummy;
            while (!isEmpty()) {
                curr.next = pop();
                curr = curr.next;
            }

            curr.next = newNode;
            Head = dummy.next;
        }

        // pushAtBottom2 (addLast)
        public void pushAtBottom2(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                Head = newNode;
                return;
            }

            Node temp = Head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public static void main(String args[]) {

        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.pushAtBottom2(5);
        s.pushAtBottom2(4);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
