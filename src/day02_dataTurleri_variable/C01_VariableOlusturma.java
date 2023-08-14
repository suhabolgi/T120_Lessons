package day02_dataTurleri_variable;

public class C01_VariableOlusturma {

    public static void main(String[] args) {

        int sayi;

        // deklerasyon sadece bir kez yapılabilir.
        //ama değer ataması istenildiği kadar alabilir.
        // boolean sayi ; kabul etmez.

        // bir variable değer atanmadan da deklare edilebilir, ancak değer atanmayan bir variable kullanılamaz.

        // System.out.println(sayi);

        sayi = 20 ;

        System.out.println(sayi); // 19. satırda sayi variable'nin değeri 20 dir.

        sayi = sayi + 10 ; // java da önce değer hesaplanır yani sağ taraf, sonra atama yapar.

        System.out.println(sayi); //23. satırda sayi variable'nin değeri 30 dur.


    }
}
