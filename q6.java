import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        int x;
        double pi=3.14,area;
        Scanner input=new Scanner(System.in);
        System.out.println("ادخل نصف قطر الدائره:");
       x=input.nextInt();
       area=pi*x*x;
        System.out.println("مساحة الدائرة هي:"+area);
    }
}
