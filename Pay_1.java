import java.util.Scanner;       //to be able to read from the keyboard

/**
 *Student Name: M Ramolla
 * Student Number: ST200215340
 */
public class Pay_1 {

    public static void main(String[] args) {
      
        //create a Scanner object to read from the keyboard
        Scanner keyboard = new Scanner(System.in);
        double hours;
        double rate;
        double pay = 0;

        //display prompts and get input
        System.out.print("How many hours did you work? ");
        hours = keyboard.nextDouble();
        System.out.print("How much do you get paid per hour? ");
        rate = keyboard.nextDouble();

        //calculations
        if (hours <= 40) {
            // Calculate gross pay for 40 hours or less
            pay = hours * rate;
        } else {
            // Calculate gross pay for more than 40 hours
            pay = hours * (rate * 1.5);
        }
        
        //display results
        System.out.println("You earned R " + pay);
    }
    
}
