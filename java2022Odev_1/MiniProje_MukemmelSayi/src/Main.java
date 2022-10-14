public class Main {
    public static void main(String[] args) {
        int number = 495;
        int sonuc = 0;

            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    sonuc = sonuc + i;
                }
            }
        if(number==sonuc){
            System.out.println("Mükemmel sayı");

        }
        else{
            System.out.println("Mükemmel sayı değildir");
        }

    }
}