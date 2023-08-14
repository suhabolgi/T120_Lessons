package day17_methodOlusturma_methodOverloading;

import day16_metodOlusturma_Kullanma.C01_MethodOlusturma;
import day16_metodOlusturma_Kullanma.C03_MethodOlusturma;

public class C03_BaskaClasstanMetgodKullanma {
    public static void main(String[] args) {

        C01_MethodOlusturma.altString("Method budur...", 7,8);

        System.out.println(C03_MethodOlusturma.isimDuzenle("süha", "bolgı"));

        System.out.println(C01_AsalSayiBulma.asalSayiMi(52)); // boolean olduğu icin ya yazdir ya kaydet

        System.out.println(C02_TamBolenlerSayisiniBulma.tamBolenlerSayisi(12));


    }
}
