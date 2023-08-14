package day08_ifElseStatements;

import java.util.Scanner;

public class C05_IfElseStatements_Soru2 {
    public static void main(String[] args) {

        //Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip
        // Vucut kitle endeksini hesaplayin
        // (kilo*10000 / (boy *boy)) vucut kitle endeksi 30’dan buyukse obez,
        // 25-30 arasi ise kilolu, 20-25 arasi ise normal, 20’den kucukse zayif yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen kilonuzu giriniz");
        double kilo = scanner.nextDouble();

        System.out.println("Lütfen boyunuzu giriniz.");
        double boy =scanner.nextDouble();

        double endeks = (kilo * 10000) / (boy * boy);
        System.out.println(endeks); // bizden yazdirmamiz istenmediginden,bu kod satirini yazmamaliyiz.

        if (endeks > 30){
            System.out.println("obez");
        } else if (endeks >= 25  ) {
            System.out.println("kilolu");
        } else if (endeks >= 20 ) {
            System.out.println("normal");
        } else {
            System.out.println("zayif");
        }


    }
}
