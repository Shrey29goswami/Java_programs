import java.text.NumberFormat;
import java.util.Locale;
import java.util.Currency;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
        //throws Exception
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value:= ");
        double payment = in.nextDouble();
        in.close();
        // Get the instance
        NumberFormat nF = NumberFormat.getCurrencyInstance(Locale.US);
 
        // Stores the values
        String values= nF.getCurrency().getDisplayName();
       
          //double amount = 4538.89;
 
        // Prints the currency
        System.out.println(values);
       
          // Print amount in defined currency
        System.out.println(nF.format(payment));
    }
}