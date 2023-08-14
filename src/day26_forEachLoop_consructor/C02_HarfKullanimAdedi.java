package day26_forEachLoop_consructor;

import java.util.Arrays;

public class C02_HarfKullanimAdedi {
    public static void main(String[] args) {
        //Soru 4-
        // Kullanicidan bir cumle ve bir harf alin, harf cumlede kullanilmissa kac kere
        // kullanildigini yazdirin, kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.

        String cumle = "java her geçen gün daha da zevkli hale geliyor";
        String harf = "x";

        String[] cumleArr = cumle.split("");
        // System.out.println(Arrays.toString(cumleArr));
        // [j, a, v, a,  , h, e, r,  , g, e, ç, e, n,  , g, ü, n,  , d, a, h, a,  , d, a,  , z, e, v, k, l, i,  , h, a, l, e,  , g, e, l, i, y, o, r]

        int sayac = 0;

        for (String each : cumleArr
        ) {
            if (each.equals(harf)) {
                sayac++;
            }
        }
        if (sayac==0) {
            System.out.println("aradiğiniz harf cümlede hiç kullanılmamış");
        }else {
            System.out.println("aradığınız ; " + harf+ " harfi cümlede " + sayac + " kere kullanılmış");
        }
    }
}
