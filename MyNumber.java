import java.util.Scanner;

public class MyNumber {



    public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
        System.out.println("Please input your main number: ");
        double number = userInput.nextDouble();
        System.out.println("Now input your power number: ");
        double power = userInput.nextDouble();


        System.out.println("The number is even: " + (number % 2 == 0));
        System.out.println("The number is even" + (number % 2 == 1));
        System.out.println("The root of " + (number) + " is equal: " + (Math.sqrt(number)));
        System.out.println((number) + " raised to the power of " + (power) + " is equal: " + (Math.pow(number,power)));
    }

}
