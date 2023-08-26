package day38_abstractClasses;

public abstract class F_Hemsire extends D_Personel{

    /*
        Abstract bir class'i parent edinen
        abstract child class parent class'daki zorunlu method'lari implement etmek zorunda degildir.

        parent'daki abstract method'lari implement etmek zorunda degildir,
        ama isterse implement edebilir. ÇUNKU kendisi de artik bir ARA ÇATİDİR. kendisi de kural koyabilir.
     */

    public abstract void sertifika();
    public abstract void nobet();

    @Override
    public void standartMaas() {
        System.out.println("Tum hemsireler icin standart maas 20.000 TL");
    }
    // istedigimiz zaman public abstract void standartMaas(); i da implement ederiz.
    // eger bu Class abstract Class olmasaydi bu metodu zorunlu implement etmek zorundaydik.
}