package day04_dataCasting_WrapperClass;

import java.util.Scanner;

public class C04_CharCasting {
    public static void main(String[] args) {
        //kullanıcıdan bir char isteyin.
        //girilen char dan sonraki 3 karakteri yazdirin.
        // orn : input : a output : b,c,d

        Scanner scanner =new Scanner(System.in);
        System.out.println("lütfen ascii tablosundan bir karakter giriniz.");

        char girilenKarakter =scanner.next().charAt(0);

        // scanner.nextChar metodu olmadığından
        // önce .next() ile String olarak alip, sonra o Stringin ilk karakterini alalim.

        /*System.out.println("girilen karakter :" + girilenKarakter);
        System.out.println("girilen karakterden sonraki 3 karakter :" +
                girilenKarakter+1 + ", " +
                girilenKarakter+2 + ", " +
                girilenKarakter+3);                      :h1, h2, h3              */

        /*System.out.println("girilen karakter :" + girilenKarakter);
        System.out.println("girilen karakterden sonraki 3 karakter :" +
                (girilenKarakter+1) + ", " +
                (girilenKarakter+2) + ", " +
                (girilenKarakter+3));      117, 118, 119     */

        System.out.println("girilen karakter :" + girilenKarakter);
        System.out.println("girilen karakterden sonraki 3 karakter :" +
                (char)(girilenKarakter+1) + ", " +
                (char)(girilenKarakter+2) + ", " +
                (char)(girilenKarakter+3)); // l, m, n


    }
}
