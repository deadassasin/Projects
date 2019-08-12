import java.util.Scanner;

public class Palindom {


    public static void main(String[] args) {
            Scanner input  = new Scanner(System.in);
            String word;
            String reverse = "";

            System.out.println("Input your word: ");
            word = input.nextLine();

            for(int i = word.length()-1; i >=0; i--){
                reverse = reverse + word.charAt(i);
            }
            if(word.equals(reverse)){
                System.out.println(true);
            }
            else{
                System.out.println(false);
            }
        }
    }


