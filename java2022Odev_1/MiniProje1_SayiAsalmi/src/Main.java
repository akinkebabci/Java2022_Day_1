public class Main {
    public static void main(String[] args) {
/*      Benim yazdığım Algoritma
        int sayi = 4;
        int sonuc = (int) Math.pow(2, sayi) % sayi;
        if (sonuc == 2 && sayi / 1 == sayi) {
            System.out.println("Sayı Asal");
        } else {
            System.out.println("Sayı Asal Değil");
        }*/

        int sayi = 4;
        boolean isPrime = true;
        for (int i = 2; i < sayi ; i++) {
            if(sayi % i == 0 ){
                isPrime = false;
            }
        }
        if(isPrime){
            System.out.println(sayi+" Asal Sayidır");
        }
        else {
            System.out.println(sayi+" Asal Sayı Değildir");
        }
    }
}