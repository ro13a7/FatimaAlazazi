import java.util.Scanner;
public class CounterEX1 {
        private int counter;
        public void increasing()
        {
            counter=counter+1;
        }
        public void display_value()
        {
            System.out.println(counter);
        }
        public int undo()
        {
            if(Math.max(counter,0)==counter&counter!=0)
            {
                counter=counter-1;
                return counter;
            }
           else return 0;
        }

}
