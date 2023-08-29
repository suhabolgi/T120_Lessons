package day41_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_MultipleExceptions {
    public static void main(String[] args) {

        String str = "Java Candir";
        int[] arr  = {3,5,7,8,2,5,9,0};

        // Kullanicidan bir sayi isteyip
        // girilen sayiyi index olarak kullanin
        // str 'daki o index'deki harfi
        // ve array'deki o index'deki sayiyi yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen istediğiniz index numarasını giriniz. ");


        int girilenIndex= 0;

        /*
        Sorunun normal cozumunu bu sekilde ogrenmisitk ama bu 3 satirlik kodun her satirinda birbirinden farkli
        exceptions olabilir, bakalim.
        girilenIndex = scanner.nextInt(); burada InputMismatchException ihtimali vardir.
        System.out.println(str.charAt(girilenIndex)); StringIndexOutOfBoundsException ihtimali var.
        System.out.println(arr[girilenIndex]);  ArrayIndexOutOfBoundsException ihtimali var.
        */


        /* 1- yukarida commit icerisindeki cozumde yer alan exceptions ihtimallerine karsi
        birden fazla try catch blogu olusturabilir ve her exception icin ayri ayri try/catch bloklari
        olusturabiliriz.

        try {
            girilenIndex = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Sizden sayi istedim");
        }


        try {
            System.out.println(str.charAt(girilenIndex));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Girilen index String'in sinirlari disinda");
        }


        try {
            System.out.println(arr[girilenIndex]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Girilen index array'in sinirlari disinda");
        }

         */

        /* 2- yukaridaki Try/catch denemesi cok uzun oldu, bir try birden fazla catch yazabiliriz,


        try{
            girilenIndex = scanner.nextInt();
            System.out.println(str.charAt(girilenIndex));
            System.out.println(arr[girilenIndex]);
        } catch (InputMismatchException e){
            System.out.println("Sizden sayi istedim");
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("Girilen index String'in sinirlari disinda");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Girilen index array'in sinirlari disinda");
        }
        ONEMLİ ===>>>
        buradaki yapi da if/else deki gibidir. catch bloklarindan birini calistirdiginde geri kalan bloklara
        bakmaz, calistirdigi catch blogu ile exception olusan satir arasinda kalan tüm satirlari IGNORE EDER.
        Ornegin, 63. satirda StringIndexOutOfBoundsException olusursa, 67. satira kalan kod bloklari
        IGNORE EDILIR, görmezden gelinir.

         */

        // 3 - olasi tum exception'lari kapsayan
        //     genis kapsamli bir exception varsa, sadece onu kullanarak tek bir catch yazilabilir

        try {
            girilenIndex = scanner.nextInt();
            System.out.println(str.charAt(girilenIndex));
            System.out.println(arr[girilenIndex]);
        } catch (Exception e) {
            // RuntimeException
            // Exception Classi, diger tum exception turlerinin atasidir.

            System.out.println("Kod calistirilirken bir hata ile karsilasildi");
            e.printStackTrace();
        }


    }

    /*
        Bir kodda birden fazla exception olasigi olabilir

        ornegin bu soruda
         - ArrayIndexOutOfBoundsException
         - StringIndexOutOfBoundsException olusma olasiligi var
         - InputMismatchException

        Birden fazla exception olasiligi varsa
        asagidaki adimlarla ilerlemek gerekir

        1- olusmasi muhtemel exception'lar icin parent - child iliskisi YOKSA
            - her biri icin ayri try-catch
            - bir try, her bir exception icin ayri catch
            - bir try ve olasi tum exception'lari kapsayan genel bir catch
            
        2- olusmasi muhtemel exception'lar arasinda parent child iliskisi VARSA
            - birden fazla catch cumlesi yazilacaksa, once child, sonra parent yazilabilir
            - sadece parent yazilabilir

     */
}