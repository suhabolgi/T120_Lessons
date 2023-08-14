package day24_arraysLists;

import java.util.ArrayList;
import java.util.List;

public class C04_Remove {
    public static void main(String[] args) {

        List<String>  isimler = new ArrayList<>();

        isimler.add("Emre");
        isimler.add("Ercan");
        isimler.add("Tuğba");
        isimler.add("Gökdeniz");
        isimler.add("Emre");

        System.out.println(isimler);
        // [Emre, Ercan, Tuğba, Gökdeniz, Emre]

        System.out.println(isimler.remove("Hasan")); // false ==> gittim bulamadım der
        System.out.println(isimler.remove("Emre")); // true ==> gittim emreyi sildim

        System.out.println(isimler); // [Ercan, Tuğba, Gökdeniz, Emre]

        // dikkat, 23. satırda gözüktüğü üzere üst satırda remove yaptığımız "Emre" gitmiş sondaki

        System.out.println(isimler.remove(1));
        System.out.println(isimler);
        // [Ercan, Gökdeniz, Emre]


        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(7);
        sayilar.add(1);

        System.out.println(sayilar); // [3, 5, 7, 1]

        sayilar.remove(1);      //  [3, 7, 1]
        System.out.println(sayilar);

        // ben illaki de element olan 1 i silmek isterseö,

        Integer silinecekElement = 1;
        sayilar.remove(silinecekElement);
        System.out.println(sayilar);
        // [3, 7]

        Integer silinecekElement1 = 3;
        sayilar.remove(silinecekElement1);
        System.out.println(sayilar);
        // [7]

        sayilar.clear();
        System.out.println(sayilar); // []

    }
}
