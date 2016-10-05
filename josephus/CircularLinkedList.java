public class CircularLinkedList extends AbstractLinkedList implements CircularCollectible {

    public CircularLinkedList() {
        super();
    }

    public CircularLinkedList(String[] elements) {
        super(elements);
    }


    public boolean isEmpty() {
        throw new UnsupportedOperationException();
    }

    public int size() {
        throw new UnsupportedOperationException();
    }

    public void add(String s) {
        throw new UnsupportedOperationException();
    }

    public String first() {
        return first.value;
    }

    public CircularIterator iterator() {
        return new CircularLinkedListIterator();
    }

    class CircularLinkedListIterator implements CircularIterator {
        
        public CircularLinkedListIterator() {
            throw new UnsupportedOperationException();
        }

        public boolean hasNext() {
            throw new UnsupportedOperationException();
        }

        public String next() {
            throw new UnsupportedOperationException();
        }

        public void remove(String s) {
            throw new UnsupportedOperationException();
        }

        public String removeKthElement(int k) {
            throw new UnsupportedOperationException();
        }

        public boolean oneElementLeft() {
            throw new UnsupportedOperationException();
        }
    }
}

