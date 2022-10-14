import java.awt.*;

public class Main {

    public static void main(String[] args) {
	int sayi1 = 400;
    int sayi2 = 20;
    int sayi3 = 30;
    int enBuyuk = sayi1;

    if (enBuyuk<sayi2){
        enBuyuk=sayi2;
    }
    if (enBuyuk<sayi1){
        enBuyuk=sayi3;
    }
    System.out.println("en büyük sayi"+enBuyuk);



    }
}
