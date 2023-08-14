package day36_inheritanceDataTypeKullanimi;

public class DVariableRunner {

    public static void main(String[] args) {

        // Oncelikle objemizi CAvciKuslar Classindan olusturuyorum.
        CAvciKuslar avciKusKartal = new CAvciKuslar();

        System.out.println(avciKusKartal.hareket); // C  ucarlar.
        System.out.println(avciKusKartal.beslenme); // C et yerler.
        System.out.println(avciKusKartal.pence); // C pencelidirler.
        System.out.println(avciKusKartal.gaga); // C sivri gagalidirlar.
        // buraya kadar olan özellikleri constreuctor ile class aynı (data türü) olduğunda geçerlidir.
        System.out.println(avciKusKartal.kanat); // B kanarlidirlar.
        System.out.println(avciKusKartal.solunum); // B akciğer
        System.out.println(avciKusKartal.cogalma); // B yumurta ile çoğalirlar.
        System.out.println(avciKusKartal.omur); // A yasar ve olur.



        BKuslar kusKartal = new CAvciKuslar();   // Aramaya BKuslar Classindan baslar ve Parents'a kadar gider.
        System.out.println(kusKartal.hareket); // A hareket ederler
        System.out.println(kusKartal.beslenme); // A beslenirler.
        // kusKartal.pence.sout  B ve A Classinda yok CTE verir.
        System.out.println(kusKartal.gaga); // B gagalari vardir.
        System.out.println(kusKartal.kanat); // B kanatlidirlar.
        System.out.println(kusKartal.solunum); // B akciğerle nefes alirlar.
        System.out.println(kusKartal.omur); // A yasar ve olurler



        AHayvan hayvanKartal = new CAvciKuslar(); // Aramaya AHayvan Classindan baslar. kendisi Parantdir.
        System.out.println(hayvanKartal.hareket);  // A hareket ederler
        System.out.println(hayvanKartal.solunum); // A nefes alirlar
        System.out.println(hayvanKartal.beslenme); // A beslenirler
        System.out.println(hayvanKartal.cogalma); // A cogalirlar.
        System.out.println(hayvanKartal.omur); // A yasar ve olurler.
        // hayvanKartal.pence.sout   olusturuldugu class parent oldugundan bakacagi class olmadigindan CTE verir
        // hayvanKartal.gaga.sout    olusturuldugu class parent oldugundan bakacagi class olmadigindan CTE verir
        // hayvanKartal.kanat.sout   olusturuldugu class parent oldugundan bakacagi class olmadigindan CTE verir


        /*
        Java'da en klasik obje olusturma yontemi
        ClassAdi  obj = new ClassAdi();
        ama Child class'in constructor'i kullanilarak olusturulan objeler icin
        data turu Parent class'lar olarak secilebilir
        Eger constructor ve data turu farkli ise
        objenin ozelliklerini aramaya DATA TURU olan class'dan baslanir
        EGER ozellikler variable olarak olusturuldu ise
        objenin ozelliklerini DATA TURU belirler
     */



    }
}
