package day29_passByValue;

public class C01_StatikBlocks {

    C01_StatikBlocks(){
        System.out.println("parametresiz konstructor çalıştı");

    }

    public static void main(String[] args) {
        System.out.println("main metod çalıştı");
        C01_StatikBlocks obj = new C01_StatikBlocks();
        System.out.println("obje oluşturuldu");


    }
    static { // class çalışmaya başlamadan hemen önce statik blok çalışır. ilk olarak
        System.out.println("statik blok çalıştı");
    }
    static {
        System.out.println("statik blok 2 çalıştı");
    }
    {
        System.out.println( "Statik olmayan bir blok çalıştı.");
        // oble oluşturulduğunda çalışır.
    }
}
