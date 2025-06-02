package IsSortedArray;

import java.util.Scanner;

public class UtilityClass {
    public static int[] MyArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] MyArray = new int[size];

        int i = 0;
        while (i < size) {
            System.out.print("Enter the element " + (i + 1) + ": ");
            MyArray[i] = sc.nextInt();
            i++;
        }
        return MyArray;
    }
}
