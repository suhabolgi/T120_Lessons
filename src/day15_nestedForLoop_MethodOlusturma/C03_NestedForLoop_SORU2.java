package day15_nestedForLoop_MethodOlusturma;

public class C03_NestedForLoop_SORU2 {
    public static void main(String[] args) {

        /* SORU-2 ==>

        1           1. satir 1’den 1’e kadar yazdir
        1 2         2. satir 1’den 2’e kadar yazdir
        1 2 3         3. satir 1’den 3’e kadar yazdir
        1 2 3 4.      4. satir 1’den 4’e kadar yazdir

         */

        for (int i = 1; i <=4 ; i++) { // dıştaki for satirlari kontrol eder.

            for (int j = 1;  j<=i ; j++) { // içteki sütunları
                System.out.print(j +" ");

            }
            System.out.println("");
        }

    }
}
