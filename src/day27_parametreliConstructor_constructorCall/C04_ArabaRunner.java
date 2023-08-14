package day27_parametreliConstructor_constructorCall;

public class C04_ArabaRunner {
    public static void main(String[] args) {


      C03_Araba araba1 =new C03_Araba();
        System.out.println(araba1);
       /* Araba Bilgileri ==>
        marka='marka yok'
        odel='model yok'
        yil=1990
        fiyat=0
        renk='renk belirtilmedi'
        renk='renk belirtilmedi'}*/

        araba1.marka = "Mercedes";
        araba1.model ="W200";
        araba1.yil =2020;
        araba1.fiyat = 2012345;
        araba1.renk ="Kırmızı";

        System.out.println(araba1);
        /*Araba Bilgileri ==>
        marka='Mercedes'
        odel='W200'
        yil=2020
        fiyat=2012345
        renk='Kırmızı'
        renk='Kırmızı'}*/


        // her yeni obje oluşturduğumuzda parametresiz default
        // constructor çalıştığında o class'ta insatance variable'lara
        // atanan değerleri alır. sonra bizim her bir variable için
        // yeniden bir atama yapmamız lazım.

        // bu kadar zahmetin yerine Constructor Call'a parametre
        // olarak değerler yazalım.

        C03_Araba araba2 = new C03_Araba("BMW","5.20",2017,33000,"Mavi");
        System.out.println(araba2);
        /*Araba Bilgileri ==>
        marka='BMW'
        odel='5.20'
        yil=2017
        fiyat=33000
        renk='Mavi'
        renk='Mavi'}*/

        C03_Araba araba3 = new C03_Araba("megane","station",2010,135000,"gri");
        System.out.println(araba3);
        /*Araba Bilgileri ==>
        marka='megane'
        odel='station'
        yil=2010
        fiyat=135000
        renk='gri'
        renk='gri'}*/



    }



}
