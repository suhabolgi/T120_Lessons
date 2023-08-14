package day26_forEachLoop_consructor;

public class C09_CarRunner {
    public static void main(String[] args) {

        C08_Car car1 = new C08_Car();

        System.out.println(car1.marka);// marka yok
        System.out.println(car1.model); // model yok

        System.out.println(car1);
        // == >C08_Car{marka='marka yok', model='model yok', yil=1990, fiyat=0, renk='renk belirtilmedi',
        // renk='renk belirtilmedi'}

        car1.marka="Ford";
        car1.model ="Mondeo";
        car1.yil =2009;
        car1.fiyat=42000;
        car1.renk = "bej";

        System.out.println(car1);
        // C08_Car{marka='Ford', model='Mondeo', yil=2009,
        // fiyat=42000, renk='bej', renk='bej'}

        C08_Car car2 = new C08_Car();
        System.out.println(car2);
        // C08_Car{marka='marka yok', model='model yok',
        // yil=1990, fiyat=0,
        // renk='renk belirtilmedi',
        // renk='renk belirtilmedi'}

        car2.marka = "Honda";
        car2.renk = "mavi";
        car2.fiyat = 8000;

        System.out.println(car2);
        // C08_Car{marka='Honda', model='model yok',
        // yil=1990, fiyat=8000,
        // renk='mavi', renk='mavi'}

        C08_Car car3 = new C08_Car();
        System.out.println(car3);
        // Araba bilgileri ==> marka:'Marka belirtilmemis',
        // model:'Model belirtilmemis', yil:1900, fiyat:0,
        // renk:'Renk belirtilmemis'


    }


}
