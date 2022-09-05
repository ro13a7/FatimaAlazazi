import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        System.out.println("ادخل قيمة المتغير x:");
        Scanner input=new Scanner(System.in) ;
        int x=input.nextInt();
        System.out.println("ادخل قيمة المتغير y:");
        int y=input.nextInt();
int z=x;
x=y;
y=z;
        System.out.println("بعد التبديل x=:" +x);
        System.out.println("بعد التبديل y=:" +y);


    }

}
