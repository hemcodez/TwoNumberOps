import java.util.Scanner;

public class TwoNumbersOps {
    public static void main(String[] args) {

        //Ask user to input num1 variable
        System.out.println("Enter a number: ");

        //Create scanner object
        Scanner input = new Scanner(System.in);

        //Get input from user
        int num1 = input.nextInt();

        //Ask user to input num2 variable
        System.out.println("Enter a second number: ");

        //Get input from user
        int num2 = input.nextInt();

        //Display chosen numbers as output
        System.out.println("You've entered: "+num1+" and "+num2);

        /* Calculate num1 and num2 with
        arithmetic operators and display as output */
        int sum = num1 + num2;
        System.out.println(num1+" + "+num2+" = " + sum);
        int sub = num1 - num2;
        System.out.println(num1+" - "+num2+" = " + sub);
        int mult = num1 * num2;
        System.out.println(num1+" * "+num2+" = " + mult);
        double doubleDiv = (double)num1 / (double)num2;
        System.out.println(num1+" / "+num2+" = " +doubleDiv);

    } //end main
 } //end class
