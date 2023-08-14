package day34_inheritance;

public class DRunner {
    public static void main(String[] args) {
        Corolla corolla = new Corolla();
        // artik bir tane corolla arabamiz var.

        System.out.println(corolla.uretimYeri);
        // Sakarya/Türkiye
        System.out.println(corolla.model); //Corolla
        System.out.println(corolla.aku); //Inci aku
        System.out.println(corolla.sanziman); // Ctv

        // yukaridakilerin tatami Corolla Class'indaki özelliklerdi.ve
        // dava önde başka class dan obje olusturarak zaten aynisini yapmistik :))

        System.out.println(corolla.marka); // Toyota bu özellik parentsdan geldi
        System.out.println(corolla.lastik); // Pirelli bu özellik BToyota Classından geldi
        System.out.println(corolla.guvenlik); //  tum toyotalar extra guvenliklidir.
        System.out.println(corolla.fren);// Toyota araclar abs fren sistemini kullanirlar

        // araba Classından aldiği özellikler
        System.out.println(corolla.yakit); // yakit turu belirtilmedi
        corolla.yakit="Benzin";
        System.out.println(corolla.yakit);// Benzin
        System.out.println(corolla.yil); //1900
        System.out.println(corolla.renk); // Renk belirtilmedi


    }
}
