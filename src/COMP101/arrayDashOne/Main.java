package COMP101.arrayDashOne;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();

        int array[] = new int[k];

        for(int i = 0; i<array.length;i++){
            array[i] = scanner.nextInt();
        }

        int max = 0;

        for(int j = 0; j<array.length;j++){
            if(array[j]> max){
                max = array[j];
            }
        }

        int SecondMax = array[0];
        for(int l = 0; l<k;l++){
            if(array[l]>SecondMax && array[l]<max){
                SecondMax = array[l];
            }
        }


        System.out.println(SecondMax);
        FIRST QUESTIONS ANSWER*/


        /* SECOND QUESTION
        Scanner sc = new Scanner(System.in);
        System.out.print("Bi sayı gir: ");
        int sayi = sc.nextInt();
        int counter = 0;
        while(sayi > 0){
            if(sayi % 2 == 1){
                counter++;
            }
            sayi /= 2;
        }

        System.out.println(counter);

         */


        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        while(n<=3 || n%2 == 0){
            System.out.println("olmaz");
            n = sc.nextInt();
        }

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int orta = n/2;
        int SolToplam = 0;
        int SagToplam = 0;

        for(int i = 0; i<orta;i++){
            SolToplam += arr[i];
        }
        for(int i = n;i>orta;i--){
            SagToplam += arr[i];
        }

        if(SolToplam==SagToplam){
            System.out.println("balanced");
        }else{
            System.out.println("imbalanced");
        }

        ANSWER OF 4TH QUESTION
         */

    }
}