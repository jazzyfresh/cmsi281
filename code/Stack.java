public class Stack {

    class Node {
        Node next;
        String value;

        public Node(Node next, String value) {
            this.next = next;
            this.value = value;
        }
    }

    Node top;
    int n;

    public Stack() {
        top = null;
        n = 0;
    }

    public void push(String s) {
        Node newTop = new Node(top, s);
        top = newTop;
        n++;
    }

    public String pop() {
        Node oldTop = top;
        top = top.next;
        n--;
        return oldTop.value;
    }

    public String peek() {
        return top.value;
    }

}
