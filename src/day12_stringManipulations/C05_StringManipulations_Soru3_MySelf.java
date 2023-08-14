package day12_stringManipulations;

public class C05_StringManipulations_Soru3_MySelf {
    public static void main(String[] args) {

        //Soru 3 :
        // Kullanicidan alinan metindeki istenmeyen rakam ve ozel karakterleri silip,
        // sadece ilk harfi buyuk diger harfler kucuk harf yapan bir program yazin.

        //input : java1 ogRe2@nMek3 #ne +Gu=zel
        //output : Java ogrenmek ne guzel.

        String metin = "java1 ogRe2@nMek3 #ne +Gu=zel";
        metin = metin.replaceAll("\\d", "");
        System.out.println(metin);

        //java ogRe@nMek #ne +Gu=zel
        metin = metin.replaceAll("\\s", "1");
        System.out.println(metin);
        //java1ogRe@nMek1#ne1+Gu=zel

        metin = metin.replaceAll("\\W", "");
        System.out.println(metin);
        //java1ogRenMek1ne1Guzel

        metin = metin.replaceAll("\\d", " ");
        System.out.println(metin);
        //java ogRenMek ne Guzel

        metin= metin.toLowerCase().replaceFirst("j", "J");
        System.out.println(metin);
        //Java ogrenmek ne guzel

    }
}
