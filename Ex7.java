import java.util.Scanner;

public class Ex7 {
   public static void main(String[] args) {
       System.out.println("please enter a number:");
       Scanner x=new Scanner(System.in);
       int num=x.nextInt();
       for (int i=num;num>0;i--)
       {
           int m=num%2;
           num=num/2;
           System.out.println(m);
       }


   }}

