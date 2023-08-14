package day31_dateTime;

import java.time.LocalDate;

public class C01_LocalDate {
    public static void main(String[] args) {
        LocalDate tarih = LocalDate.now(); // 2023-08-04
        System.out.println(tarih);


        System.out.println(tarih.getMonth()); // AUGUST
        System.out.println(tarih.getMonthValue()); //
        System.out.println(tarih.getDayOfYear()); // yılın kaçıncı günü 216

        System.out.println(tarih.isLeapYear());// false

        LocalDate tarih1 = LocalDate.of(2016,1,1); // artık yıl mı
        System.out.println(tarih1.isLeapYear()); // true

        System.out.println(tarih1.isAfter(tarih));// tarih 1 tarihten önce mi //  false

        System.out.println(tarih1.withYear(2022));   //2022-01-01
        System.out.println(tarih.minusYears(3).minusDays(53)); //  2020-06-12
        System.out.println(tarih1.plusWeeks(23).plusDays(65)); // 2016-08-14

        System.out.println(tarih.lengthOfYear()); // 365
        System.out.println(tarih.lengthOfMonth()); // 31


    }
}
