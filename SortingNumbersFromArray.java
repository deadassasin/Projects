public class SortingNumbersFromArray {



    public static void main(String[] args) {
        int array[] = {5,4,9,8,6};
        int temp;

        boolean solved = false;
        while(solved == false) {
            solved = true;

            //array length - 1 (swapping 4 times not 5)
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                    solved = false;
                }
            }
        }
            for(int i=0; i < array.length; i++){
                System.out.println(array[i]);
            }
        }


    }

