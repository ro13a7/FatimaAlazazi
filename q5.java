import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        System.out.println("ادخل رقمين:");
        Scanner input=new Scanner(System.in);
        int num1,num2;
        num1=input.nextInt();
        num2=input.nextInt();
        System.out.println("جمع العددين هو:"+(num1+num2));
        System.out.println("حاصل ضرب العددين هو:"+(num1*num2));
        System.out.println("المتوسط الحسابي للعددين هو:"+(num1+num2)/2);
        System.out.println("الفرق بين العددين هو:"+(Math.abs(num1-num2)));
        System.out.println("العدد الاكبر هو:"+(Math.max(num1,num2)));
        System.out.println("العدد الاصغر هو:"+(Math.min(num1,num2)));
    }
}
