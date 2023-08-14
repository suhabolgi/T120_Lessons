package day22_arrays_multiDimensionalArrays;

import java.util.Arrays;

public class C04_StringSplitMethodu {
    public static void main(String[] args) {
        String str ="Java candır, Selemyum heyecan.";

        String[]kelimeler = str.split(" ");

        System.out.println(Arrays.toString(kelimeler)); //  [Java, candır., Selemyum, heyecan.]

        String[] yeniarr = str.split(", "); // method virgül boşluğu bulur ve orayı siler ve iki parça
        // array yapar.

        System.out.println(Arrays.toString(yeniarr)); // [Java candır, Selemyum heyecan.]

        String[] karakterler = str.split("");
        System.out.println(Arrays.toString(karakterler));
        // [J, a, v, a,  , c, a, n, d, ı, r, ,,  , S, e, l, e, m, y, u, m,  , h, e, y, e, c, a, n, .]



    }
}
