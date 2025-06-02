package IsSortedArray;

public class Increase {
    public static boolean IsIncreasing(int[] arr) {
        int i = 1;
        while (i < arr.length) {
            if (arr[i] > arr[i - 1]) {
                return false;
            }
            i++;
        }
        return true;
    }
}
