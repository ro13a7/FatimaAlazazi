import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        System.out.println("enter 3 numbers:");
        Scanner in=new Scanner(System.in);
        int num1=in.nextInt();
        int num2=in.nextInt();
        int num3=in.nextInt();
        if(num1>=num2 & num2>=num3) System.out.println("in order");
        else if(num1<=num2 & num2<=num3) System.out.println("in order");
        else System.out.println("not in order");

    }
}
