public class Main {
    public static void main(String[] args) {
        DortIslem dortIslem = new DortIslem();
        int sonuc = dortIslem.Topla(2,3,4);
        System.out.println(sonuc);
        int sonuc2 = dortIslem.Carp(2,3,4,5);
        System.out.println(sonuc2);
        int sonuc3 = dortIslem.bol(7,2);
        System.out.println(sonuc3);

    }
}