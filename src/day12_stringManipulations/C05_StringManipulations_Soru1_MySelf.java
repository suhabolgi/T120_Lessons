package day12_stringManipulations;

import java.util.Scanner;

public class C05_StringManipulations_Soru1_MySelf {
    public static void main(String[] args) {

        //Soru 1 :
        // Kullanicidan bir cumle alin
        //- cumlede ev geciyorsa, "home home sweet home" yazdirin
        //- cumlede is geciyorsa, "calismak guzeldir"
        //- ikisini de iceriyorsa "Hem ev lazim hem is"
        //- hicbirini icermiyorsa "cok calisman lazim" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.print("İstediğiniz herhangi bir cümle yazın. \nCümle :");
        String cumle = scanner.nextLine(); // kullanıcıdan aldığımız cümleyi kaydettik.

        if (cumle.contains("ev") && cumle.contains("is")) {
            System.out.println("Hem ev lazim hem is");
        } else if (cumle.contains("ev")) {
            System.out.println("home home sweet home");
        } else if (cumle.contains("is")) {
            System.out.println("calismak guzeldir");
        } else {
            System.out.println("cok calisman lazim");
        }

    }
}
