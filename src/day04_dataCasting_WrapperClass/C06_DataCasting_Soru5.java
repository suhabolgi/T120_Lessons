package day04_dataCasting_WrapperClass;

import java.util.Scanner;

public class C06_DataCasting_Soru5 {
    public static void main(String[] args) {
        // Soru 5-
        // Kullanicidan bir double, bir tamsayi alin,
        // double sayiyi ikinci sayiya bolun
        // ve bolum isleminin sonucununun tamsayi kismini yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.print("konsola ondalikli bir sayi gir :");
        double ondalikliSayi = scanner.nextDouble();

        System.out.print("konsola pozitif bir tamsayi gir :");
        int tamSayi = scanner.nextInt();



        int bolum = (int) ondalikliSayi / tamSayi; // ya double'ı cast edip int variable'lına atayacağiz

        int bolum2 = (int)(ondalikliSayi / tamSayi);  // ya da int data türü otomatik cast olduğundan yani auto widening
        //   olduğundan doğrundan bölme işlemi yapacağız sonucunu cast edeceğiz.


        System.out.print("1. yöntem sonucu : " + bolum + "\n2. yöntem sonucu : " + bolum2);


    }
}
