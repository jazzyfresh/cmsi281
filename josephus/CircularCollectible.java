public interface CircularCollectible extends Collectible {

    // overrides Collectible's iterator function
    public CircularIterator iterator();

}
