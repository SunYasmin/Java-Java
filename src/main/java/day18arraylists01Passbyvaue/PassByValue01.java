package day18arraylists01Passbyvaue;

public class PassByValue01 {

    /*
        1)Java variable'larin orijinal degerlerini korumak ister.
        2)Variable method'lar icinde kullanildiginda, Java method'un
          icine orijinal degeri koymaz. O degerin kopyasini uretir.
          ve method'a o kopyayi yollar. Method kopya ustunde degisiklik
          yapar. Dolayisiyla variable'nin orijinal degeri korunmus olur.
          Bu sistemi "Pass By Value" denir.
          Note: Java "Pass By Value" kullanir. "Pass By Reference" kullanmaz.
          Note: Bazi programlama dilleri orjinal degeri koruma altina
          almamistir. Bu isi developer'lara birakmistir.
          Bu tarz diller "Pass By Reference" kullanir.
    */
    public static void main(String[] args) {

        int x = 5;// Gomlek

        System.out.println(x);//5

        //static method olan "main method" un icindeki hersey
        // static olmalidir.

        change (x);// Ogrenci gomlegi
        System.out.println(x);// Gomlek
//        int ucret =100;
//        int kopya = indirim(ucret);
//        System.out.println(kopya);
//        System.out.println(ucret);
        int ucret =100;
        ucret = indirim(ucret);
        System.out.println(ucret);
    }
    public static void change(int a) {
        System.out.println(a*3);


    }

    //void disindaki "return" type'larda method body'si icinde
    //"return" keyword kullanilmalidir.
    public  static int indirim (int gomlekUcreti) {
        return gomlekUcreti - 10;
    }

}
