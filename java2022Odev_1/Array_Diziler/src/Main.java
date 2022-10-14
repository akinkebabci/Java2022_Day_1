public class Main {
    public static void main(String[] args) {

        String[] ogrenciler = new String[]{"Akın", "Mehmet", "Salih"};
        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }
        System.out.println("For Dongusu İle Ogrenciler Ekrana Basıldı");

        for (String ogrenci:ogrenciler) {
            System.out.println(ogrenci);
        }
        System.out.println("Foreach ile ogrenciler Dizisi Ekrana Basıldı");
        //Bu şekilde de Array Dizilerine Ekleme Yapılabilir
        String[] sehirler = new String[3]; //3 Yazdığımız yerin anlamı array içinde 3 adet eleman olucak demek
        sehirler[0] = "Adıyaman";        //0. indexine Eklendi
        sehirler[1] = "Gaziantep";       //1. İndexine Eklendi
        sehirler[2] = "Kahramanmaraş";   //2. İndexine Eklendi



        for (int i = 0; i < sehirler.length; i++) {
            System.out.println(sehirler[i]);

        }
        System.out.println("Sehirler İsimli Dizi For Döngüsü İle Ekrana Basıldı ");
    }
}