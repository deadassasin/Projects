import java.util.Scanner;

public class Binary {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bin[] = new int[255];
        int i = 0;
        int number = input.nextInt();

        while(number != 0){
            bin[i] = number%2;
            number = number/2;
            i++;
        }
        for(int j = i-1; j>=0; j--){
            System.out.println(bin[j]);
        }
    }
}
