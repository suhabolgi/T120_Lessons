package day07_ifStatements;

import java.util.Scanner;

public class C05_bagimsizIfCumleleri_Soru4 {
    public static void main(String[] args) {

        // SORU-4==> Soru 4- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        //                   ucgen eskenar ise “Eskenar ucgen” yazdirin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen ucgenin kenar uzunluklarini giriniz.");
        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();
         // JAVA'da 3 lü karsilastirma olmaz. ikili karsilastirmalar yaparak && ya da || operatörleri ile birlestirmeliyiz

        if (kenar1 == kenar2 && kenar2 ==kenar3 && kenar1>0){
            System.out.println("verilen değerlere göre, ucgen eskenardir.");

        }

        System.out.println("**************** 2. çözüm  *********************");

        System.out.println("üçgenin kenar uzunluklarini sirayla girin :");
        double aKenar = scanner.nextDouble();
        double bKenar = scanner.nextDouble();
        double cKenar = scanner.nextDouble();

        if (aKenar == bKenar && bKenar==cKenar && aKenar>0) System.out.println("üçgen eşkenardır.");
    }
}
