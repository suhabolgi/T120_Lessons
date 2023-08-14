package day12_stringManipulations;

public class C04_NullPointer {
    public static void main(String[] args) {

        String str1 ;       // str1 i declare ettik ama değer atamadik.

        // System.out.println(str1); deger ataması  olamdiğindan hata verir
        // str1.concat(" candir.");

        str1 = "Java";
        System.out.println(str1);
        System.out.println(str1.concat(" candir."));  // Java candir.

        // null bir değer değildir. POINTER dir. yani isaretleyicidir. okumasi ise , str2 null olarak isaretlenmiştir.
        // str2'ye deger atamadik. bunun farkindayiz, VE NULL OLARAK İSARETLEDİK.
        //19. satira, str2 ye deger atandi veya null degeri atandi ifadesi yanlistir.

        String str2 = null;
        System.out.println(str2); // null yazdirir.
        System.out.println(str2 + " Candir"); //null Candir

        // System.out.println(str2.concat(" candir."));        //  NullPointerException ----------HATA
        // yani null bir deger degildir. o yuzden bir metod da da kullanamazsin demektedir.
        // Java null olarak isaretlenmiş bir variable'i yazdirir ama metod olarak kullanmamiza izin vermez.

        str2 = "tava";
        System.out.println(str2.concat(" candir.")); // tava candir.

        String str3= null;
        String str4 = "";

        System.out.println(str4.isBlank()); // true
        System.out.println(str4.isEmpty());    // true

        // System.out.println(str3.isBlank());     // NullPointerException

        // hiçten değer olur ama null dan deger olmaz.

       // System.out.println(str3.isEmpty()); NullPointerException


    }
}
