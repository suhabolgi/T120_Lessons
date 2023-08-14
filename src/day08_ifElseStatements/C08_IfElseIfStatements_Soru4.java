package day08_ifElseStatements;

import java.util.Scanner;

public class C08_IfElseIfStatements_Soru4 {

    public static void main(String[] args) {
        // Soru 4-
        // Kullanicidan mesafeyi kilometre olarak alin
        // ve cevirmek istedigi birimi sorun,
        // istedigi birim metre veya santimetre ise cevirip yazdirin,
        // yoksa “istediginiz birim sisteme kayitli degil” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.print("gitmek istediginiz mesafeyinin kç km olduğunu yaziniz :");
        double km = scanner.nextDouble();

        System.out.println("mesafeyi hangi birime çevirmek istersiniz : \nMetre ise M \nSantimetre ise S");
        char change = scanner.next().charAt(0);

        if (change == 'M' || change == 'm') {
            System.out.println("girdiğiniz mesafe : " + (km * 1000) + " metredir.");
        } else if (change == 'S' || change == 's') {
            System.out.println("girdiniz mesafe : " + (km * 1000 * 100) + " santimetredir.");
        }else if (!(change =='S' || change=='M' ||change =='s' || change =='m')){
            System.out.println( "istediğiniz öçlü birimi mevcut değildir.");
        }

    }
}



