import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        System.out.println("ادخل رقما:");
        Scanner x=new Scanner(System.in) ;
        int num=x.nextInt();
        System.out.println("الجذر الثاني هو:"+(num*num));
        System.out.println("الجذر الثالث هو:"+ (num*num*num));
        System.out.println("الجذر الرابع هو:" + Math.pow(num,4));




    }

}
