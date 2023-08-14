package day04_dataCasting_WrapperClass;

import java.util.Scanner;

public class C06_DataCasting_Soru2 {
    public static void main(String[] args) {
        // SORU-2

        // Kullanicidan bir harf alin ve alfabede o harften sonraki 3 harfi yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir harf giriniz.");

        char girilenHarf = scanner.next().toLowerCase().charAt(0);


int sonrakiHarfAscii = girilenHarf +1;

char ikinciHarf = (char)sonrakiHarfAscii;
char ucuncuHarf = (char)(sonrakiHarfAscii+1);
char dorduncuHarf = (char)(sonrakiHarfAscii+2);

        System.out.println(ikinciHarf + " "+ ucuncuHarf+ " " + dorduncuHarf);


    }
}
