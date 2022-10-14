public class Main {
    public static void main(String[] args) {
        //For
        for (int i = 0; i < 10; i += 2) {
            System.out.println(i);
        }
        System.out.println("For dongusu Bitti");
        //While
        int sayac = 0;
        while (true) {
            System.out.println(sayac);
            sayac++;
            if (sayac == 100) {
                break;
            }
        }
        System.out.println("While dongusu Bitti");
        //DoWhile
        int sayac2 = 1;
        do {
             System.out.println(sayac2);
             sayac2++;
             if (sayac2==20){
                 break;
             }
        } while (true) ;
            System.out.println("DoWhile Dongusu Bitti");

        }
}