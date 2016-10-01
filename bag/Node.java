package bag;

class Node {
    Node next;
    String item;
    int count;

    public Node(Node next, String item, int count) {
        this.next = next;
        this.item = item;
        this.count = count;
    }
}
