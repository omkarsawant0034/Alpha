public class StackLL {

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
        public int pop() {

            if (isEmpty()) {
                return -1;
            }

            int top = Head.data;
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
    }

    public static void main(String args[]) {

        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
