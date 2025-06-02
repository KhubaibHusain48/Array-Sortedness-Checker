package IsSortedArray;

public class Decrease {
    public static boolean IsDecreasing(int[] arr) {
        int i = 1;
        while (i < arr.length) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
            i++;
        }

        return true;
    }
}
