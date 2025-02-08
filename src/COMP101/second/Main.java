package COMP101.second;


/*
Write a static method called SumRange that accepts two integer parameters that represent a range of numbers.

The method should return the sum of the integers in that range.

If the first parameter is greater than the second, the program will swap the values and still calculate the range.

Here the first parameter refers to the start value, while the second parameter indicates the end value of the range.

The start and end values are inclusive.

 */
public class Main {
    public static int SumRange(int start, int end) {
        // Swap values if the first parameter is greater than the second
        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }

        // Calculate the sum of integers in the range [start, end]
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(SumRange(1, 10)); // Output: 55
        System.out.println(SumRange(10, 1)); // Output: 55 (values swapped)
        System.out.println(SumRange(5, 5));  // Output: 5 (single value range)
    }
}
