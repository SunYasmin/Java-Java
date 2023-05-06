package day18arraylists01Passbyvaue;

public class PostPreIncrementDecrement {

    public static void main(String[] args) {


        int a = 5;    //Post Increment (sonra arttir demek)
        int b =  a ++ ;

        System.out.println(b); //5
        System.out.println(a); //6 ==> Cunku Java a'nin degerini b'nin icine koyduktan
        // sonra okumaya devam etti a arttigi icin 6 gorundu. "Post Increment" denir.


        //Pre Increment
        int c = 10;
        int d = ++c;
        System.out.println(d);//11
        System.out.println(c);//11 ==> c arttirdiktan sonra yazdirdigimiz icin oda 11 gozukecek

        //Post Decrement
        int e = 20;
        int f = e--;
        System.out.println(f);//20
        System.out.println(e);//19

        //Post Decrement
        int h = 30;
        int i = --h;
        System.out.println(i);//29
        System.out.println(h);//29
    }

}
