import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("please enter the word that you want to seprate:");
        String word=x.next();
        for (int i=word.length();i>0;i--)
        {
            System.out.println(word.charAt((word.length()-i)));
        }
    }
}
