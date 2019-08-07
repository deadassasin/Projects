import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class getNumberFromArray {

    public static void main(String[] args) throws IOException {
        boolean isPresent = false;
        Integer index = null;
        int array[] = { 12,16,17,10,4,3,5};

        System.out.println("Input then number that you want to find: ");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String userInput = reader.readLine();

        Integer userNumber = Integer.valueOf(userInput);

        for(int i=0; i<array.length; i++){
            if(array[i] == userNumber) {
                isPresent = true;
                index = i;
            }
        }

        if(isPresent == true){
            System.out.println("The element that you are looking for is present at index number: " + (index + 1));
        }
        else{
            System.out.println("Sorry but the element that you are looking for is not present in this array.");
        }

    }
}
