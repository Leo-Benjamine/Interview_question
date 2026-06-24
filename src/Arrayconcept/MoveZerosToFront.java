package Arrayconcept;

import java.util.Arrays;

public class MoveZerosToFront {

	public static void main(String[] args) {
		int[] arr = {2, 3, 0, 4, 0, 5, 0};
        int[] result = new int[arr.length];

        int index = 0;

        // Count zeros and place them first
        for (int num : arr) {
            if (num == 0) {
                result[index++] = 0;
            }
        }

        // Add non-zero elements
        for (int num : arr) {
            if (num != 0) {
                result[index++] = num;
            }
        }

        System.out.println(Arrays.toString(result));

	}

}
