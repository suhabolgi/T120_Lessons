package day30_immutableClasses;

import java.time.LocalTime;
import java.time.ZoneId;

public class C02_LocalTime {
    public static void main(String[] args) {

        LocalTime time = LocalTime.now();  // java de her zaman new keywordu ile obje oluşmaz.

        System.out.println(time);

        System.out.println(time.getHour());  // saat kısmını
        System.out.println(time.getMinute()); // dakika kısmını

        System.out.println(time.minusMinutes(1000)); // 1000 dakika geri sayar
        System.out.println(time.minusHours(100));       // 100 saat öncesini hesaplar.
        System.out.println(time.plusSeconds(10000)); // 10000 dakika sonra saat kaç olur .

        System.out.println(time.withHour(15));
        System.out.println(time.withSecond(0).withNano(0)); // 22:45 saniye ve neno saniyeyi siler


        LocalTime time1=LocalTime.of(12,35);
        LocalTime time2=LocalTime.of(14,34);

        System.out.println(time1.isBefore(time2)); // true,
        System.out.println(time1.isAfter(time2)); // false,

        LocalTime time3 = LocalTime.now(ZoneId.of("Europe/London"));
        System.out.println("London saati : " + time3);
    }
}
