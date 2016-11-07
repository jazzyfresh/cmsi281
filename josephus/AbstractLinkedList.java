public abstract class AbstractLinkedList implements Collectible {
    Node first;
    int n;

    public AbstractLinkedList() {
        first = null;
        n = 0;
    }
    
    public AbstractLinkedList(String[] elements) {
        first = null;
        n = 0;
        for (int i = elements.length - 1; i >= 0; i--) {
            if (elements[i] != null) {
                // take advantage of your own add() method
                // to make this constructor
                add(elements[i]);
            }
        }
    }

    public void add(String s) {
        Node newFirst = new Node(first, s);
        first = newFirst;
        n++;
    }


    class Node {
        Node next;
        String value;

        public Node(Node next, String value) {
            this.next = next;
            this.value = value;
        }
    }

}
