package IsSortedArray;

public class MainClass {
    public static void main(String[] args) {
        int[] arr = UtilityClass.MyArray();
        boolean increase = Increase.IsIncreasing(arr);
        boolean decrease = Decrease.IsDecreasing(arr);

        if (increase || decrease) {
            System.out.println("Array is Sorted");
        } else {
            System.out.println("Array is not Sorted");
        }
    }

}
