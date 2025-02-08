package COMP101;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(SumRange(999,1));
    }

    public static int SumRange(int firstRange, int secondRange) {
        int sum = 0;
        if(firstRange > secondRange){
            int temp = secondRange;
            secondRange = firstRange;
            firstRange = temp;
        }
        for(int i = firstRange; i <= secondRange; i++) {
            sum += i;
        }
        return sum;
    }

}