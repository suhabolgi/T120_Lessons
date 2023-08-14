package day15_nestedForLoop_MethodOlusturma;

import java.util.Scanner;

public class C02_NestedForLoop {
    public static void main(String[] args) {

        // Kullanicidan 2 rakam alin
        // ilk rakam satir
        // ikinci rakam sütumn olmak üzere aşagidaki sekli cizdirin.

        /*

         * * * * *
         * * * * *
         * * * * *
         * * * * *

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("oluşturulacak saklin satir sayisini girin");
        int satir = scanner.nextInt();


        System.out.println("oluşturulacak saklin satir sayisini girin");
        int sutun = scanner.nextInt();

        for (int i = 1; i <=satir ; i++) {

            for (int j = 1; j <= sutun ; j++) {
                System.out.print("* ");

            }
            System.out.println("");
            
        }


    }
}
