class QuickSort {
  public static void main(String[] args) {

  }

  public void quicksort(int[] array) {
    quicksort(array, 0, array.length - 1);
  }

  public void quicksort(int[] array, int low, int high) {
    if (low < high) {
      int partition = partition(array, low, high);
      quicksort(array, low, p - 1);
      quicksort(array, p + 1, high);
    }
  }

  // Lumoto partition scheme
  // Degrades to O(n^2) if the array is already sorted or has
  // all equal elements (also see Hoare partition scheme)
  public int partition(int[] array, int low, int high) {
    int pivot = array[high];
    int i = low;
    int j = low;
    int temp;

    // scan through the subarray moving elements to
    // either side of the pivot
    while (j <= high - 1) {
      if (array[j] <= pivot) {
        // swap array[i] with array[j]
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        i = i + 1;
      }
      j = j + 1;
    }

    // swap array[i] with array[high]
    temp = array[high];
    array[high] = array[i];
    array[i] = temp;

    return i; // return the index of the pivot
  }

}
