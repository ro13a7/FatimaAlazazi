import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        int x,y;
        Scanner input=new Scanner(System.in);
        System.out.println("ادخل طول المستطيل:");
        System.out.println("ادخل عرض المستطيل:");
        x=input.nextInt();
        y=input.nextInt();
        System.out.println("مساحة المستطيل هي:"+(x*y));
        System.out.println("محيط الدائرة :"+ 2*(x+y));


    }
}
