public class Queue {
  
    class Node {
        Node next;
        String value;

        public Node(Node next, String value) {
            this.next = next;
            this.value = value;
        }
    }

    Node head;
    Node tail;
    int n;

    public Queue() {
        head = null;
        tail = null;
        n = 0;
    }

    public void enqueue(String s) {
        Node newNode = new Node(null, s);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        n++;
    }

    public String dequeue() {
        if (head == null) {   // the queue is empty
            return null;      // so return null
        }
        Node dequeuedNode = head;
        head = head.next;
        n--;
        if (head == null) {   // if head is now null
            tail = null;      // that means the queue has been emptied
        }                     // and tail should be null as well
        return dequeuedNode.value;
    }
}
