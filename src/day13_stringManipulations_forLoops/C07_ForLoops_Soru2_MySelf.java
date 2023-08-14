package day13_stringManipulations_forLoops;

import java.util.Scanner;

public class C07_ForLoops_Soru2_MySelf {
    public static void main(String[] args) {

        // SORU-2 ==> Kullanicidan pozitif bir tamsayi alin.
        //            1 den, girilen sayiya kadar ( girilen sayi dahil)
        //            7 ile bölünebilen sayilari yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayi girin");
        int girilenSayi = scanner.nextInt();

        for (int i = 1 ; i <= girilenSayi ; i++){
            if (i % 7 == 0){
                System.out.print(i + " ");
            }
        }

    }
}
