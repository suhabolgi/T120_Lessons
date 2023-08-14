package day05_matematikselIslemler_increment;

public class C04_PreIncrement_PostIncrement {
    public static void main(String[] args) {

        //Java da bir önceki class ta yaptiğimiz gibi
        // artirma ve atama, veya artirma veya yazdirma beraber olabilir.

        int a = 20;

        int b = 10;

        System.out.println( b = 2*a); //hem artirma hem de yazdirmayi ayni sout ta yaptik . 40
        System.out.println( a = b - 5); // hem azaltma hemde yazdirma var. a==>35 atar ve yazdirir.

        a =10;

        //önce a nin değerini b 'ye atayin.
        //sonra a yi artirin.

        b = a++;

        System.out.println("a : " + a + " b : " + b); // a : 11, b: 10

        a =10;

        //önce a'nin değerini 1 artirin, sonra a'nin değerini b'ye atayin

        b = ++a;
        System.out.println("a : " + a + " b : " + b); //a :11, b:11

        /* bu kullanim sadece a++ a--  ++a --a için geçerlidir.
        burada ++ ya da -- yi önce mi yoksa sonra mi kullanacağimiza bizden istenen duruma göre karar veririz.

        artirma önce ise ++a
        artirma sonra ise a++
         */


        a=20;
        System.out.println(a++);    // Önce yazdirma sonra artirma :ÖNEMLİDİR. önce 20 olarak yazdirir ve artirir.
        System.out.println(a);      // 21

        a = 20;
        System.out.println(--a); // önce azaltma sonra yazdirma, a'nin değerini önce azaltir, 19 olur,sonra yazdir 19
        System.out.println(a); //19




    }
}
