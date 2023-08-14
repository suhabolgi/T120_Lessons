package day14_ForLoops;

import java.util.Scanner;

public class C06_FizzBuzz_Soru8 {
    public static void main(String[] args) {

        // Soru 8 (interview)- Kullanicidan pozitif bir sayi alin, 1’den baslayarak tum tamsayilari yazdirin,
        // sira,
        // 3 ile bolunebilen bir sayiya gelirse, sayi yerine fizz
        // 5 ile bolunebilen bir sayiya gelirse sayi yerine buzz
        // hem 3 hem 5 ile bolunebilen bir sayiya gelirse sayi yerine fizzBuzz yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir pozitif tamsayi girin");
        int sayi = scanner.nextInt();

        for (int i = 1; i <=sayi ; i++) {

            if (sayi % 3 == 0 && sayi % 5 == 0){
                System.out.print("fizbuzz\n");

            } else if (i % 3 == 0) {
                System.out.print("fizz ");

            } else if (i % 5 == 0) {
                System.out.print("buzz ");

            }else{
                System.out.print(i + " ");
            }
        }

    }
}
