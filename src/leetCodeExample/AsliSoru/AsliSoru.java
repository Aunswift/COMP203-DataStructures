package leetCodeExample.AsliSoru;

import java.util.Arrays;
import java.util.Scanner;

public class AsliSoru {

    /*
    integer olarak toplam zeytinyağı miktarını alan ve integer dizi olarak girilen kap
    hacimlerine en tasarruflu şekilde bölünüp(örneğin 50,20,10 elemanları olan bir
    dizi olsun. Toplam zeytinyağı, en çok hacmi 50 olan kabı kullanırsak daha az kap
    kullanırız) kullanılan kap miktarını sırası ile ekrana yazan programı yazınız. Örneğin
     120 litre zeytinyağı aldıysak, 2 tane 50'lik, 1 tane 20'lik kap kullanırız. Çıktımız da
      [2,1,0] olur.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the litre of zeytinyagi: ");
        double miktar = sc.nextInt();
        System.out.print("Kapların miktarını giriniz: ");
        int[] kaplar = new int[3];
        for(int i = 0; i < 3; i++){
            kaplar[i] = sc.nextInt();
        }

        Arrays.sort(kaplar);

        int kap1Counter = 0;
        int kap2Counter = 0;
        int kap3Counter = 0;

        while(miktar > 0){
            if(miktar - kaplar[0] >= 0){
                miktar -= kaplar[0];
                kap1Counter++;
            }else if(miktar - kaplar[1] >= 0){
                miktar -= kaplar[1];
                kap2Counter++;
            }else if(miktar - kaplar[2] >= 0){
                miktar -= kaplar[2];
                kap3Counter++;
            }
        }

        System.out.println("[" + kap1Counter + "," + kap2Counter + ", " + kap3Counter + "]");

    }


}
