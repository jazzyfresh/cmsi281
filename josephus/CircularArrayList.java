public class CircularArrayList extends AbstractArrayList implements CircularCollectible {

    public CircularArrayList() {
        super();
    }

    public CircularArrayList(String[] elements) {
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
      return elements[0];
    }

    public CircularIterator iterator() {
        return new CircularArrayListIterator();
    }

    class CircularArrayListIterator implements CircularIterator {

        public CircularArrayListIterator() {
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
