package bag;

import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;

class Bag implements Collectible {
    private Node first;
    private int n; // number of nodes
    private int total; // total number of words in this bag


    // Implement a constructor
    // public Bag() { ...


    // Implement Collectible interface methods here

    public Bag() {
        first = null;
        n = 0;
        total = 0;
    }

    public boolean isEmpty() {
        return first == null;
    }
    
    public int uniqueSize() {
      return n;
    }

    public int size() {
        return total;
    }

    public void add(String item) {
        boolean distinct = true;
        for (Obliterator i = iterator(); i.hasNext(); ) {
            Node current = i.next();
            if (current.item.equals(item)) {
                distinct = false;
                current.count++;
                break;
            }
        }
        if (distinct) {
            Node oldfirst = first;
            first = new Node(oldfirst, item, 1);
            n++;
        }
        total++;
    }

    /* public int uniqueSize() { */
    /*   throw new UnsupportedOperationException(); // not a thing, this throws an exception */
    /* } */

    public Obliterator iterator() {
        return new BagIterator(first);  
    }

    class BagIterator implements Obliterator {
        private Node current;

        public BagIterator(Node first) {
            current = first;
        }

        public boolean hasNext() { 
            return current != null;  
        }

        public void remove() {
            throw new UnsupportedOperationException();  // you don't need to implement this
        }

        public Node next() {
            if (!hasNext()) throw new NoSuchElementException();
            Node node = current;
            current = current.next; 
            return node;
        }
    }


    public static void main(String[] args) throws IOException {
        Bag bag = new Bag();
        Scanner s = null;
        try {
            s = new Scanner(System.in);
            while (s.hasNext()) {
                String item = s.next(); // Scanner splits input on whitespace, by default
                bag.add(item);
            }
        } finally {
            if (s != null) {
                s.close();
            }
        }

        // Print bag size and distinct contents
        System.out.format("Total number of words: %d\n", bag.size());
        System.out.format("Unique number of words: %d\n", bag.uniqueSize());

        // Print distinct words in bag and their frequency
        for (Obliterator i = bag.iterator(); i.hasNext(); ) {
            Node node = i.next();
            System.out.format("%s %d\n", node.item, node.count);
        }
    }

}
