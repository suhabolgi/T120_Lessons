package day06_concatination_matematikselOperatorler;

public class C02_KarsilastirmaOperatorleri {
    public static void main(String[] args) {

        int a = 10 ;

        int b = 20 ;

        // Java'da tek = işareti karşılaştrıma işareti atama işaretidir. yani atama işaretidir.

        b = 2 * a ; // b'nin yeni değeri 20 dir. eski değeri öldü. :))

        // Java'da eşitliği kontrol etmek istersek == kullaniriz.

        System.out.println( b == 2*a); // 20 == 20 ==> true

        // Assignment'a eşitliğin sol tarafından sadece variable bulunur.
        // Sol tarafta matematiksel işlem olmaz.
        // Karşilastirma operatörlerinde iki tarafta da islem olabilir.

        System.out.println(3 * b > 5 * a);// 60 > 50 ==> true

        System.out.println( b >= b-a);      // 20 >= 10 ==> true

        System.out.println(a <= b-a);       // 10 <= 10 ==> true

        // Java'da karsilastirma operatörlerinde kullanilan !
        // boolean degeri tersine cevirir.

        System.out.println(a < b);          // true
        System.out.println(!(a < b));       // false

        System.out.println( a != b );       // true

    }
}
