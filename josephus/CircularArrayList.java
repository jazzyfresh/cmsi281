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

    /** remove(String s):
     *  removes the first element in the list for which
     *      element.equals(s)
     *  is true.
     */
    public void remove(String s) {
        throw new UnsupportedOperationException();
    }

    /** removeAll(String s):
     *  removes all elements in the list for which
     *      element.equals(s)
     *  is true.
     */
    public void removeAll(String s) {
        throw new UnsupportedOperationException();
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

        /** remove():
         *  removes the last/previous element in the list
         *  (i.e. removes the element that was returned by the
         *  most recent call to next())
         */
        public void remove() {
            throw new UnsupportedOperationException();
        }

        /** removeKth(int k):
         *  iterates through the next k elements and removes
         *  the kth one. The next call to removeKth would
         *  start at the node after the removed node.
         *  (i.e. kthNode.next)
         */
        public String removeKthElement(int k) {
            throw new UnsupportedOperationException();
        }

        public boolean oneElementLeft() {
            throw new UnsupportedOperationException();
        }
    }

}
