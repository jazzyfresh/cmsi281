class BinarySearch {

  /**
   *
   * binarySearch(int[] array, int s)
   * takes in an array of integers and a search value, s
   * returns the index of the search value if present in the array,
   * or -1 if not present
   */
  public static int binarySearch(int[] array, int s) {
    // call a helper function that has the right method signature for recursive binary search
    return binarySearch(array, s, 0, array.length - 1);
  }

  public static int binarySearch(int[] array, int s, int left, int right) {
    // calculate the index of the midpoint between left and right,
    // you can do this by taking their average.
    int mid = (left + right) / 2;

    // if the right index is less than the left index,
    // your search space is empty (i.e. you've checked all the elements already)
    if (left > right) return -1;

    // if the search value is less than array[mid], the element being compared, 
    // then we know that the search value must either be on the left or is not in the array.
    // Recursively search that half of the array, by setting the "right" index to (just left of) the midpoint
    if (s < array[mid]) return binarySearch(array, s, left, mid - 1);

    // if the search value is greater than array[mid], the element being compared, 
    // then we know that the search value must either be on the right or is not in the array.
    // Recursively search that half of the array, by setting the "left" index to (just right of) the midpoint
    if (s > array[mid]) return binarySearch(array, s, mid + 1, right);

    // if the indexes are correct (left <= right), that means you still have elements in 
    // your search space (i.e. the sub-array you're considering has a size >= 1).
    // if array[mid] is neither greater than or less than the search value, 
    // then it must be exactly equal to the search value.
    return mid;
  }

  public static void main(String[] args) {

    int[] a1 = {1,2,3,4,5,6,7,8,9};
    System.out.println(binarySearch(a1, 6));
    System.out.println(binarySearch(a1, 10));

  }
  
}
