import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        int sum=0;
        System.out.println("please enter the word:");
        Scanner x=new Scanner(System.in);
        String word=x.next();
        for(int i=0;i<word.length();i++)
        {
         if (word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='y'||word.charAt(i)=='o'||word.charAt(i)=='u')
             sum++;
        }

        System.out.println(sum);
    }
}
