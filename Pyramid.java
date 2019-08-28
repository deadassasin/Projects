import java.util.InputMismatchException;
import java.util.Scanner;

public class Pyramid {

    boolean check;
    int i,j,k,number;
    Scanner userInput;

    public Pyramid() {

        while (check == false) {

            try {
                userInput = new Scanner(System.in);
                System.out.println("Enter number of layers for your Pyramid: ");
                number = userInput.nextInt();
                System.out.print("\n");

                for (i = 1; i <= number; i++) {
                    for (j = i; j < number; j++)
                        System.out.print(" ");
                    for (k = 1; k < (i * 2); k++)
                        System.out.print("*");
                    System.out.print("\n");

                    check = true;
                }

            } catch (InputMismatchException a) {
                System.out.println("Please use only numbers");
                check = false;
            }

        }
    }
        public static void main (String[]args){
            Pyramid obj = new Pyramid();
        }
    }

