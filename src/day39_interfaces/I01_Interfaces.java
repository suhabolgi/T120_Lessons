package day39_interfaces;

public interface I01_Interfaces {


    int sayi=10;
    final int sayi2 = 20;  // gereksiz bir yazimdir. o yuzden gri ile belirtir.
    static int sayi3 = 30; // gereksiz bir yazimdir. o yuzden gri ile belirtir.
    public int sayi4 = 40; // gereksiz bir yazimdir. o yuzden gri ile belirtir.
    public static final int sayi5 = 50; // gereksiz bir yazimdir. o yuzden gri ile belirtir.



    void method1(); // abstract Classlarda abstract yazmadigimda body'siz yazmamiza izin vermiyordu.

    abstract int  method2(); // gereksiz bir yazimdir. o yuzden gri ile belirtir.
    public String method3(); // gereksiz bir yazimdir. o yuzden gri ile belirtir.

    public abstract void method4(); // gereksiz bir yazimdir. o yuzden gri ile belirtir.
}