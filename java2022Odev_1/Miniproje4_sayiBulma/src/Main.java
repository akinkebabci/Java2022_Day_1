import javax.naming.BinaryRefAddr;

public class Main {
    public static void main(String[] args) {
       int[] sayilar  = new int[]{1,2,5,7,9,0};
       int aranacak = 5;
       boolean varmi = false;
        for (int sayi:sayilar) {
            if (sayi == aranacak){
                varmi = true;
                break;

            }
            else{
                varmi=false;

            }
        }
        if (varmi==true){
            System.out.println("Sayı Mevcut");
        }
        else {
            System.out.println("Sayı Mevcut Değil");
        }
    }
}