package leetCodeExample.minAmountOfTimetoFill;

import java.util.Scanner;

public class MinAmountOfTimeToFill {
    static int counter = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] cupstoFill = new int[3];
        for(int i = 0; i < 3; i++){
            cupstoFill[i] = sc.nextInt();
        }
        System.out.println(minAmountOfTimeToFill(cupstoFill));
    }

    public static int minAmountOfTimeToFill(int[] cupsToBeFilled) {
        int Cups = 0;
        for(int i = 0; i < 3; i++) {
            if(cupsToBeFilled[i] == 0){
                Cups++;
            }
            if(Cups == 3){
                return counter;
            }
        }
        int MaksEksiltici = 2;
        int sogukEksiltici = 2;
        int ilikEksiltici = 2;
        int sicakEksiltici = 2;

        if(cupsToBeFilled[0] > 0){
            MaksEksiltici--;
            sogukEksiltici--;
            cupsToBeFilled[0]--;
            if(cupsToBeFilled[0] >0 && (cupsToBeFilled[1] == 0 && cupsToBeFilled[2] == 0)){
                MaksEksiltici--;
                sogukEksiltici--;
                cupsToBeFilled[0]--;
                counter++;
            }
        }
        if(cupsToBeFilled[1] > 0){
            MaksEksiltici--;
            ilikEksiltici--;
            cupsToBeFilled[1]--;
            if(cupsToBeFilled[1] >0 && (cupsToBeFilled[0] == 0 && cupsToBeFilled[2] == 0) && MaksEksiltici > 0){
                MaksEksiltici--;
                ilikEksiltici--;
                cupsToBeFilled[1]--;
                counter++;
            }
        }
        if(cupsToBeFilled[2] > 0 && MaksEksiltici > 0){
            MaksEksiltici--;
            sicakEksiltici--;
            cupsToBeFilled[2]--;
            if(cupsToBeFilled[2] >0 && (cupsToBeFilled[0] == 0 && cupsToBeFilled[1] == 0) && MaksEksiltici > 0){
                MaksEksiltici--;
                sicakEksiltici--;
                cupsToBeFilled[2]--;
            }
        }
        if(MaksEksiltici > 0){
            minAmountOfTimeToFill(cupsToBeFilled);
        }
        counter++;
        minAmountOfTimeToFill(cupsToBeFilled);
        return counter;
    }
}