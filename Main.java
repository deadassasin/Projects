import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        //User input
        Scanner input = new Scanner(System.in);

        //User guide
        System.out.println("Check if your number can be divided by 3 and 5 at the same time.");
        System.out.println("Please input your number and press enter: ");
        
        //Value that we will use for if/else loop
        double userInput = input.nextDouble();

        // if/else loop for dividing by 3 and 5 at the same time
        if(userInput % 3 == 0 && userInput % 5 == 0){
            System.out.println(True);
        }
        else{
            System.out.println(false);
        }

    }
}
