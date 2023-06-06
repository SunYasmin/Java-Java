package day01variables;

import java.security.PublicKey;

public class Variables01 {

    //Variable nasil olusturulur?

    //1)Access Modifier     2)Data Type   3)Variable name   4)    =       5)Deger     6)  ;

    // Javada ";"  ingilizcedeki  "."  gibidir.
    // Ingilizce'de  "cumle" deriz. Java'da statment deriz.

    // "=" sembolu "Assignment(Atama) Operator" olarak adlandirilir.
    // "Assignment (Atama) Operator" sagdaki degeri alirsoldaki variable'in icine koyar

    public int age = 13;
    public int height = 183;

                    //Java'da Data Type'lari
    /*
                    PRIMITIVE DATA TYPES (METHOD OLMAYANLAR)

    1)int: Integer'in kisaltmasi. Integer tamsayi demektir.  32 bit kullanir
           Matematik'de tamsayilarin basi ve sonu yoktur. Ancak Java'da tamsayilarin basi ve sonu vardir.
           En kucuk int = -2,147,483,648
           En buyuk int = +2,147,483,647

           Neden sayilar bu sekilde ayrilmistir : sayi cok buyukse veya cok kucukse memory de cok yer kaplar. Memory i tasarruflu kullanmak applicationlar icin cok onemlidir.
           Memory tasarruflu kullanirsak application hizli calisir ve ucuza malolur. O nedenle java sinir belirlemistir.
           Bu sayilar gunluk hayatta kullanilan sayilara gore ayarlanmis bolunmustur.

    2)byte: Tamsayilar icin kullanilir. 8 bit kullanir (byte integer a gore memory de daha az yer kaplar.)
            En kucuk byte = -128
            En buyuk byte = 127

    3)short: Tamsayilar icin     16 bit kullanir
             En buyuk short = -32768
             En buyuk short = 32767

    4)long: Tamsayilar icindir  (Nufus, insan vucudu hucre sayisivb...)
            En kucuk long = -9,223,372,036,854,775,808
            En buyuk long = 9,223,372,036,854,775,807

    5)float: Ondalikli sayilar icindir.   (fiyat icin tercih edilir)
             "float" virgulden sonra 7 basamak icerebilir.
             "float" degerlerinde sona "f" veya "F" yazmamiz gerekir.  (f yazmak istenmez genelde o nedenle double kullanilir)

    6)double: Ondalikli sayilar icindir.  (Hassas degerler icin)
              "double" virgulden sonra 16 basamak icerebilir.

    7)boolean : "true" veya "false" degerleri icin kullanil,r. 1 bit kullanir. 0 ise false / 1 ise true

    8)char: Tek karakter icin kuallanilir. 16 bit kullanir
            A, c, 2, 7, _, "
            Note: "char"lara deger verirken , degeri tek tirnak arasinda yazmak gerekir. Yoksa hata verir.

            Note: Java buyuk kucuk harfe duyarlidir.
                  Java icin TRUE ile true tamamen farklidir.

            Note: Numeric Data Types: byte < short < int < long < float < double    float long u icerir o nedenle ondaliklilar sonda
                  Numeric Olmayan Data Types : boolean + char    (Interview sorusu data type lari say memory hangisi az kullanir)


                                NOT PRIMITIVE DATA TYPES (METHOD OLAN)

     String: Isim, adres, kimlik no gibi bir veya birden fazla karakter iceren degerlerde kullanilir.
             String degerleri mutlaka cift tirnak arasina konulmalidir.
             String non-primitive dir. Yani bir String olusturdugunuzda Java size bir suru method verir.

     Interview sorusu: Primitive ile Non Primitive Data Type arasindaki farklar nelerdir;
                       1) Non-primitive data type larinda degerin yaninda methodlar vardir
                          Primitive data type larinda ise sadece deger vardir, method yoktur
                       2) Primitive Data Type lari Java tarafindan olusturulmustur, toplam 8 tanedir, biz Primitive Data Type olusturamayiz
                          Non-Primitive data typelari Java tarafindan da olusturulmustur, biz de olusturabiliriz.
                          Non-Primitive sayilamayacak kadar coktur. Cunku her developer non primitive data type olusturabilir
                       3) Primitive data Typelari kucuk harflerle baslayarak isimlendirilir
                          Non primitive data type isimleri buyuk harfle baslar (class adi buyuk harfle baslar non primitive class ayni zamanda non primitive data type dir)
                       4) Primitive data typelar memory de farkli buyuklukte yerler kullanir.
                          Non-Primitive lerin hepsi memory de ayni buyuklukte yer kullanirlar.


     */

    public byte price = 12;   //(Java memory de once bos bir konteyner olusuyor byte int icin ve 0 veriyor sonra sagdan verdimiz degeri assign ediyor. 12 yapiyor)
                              //Okul application i int kullanilacak bir sayi araligi yok o zaman byte kullanilmak durumunda)
    public short populationOfVillage = 23000;

    public float priceOfShirt = 13.99f;
    public double weightOfCell = 0.000000001203467;

    //Siz "long" sayi yazmaniza ragmen javaverilen sayiyi "int" kabul eder
    //Bu yuzden, long bir variable'a "int" araliginin disinda bir sayi verirseniz mutlaka sonuna "L" veya "l" yaziniz. (Genelde buyuk L kucuk l 1 ile karisiyor)
    public long populationOfWorld = 200000000000L;

    //Burada "L" koymadigimiz halde problem yok cunku "1234" int araligina uyar longsa L yazmak gerek
    public long x = 1234;

    public boolean isOld = true;
    public boolean isRich = false;

    public char initial = 'Y';  // initial baslangic ilk harf

    public String  name = "Tom Hanks";

    //main method arabanin methodu gibidir. Main method calismadan hicbirsey calismaz.
    public static void main(String[] args) {   //kisayol psvm yaz gelsin

    }
}
