import java.lang.reflect.Type;

public class Main {
    public static void main(String[] args) {
        char harf = 'b';
        if (harf == 'a' || harf == 'ı' || harf == 'o' || harf == 'u') {
            System.out.println("Kalın harf");
        } else if (harf == 'e' || harf == 'i' || harf == 'ö' || harf == 'ü') {
            System.out.println("İnce Harf");
        } else {
            System.out.println("Sessiz harf");
        }


    }
}
