package day38_abstractClasses;

public class G_ServisHemsiresi extends F_Hemsire{



    @Override
    public void mesai() {

    }

    @Override
    public void yillikIzin() {

    }

    @Override
    public void sertifika() {

    }

    @Override
    public void nobet() {

    }
    /*ÇOK ONEMLI. daha once abstract Classlarda abstract olarak olusturulan metodlarin BODY'si olusturulmuşsa
    burada olusturmak zorunda degildir. ama istersek de implement edebiliriz.
    örnegin public abstract class F_Hemsire extends D_Personel{ Classinda olusturulan,
    public void standartMaas() {
        System.out.println("Tum hemsireler icin standart maas 20.000 TL");
    } metodunun body'si olusturuldugu icin artik zorunlu degildri. istersek implement edebiliriz.*/
}