package day09_nestedIfElseStatements_Ternary;

import java.util.Scanner;

public class C05_Ternary {
    public static void main(String[] args) {

        /*Soru 2- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        ucgen eskenar ise “Eskenar ucgen” yazdirin,
        degilse “Eskenar degil” yazdirin.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("ucgenin 3 kenar uzunlugunu girin");

        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

        System.out.println(kenar1 == kenar2 && kenar3 == kenar1 && kenar1 >= 0 ? "Eskenar Ucgen" : "Eskenar Degil");
    }
}
