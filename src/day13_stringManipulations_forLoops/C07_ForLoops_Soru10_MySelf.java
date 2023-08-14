package day13_stringManipulations_forLoops;

import java.util.Scanner;

public class C07_ForLoops_Soru10_MySelf {
    public static void main(String[] args) {
        // Soru 10 (interview)-
        // Kullanicidan bir String isteyin ve String’i tersine cevirip kaydedin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Istediginiz bir metni buaraya giriniz.");
        String girilenString = scanner.nextLine();



        for (int i = girilenString.length() - 1; i >= 0; i--) {
            System.out.print(girilenString.charAt(i));
            char gelenHarf= girilenString.charAt(i);
            String tersMetin = gelenHarf+"";


        }


    }
}
