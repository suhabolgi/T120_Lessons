package day44_maps;

public class C00_MapsHakkinda_BNergiz {
    /*
    1-  Map : Map bugune kadar gordugumuz tum Java yapilarindan farklidir.

    2-  Map’i diğer java yapilarindan ayiran en buyuk özelliği key-value yapisinda olmasidir.

    3-  Java map’deki elementleri key'e göre tuttuğu için key değerleri unique olmalidir.
        Eğer map'de var olan bir key ile yeni element eklemek istersek, eski value silinip
        yeni eklenen value o key ile ilişiklendirilir.

    4-  Map güncel projelerde kullanilan data base’e en yakin Java objesidir. Özellikle ihtiyaç olduğunda
        nested map'ler kullanilarak bir cok uygulamanın java versiyonu yapilabilir.

    5-  Bir obje içerisinde tutulan data ne kadar kompleks olursa, o datalara erişim ve update o kadar zor olur.

    6-  Map'de bir bilgiye ulaşmak ve update etmek bir cok işlem gerektirdiğinden,
        genellikle bu tür işlemleri method olarak olusturmayi tercih ederiz.

    7-  Method'larda istediğimiz bilgiye ulasincaya kadar map’i parçalara ayirip, istediğimiz bilgiye ulastiktan
        veya update ettikten sonra yeniden map'e eklememiz ve map’i güncellememiz gerekir.

    8- Bu tur kompleks islemleri, her seferinde yeniden kodlamak yerine ilk istendiginde method olarak olusturup
        sonra ihtiyac durumunda, o method'u kullanmak daha mantikli olur. Bir map ile islem yapmak istedigimizde
        ilk bakacagimiz sey istenen bilginin key mi yoksa value'da mi bulundugudur.

     */

    /*
    ==> Maps Classindan olusturulan objelerin, özelliklerini_value'lerini siralarken , -,/, gibi ayiraclar kullanilir.
    ==> her bir value için aynı ayraclar kullanilir.
    ==> MAP larda bir objenin ozellikleri bir satirda, bir bütün olarak barindirilir.
    ==> Aralari - veya / gibi özel karakterlerle ayrilan, objenin farkli ozelliklerini StringManipulations
        yardimiyla parca parca aliriz ve kullaniriz.
    ==> ogrenciMap.put(106-KEY, "Sevgi-Can-10-K-MF"-VALUE);
    ==> Birden fazla bilgi barindiran bu kadar komplex bir yapiyi maptan baska bir yapiyla yönetemeyiz.
    ==> Her bir elemantin, 123="String", bir KEY'i bir de VALUE'si vardir.
  */


    /*
    ==> Eger sadece value'de olan bir bilgiyi ariyorsak:
            1- tum value'leri bir Collection olarak kaydedelim
            2- bir for-each loop ile herbir value'yu ele alalim
            3- value'lar belirli bir ayirac ile birlestirilen String'lerden olustugu icin
                bu ayirac kullanilarak split() ile bir array'e donusturulebilir
            4- artik bir array ve icerisinde value'yu olusturan bilgiler mevcut  istenen bilgiyi,
                array'den index ile alabiliriz
    ==> Eger her bir key'e ulasmak istiyorsak:
            1- tum key'leri bir Set olarak kaydedelim
            2- bir for-each loop ile her bir key'i ele alalim
            3- bu sekilde ulastigimiz key'in value'larina da artik ulasmak mumkundur.*/


    /*
            eger hem key, hem de value ile islem yapmamiz gerekirse mecburen key'lerin bulundugu Set
            ve value'larin bulundugu Collection objelerini beraber yonetmemiz gerekiyordu.

            Java key ve value'lari birlikte barindirmasi icin Entry isimli bir class olusturmustur.
            Entry ile key ve value'yu birlikte kullanabilir, entry uzerinde yapilan update'leri
            otomatik olarak map'e isleyebiliriz.
            Map.Entry<Integer,String>
       */
     /*
            map'de bir value'yu update etmek istersek
            1- bilgiye ulasmak icin yaptigimiz gibi adim adim value'yu array'e cevirmeliyiz
                - key ile value'yu cagiririz
                - value'yu array'e ceviririz
                - array'de istedigimiz update'i yapariz
            2- bilgiye ulasmak icin parcaladigimiz value'yu yeni haliyle tekrar birlestiririz
            3- key ve yeni value'yu kullanarak, map'i update ederiz
 */

}

