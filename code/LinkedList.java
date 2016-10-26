public class LinkedList {

    class Node {
        Node next;
        String value;

        public Node(Node next, String value) {
            this.next = next;
            this.value = value;
        }
    }

    // instance variables
    Node first;
    int n;

    // construct an empty linked list
    public LinkedList() {
        first = null;
        n = 0;
    }

    public void add(String s) {
        Node newFirst = new Node(first, s);
        first = newFirst;
        n++;
    }

    public String removeFirst() {
        String temp = first.value;
        first = first.next;
        n--;
        return temp;
    }

    // linear search for s and remove it if it exists
    public void removeOne(String s) {
        Node current = first;
        Node prev = null;
        if (first.value.equals(s)) {
            first = first.next;
            n--;
            return;
        }
        while (current != null) {
            if (current.value.equals(s)) {
                prev.next = current.next;
                n--;
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    public void removeAll(String s) {
        throw new UnsupportedOperationException();
    }

}
