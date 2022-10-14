public class DortIslem {
    public static int Topla(int... number){
        int result = 0;
        for (int num:number) {
            result+=num;
        }
        return result;
    }
    public static int Carp(int... number){
        int result =1;
        for (int num:number) {
            result*=num;
        }
        return result;
    }
    public static int bol(int num1,int num2){
        return num1/num2;
    }
}
