import java.util.LinkedList;

public class JCF_LL {
    public static void main(String args[]) {
        // Create
        LinkedList<Integer> ll = new LinkedList<>();

        // add
        ll.addFirst(1);
        ll.addLast(3);
        ll.add(1, 2);

        // remove
        ll.removeFirst();

        System.out.println(ll);
    }
}
