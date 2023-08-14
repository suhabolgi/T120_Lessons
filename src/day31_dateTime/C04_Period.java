package day31_dateTime;

import java.time.LocalDate;
import java.time.Period;

public class C04_Period {
    public static void main(String[] args) {
        // kullanıcının verdiği doğum tarihine göre, kullanıcının yaşını yıl ve ay olarak yazdıran program yazın.

        LocalDate dogumTarihi = LocalDate.of(1987,06,07);
        LocalDate bugun = LocalDate.now();

        System.out.println(Period.between(dogumTarihi, bugun)); //  P36Y1M28D

        System.out.println(Period.between(dogumTarihi, bugun).getYears()); //36
    }
}
