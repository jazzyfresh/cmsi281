public abstract class AbstractArrayList implements Collectible {
    final int DEFAULT_MAX_SIZE = 100;

    String [] elements;
    int size;
    int arraySize;

    protected AbstractArrayList() {
        elements = new String[DEFAULT_MAX_SIZE];
        arraySize = DEFAULT_MAX_SIZE;
        size = 0;
    }

    protected AbstractArrayList(String[] elements) {
        for (String s : elements) {
            if (s != null) {
                // take advantage of your own add() method
                // to make this constructor
                add(s);
            }
        }
    }

    public void add(String s) {
        // if you still have room in your static array
        if (size < arraySize) {
            // you can just add it like normal
            elements[size] = s;         
            size++;
        } else {
            // otherwise...
            // you have to double the array to make more space
            arraySize = arraySize * 2;
            String[] doubleElements = new String[arraySize];

            // and then copy the elements over one by one...
            for (int i = 0; i < size; i++) {
                doubleElements[i] = elements[i];
            }

            // ...and then you can add the new element like normal
            elements[size] = s;         
            size++;
        }
    }
}
