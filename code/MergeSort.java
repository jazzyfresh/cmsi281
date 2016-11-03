public class MergeSort {

    public static void main(String[] args) {

    }

    public static void mergesort(int[] array) {
        int[] temp = new int[array.length];
        mergesort(array, temp, 0, array.length - 1);
    }

    public static void mergesort(int[] array, int[] temp, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergesort(array, temp, left, mid);
            mergesort(array, temp, mid + 1, right);
            merge(array, temp, left, mid, right);
        }
    }

    public static void merge(int[] array, int[] temp, int left, int mid, int right) {
        // First: Copy sorted subarrays into temp array:
        for (int i = left; i <= right; i++) {
            temp[i] = array[i];
        }

        // Second: Interleave the subarrays:
        //
        // start with each subarray's lowest element
        int leftIndex = left;
        int rightIndex = right;
        // they will be interleaved into the original array
        // starting at the left
        int arrayIndex = left;

        // interleave until you run out of elements
        while (leftIndex <= mid && rightIndex <= right) {
            // compare which element is lower
            // and copy the lower element into the original array
            if (temp[leftIndex] <= temp[rightIndex]) {
                array[arrayIndex] = temp[leftIndex];
                leftIndex++;
            } else {
                array[arrayIndex] = temp[rightIndex];
                rightIndex++;
            }
            arrayIndex++;
        }

        // Third: copy the remaining left elements back to the original array
        while (leftIndex <= mid) {
            array[arrayIndex] = temp[leftIndex];
            leftIndex++;
            arrayIndex++;
        }

    }


}
