package day19_scope;

public class C01_Scope {
    static int classLevelStatik = 12;

    String strClassLevelStatikOlmayan = "Java güzeldir";



    public static void main(String[] args) {
        int sayiMain = 20;

        System.out.println(classLevelStatik); // statik olduğundan burada da kullanilir.
        // System.out.println(strClassLevelStatikOlmayan); statik olmayan bir variable başka statik
        // metodlarda kullanılamaz. bu sefer method seçici olur.

        for (int i = 0; i <10 ; i++) {
            int sayiForLoop =5;
            System.out.println(classLevelStatik);
        }
    }

    public static void statikMethod() {
        String strStatikMethod = "Java Candir";

        System.out.println(classLevelStatik); // statik olduğundan burada da kullanilir.
        //System.out.println(strClassLevelStatikOlmayan); statik olmayan bir variable başka statik
        // metodlarda kullanılamaz. bu sefer method seçici olur.




    }

    public void statikOlmayan() {
        boolean blStatikOlmayanMethod = true;
        classLevelStatik =40;

        System.out.println(classLevelStatik); // statik olduğundan burada da kullanilir.
        System.out.println(strClassLevelStatikOlmayan); // statik olmadiğindan statik olmayan bir metodda kullanilir.


    }
     /*
        Scope temelde 2'ye ayrilir
            1- Local variable'lar
                A - scope'lari icinde olusturulduklari kod blogudur
                    bir method'da olusturulan variable, baska method'dan KULLANILAMAZ
                B - Loop Scope'u
                    bir loop icerisinde olusturulan variable
                    sadece o loop icerisinde kullanilabilir
                    olusturuldugu method'da loop'un disinda da KULLANILAMAZ
               Not: local variable'lar deger verilmeden olusturulabilir
                    ama deger atanmadan KULLANILAMAZ
           2- Class Level Variable'lar
              Class level variable'lar method'larin ve kod bloklarinin disinda olusturulur
              ve scope'lari TUM CLASS'dir.
              Class level variable'larin scope'u tum class olsa da
              static keyword de variable'larin kullanimina etki eder

              hastane ismi, hastane adresi, bashekim adi gibi variable'lar
              herkes icin ortak olmalidir.
              bu tur variable'lar static olarak isaretlenir.

              personel ismi, personel adresi, personel telefonu gibi variable'lar ise
              tum personel icin tanimli olmakla birlikte
              bu variable'lardaki degisim herkesi ETKILEMEZ
              sadece o personeli etkiler
              bu tur varianble'lari ise static yapmayiz
              static olmayan class level'daki variable'lara INSTANCE variable'lar denir

                C - class level static variable'lar
                    bu variable'lar static klubune uye olduklari icin
                    her yere gidebilirler
                    her method'dan kullanilabilirler
                D - class level instance variable'lar
                    variable static olmayinca ustunlugu olmaz
                    bu durumda secici olan method olur

                    static method'lar instance variable'larin girmesine izin vermez
                    ama static olmayan method'lar,
                    static olmayan(instance) variable'lari kabul eder
     */



}
