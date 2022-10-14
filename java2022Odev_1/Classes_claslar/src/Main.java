public class Main {
    public static void main(String[] args) {
        //referance type(Referans tip)
        CustomerMenager customerMenager = new CustomerMenager();
        CustomerMenager customerMenager2 = new CustomerMenager();
        customerMenager=customerMenager2;
        customerMenager2.add();
        customerMenager2.Remove();
        customerMenager2.Update();
        customerMenager.add();
        customerMenager.Remove();
        customerMenager.Update();

        //Value Type-değer tipli(int,Sting,boolean..vs)
        int sayi = 10;
        int sayi2 = 20;
        sayi2=sayi;
        sayi2=30;
        System.out.println(sayi);

        int[] sayilar1 = new int[]{1,2,3};
        int[] sayilar2 = new int[]{4,5,6};
        sayilar2=sayilar1;
        sayilar1[0] = 10;
        System.out.println(sayilar2[0]);
    }
}

