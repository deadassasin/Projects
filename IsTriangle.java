import java.util.Scanner;

public class IsTriangle{

    public static void main(String [] args) {
        //User input method
        Scanner userInput = new Scanner(System.in);

        //User guide and input
        System.out.println("Chceck if those walls can make a triangle.");
        System.out.println("Please input the first number: ");
        double a = userInput.nextDouble();
        System.out.println("Please input the second number");
        double b = userInput.nextDouble();
        System.out.println("Please input the third number");
        double c = userInput.nextDouble();
ś
        //if/else loop
        if(a < 0 || b < 0 || c <0){
            throw new IllegalArgumentException("It is impossivle to have a wall with negative measurements.");
        }
        else if((a + b) > c && (b + c) > a && (c + a) > b){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}