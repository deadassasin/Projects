import java.util.Scanner;

public class IsEven {

    //Main
    public static void main(String[] args) {
        //User input
        Scanner input = new Scanner(System.in);

        //User guide
        System.out.println("Check if your number is even.");
        System.out.println("Please input your number and press enter: ");

        //User input for if/else loop
        double userNumber = input.nextDouble();

        //if/else loop
        if(userNumber % 2 == 0 ){
                    System.out.println(true);
                }
        else{
                System.out.println(false);
        }
    }
}
