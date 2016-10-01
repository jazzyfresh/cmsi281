package bag;

import bag.Obliterator;

interface Collectible {

    boolean isEmpty();

    int size();

    void add(String item);
    
    Obliterator iterator();

}
