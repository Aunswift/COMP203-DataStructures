package a_labOne;

import java.util.Arrays;

public class ArrayMerge {
    public static int[] insertArray(int[] first, int[] second, int index){
        int[] newArray = new int[first.length + second.length];
        for(int i = 0; i<index;i++){
            newArray[i] = first[i];
        }
        for(int i = 0;i<second.length;i++){
            newArray[index+i] = second[i];
        }
        for(int l = index; l<first.length;l++){

                newArray[l+second.length] = first[l];

        }

        return newArray;
    }

    public static void main(String[] args) {
        int[] first = {1,3,5,7,9,11};
        int[] second = {2,4,6};

        System.out.println(Arrays.toString(insertArray(first, second, 3)));
        System.out.print("[");
        for(int k = 0; k<first.length+ second.length; k++){
            System.out.print(k +", ");
        }
        System.out.print("]");
    }
}
