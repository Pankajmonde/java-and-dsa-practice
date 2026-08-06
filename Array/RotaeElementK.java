package Array;

import java.util.Arrays;

public class RotaeElementK {

    public static void main(String args[]) {

        int arr[] = {1, 2, 3, 4, 5};

        int n = arr.length;
        int k = 3;

        // Handle k greater than array size
        k = k % n;

        // Rotate k times
        for (int j = 1; j <= k; j++) {

            // Store first element
            int temp = arr[0];

            // Shift elements to left
            for (int i = 1; i < n; i++) {
                arr[i - 1] = arr[i];
            }

            // Put first element at last
            arr[n - 1] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}