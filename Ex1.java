public class Ex1 {
    private int balance,inserest,rate,years;
    public Ex1(int intinal_balance,int intinal_rate)
    {
        balance=intinal_balance;
        rate=intinal_rate;
    }
    public void year()
    {
        for (int i=1;balance<=1000000;i++)
        {
            inserest=balance*rate/100;
            balance=balance+inserest;
            years++;
        }
        System.out.println(years);
    }
    public void get_balance()
    {
        System.out.println(balance);
    }
}
