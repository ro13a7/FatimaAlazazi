import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        System.out.println("ادخل ثلاثة ارقام:");
       Scanner in=new Scanner(System.in);
        int num1=in.nextInt();
        int num2=in.nextInt();
        int num3=in.nextInt();
        if(num1>=num2 & num2>=num3) System.out.println("تناقص");
        else if(num1<=num2 & num2<=num3) System.out.println("تزايد");







    }
}
