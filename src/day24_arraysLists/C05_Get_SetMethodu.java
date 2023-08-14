package day24_arraysLists;

import java.util.ArrayList;
import java.util.List;

public class C05_Get_SetMethodu {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();
        isimler.add("Cemil");
        isimler.add("Ömer");
        isimler.add("Merkan");

        isimler.add(2, "Burhan");
        System.out.println(isimler); // [Cemil, Ömer, Burhan, Merkan]

        // set() ile get () arasındaki fark,
        // add() araya ekler kalanları kaydırır.
        // set() ise update yapar, yani varolan elementin değerini değiştirir.

        isimler.set(2,"Süha");
        System.out.println(isimler); // [Cemil, Ömer, Süha, Merkan]

        System.out.println(isimler.get(1)); // Ömer
        System.out.println(isimler); // [Cemil, Ömer, Süha, Merkan]

    }
}
