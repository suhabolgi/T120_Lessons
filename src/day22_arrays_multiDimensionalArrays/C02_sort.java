package day22_arrays_multiDimensionalArrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C02_sort {
    public static void main(String[] args) {

        String [] harfler = {"L", "a", "P", "d", "T", "t"};
        System.out.println(Arrays.toString(harfler));  //

        Arrays.sort(harfler);       // değişiklikler kalıcı olur DİKKKKKAAAAAT
        System.out.println(Arrays.toString(harfler));

        // Arrays.sort() arraydaki elementleri Natural Order'a göre sıralar.
        // Arratlerde ve bundan sonra göreceğimiz ArrayList'lerde method kullanıldığındA
        // Array ve ArrayList kalıcı olarak değişir.

        String[] isimler = {"ali","ahmet","gökdeniz","arif","ercan","demir"};

        Arrays.sort(isimler);
        System.out.println(Arrays.toString(isimler));

        //[ahmet, ali, arif, demir, ercan, gökdeniz]

        int[] sayilar ={4,77,3,65,698,63,0};

        Arrays.sort(sayilar, 3, 6);
        System.out.println(Arrays.toString(sayilar));// [4, 77, 3, 63, 65, 698, 0]

        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar)); // [0, 3, 4, 63, 65, 77, 698]



    }
}
