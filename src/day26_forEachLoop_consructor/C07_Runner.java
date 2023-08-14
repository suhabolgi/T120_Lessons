package day26_forEachLoop_consructor;

public class C07_Runner {
    public static void main(String[] args) {

        C04 obje;
        // deklarasyon vardır ancak, ete kemiğe bürünmüş bir obje yoktur.

        new C04();
        // objeyi oluşturduk ama sonraki satırlarda kullanamayız.
        // çünkü objeyi atamadık.

        System.out.println(new C04().sayi); // 10

        C04 obj2 = new C04(); // tam bir objedir.

    }
}
