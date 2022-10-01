public class Test2 {
    public static void main(String[] args) {
        CounterEx2 tally = new CounterEx2();
        tally.click();
        tally.click();
        tally.click();
        tally.click();
        tally.click();
        tally.click();
        tally.click();
        tally.click();
        tally.click();
        tally.click();
        tally.click();
        int result = tally.getValue();
        System.out.println(tally.getValue());
        System.out.println("results: " + result);
    }
}
