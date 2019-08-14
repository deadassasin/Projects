import java.util.Scanner;

public class NumberNumber {
    public static void main(String[] args) {
      int array[] = {5,4,6,8};
      boolean last;

        System.out.print("[");
        for( int i =0; i< array.length; i++) {
            last = i == array.length - 1;
            if (last) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i]);
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

}
