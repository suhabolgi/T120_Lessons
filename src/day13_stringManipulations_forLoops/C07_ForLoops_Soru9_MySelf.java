package day13_stringManipulations_forLoops;

import java.util.Scanner;

public class C07_ForLoops_Soru9_MySelf {
    public static void main(String[] args) {

        // SORU-9 ==>
        // Kullanicidan bir String isteyin ve String’i tersten yazdirin.  (interview)

        // Tarayicimizi olusturalim.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Istediginiz bir metni buaraya giriniz.");
        String girilenString = scanner.nextLine();

        // ForLoop dan donecek olan her bir karakteri bir digerinin yanina ilave edecegiz. ancak oncelikle
        // son indeksten baslayacagiz  ve 0 inci indekse yani metnin ilk karakterine dogru giden
        // bir ForLoop dongusu oluşturacagiz.

        for (int i = girilenString.length()-1 ; i >=0 ; i--){
            System.out.print(girilenString.charAt(i));
        }

    }
}
