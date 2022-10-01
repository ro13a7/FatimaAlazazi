import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
     int sum_even=0;
     int sum_odd=0;
   for (int i=2;i<=100;i++)
       if (i%2==0)
           sum_even++;
       System.out.println(sum_even);
        System.out.println("Enter two integer borders:");
        Scanner x=new Scanner(System.in);
        int n1=x.nextInt();
        int n2=x.nextInt();
        for  (int i=n1;i<=n2;i++)
            if(i%2!=0)
                sum_odd++;
        System.out.println(sum_odd);
        System.out.println("please enter numbers");
        int num=x.nextInt();
        while (num>0)
        {
            int digit=num%10;
            if (digit%2!=0)
            {
                sum_odd=sum_odd+digit;
            }
            num=num/10;
        }
        System.out.println(sum_odd);
    }


    }


