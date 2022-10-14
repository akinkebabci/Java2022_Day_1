public class Main {
    public static void main(String[] args) {
        String mesaj = "  Bugün Hava çok Güzel.  ";
        System.out.println(mesaj);
        System.out.println("Eleman Sayısı " + mesaj.length()); //lenght bir dizinin eleman sayısını gösterir
        System.out.println("5 Eleman  " + mesaj.charAt(4)); //charAt verilen bir index numarasında hangi eleman olduğunu döner
        System.out.println(mesaj.concat(" Yaşasın")); //concat bir diziyle başka bir diziyi birleştirmek için kullanılır
        System.out.println(mesaj.startsWith("B"));//Startswith bir dizinin içinde verdiğimiz değerle başlıyormu-True veya -False döner
        System.out.println(mesaj.endsWith("."));//endswith bir dizinin içinde verdiğimiz değerle bitiyormu -True veya -False döner
        System.out.println(mesaj.toLowerCase());//bir dizenin bütün elemanlarını küçük hale getirir
        System.out.println(mesaj.toUpperCase());//dizenini bütün karakterlerini büyük yaptı

        char[] karakterler = new char[5];
        mesaj.getChars(0, 5, karakterler, 0);//getchars bir dize içerisindeki verilen indixler arasındakı karakterleri belirttiğimiz char arrayinin içine atar
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("a"));//indexOf bir dizi içerisinde belirtilen karakterin en sağdan kaçıncı index te olduğunu bulur
        System.out.println(mesaj.lastIndexOf("e"));//lastindexOf bir dizi içerisinde belirtilen karakterin en soldan başlayarak kaçıncı index te olduğunu bulur
        System.out.println(mesaj.replace(" ", "/"));//replace bir karakter dizisinde belirtiğimiz karakteri deiştirmek i.in kullanılır
        System.out.println(mesaj.substring(6, 10));//substring bir karakter dizisinde belirtilen indixten belirtien indexe kadar olan karakterleri kesip alır.
        System.out.println(mesaj.split(" "));//split bir karakter dizisini belirtiğimiz yerden parçalayarak bir array sınıfına atar
        for (String kelime : mesaj.split(" ")) {
            System.out.println(kelime);}
        System.out.println("mesaj.split Başarılı Bir şekilde foreach dongüsü ile ekrana bastırıldı");
        System.out.println(mesaj.strip());//strip bir karakter dizisinin başındaki ve sonundaki boşlukları silmek için kullanılır
        System.out.println(mesaj.trim());//trim bir karakter dizisinin başındaki ve sonundaki boşlukları silmek için kullanılır
    }
}