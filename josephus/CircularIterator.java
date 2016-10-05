import java.util.Iterator;

public interface CircularIterator extends Iterator {

    // Removes the kth element in the list
    // and returns the string value of that element
    public String removeKthElement(int k);

    // Only one element is left in the collection
    public boolean oneElementLeft();

}
