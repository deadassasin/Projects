public class MultiArrays {


    public static void main(String[] args) {

        int array1[][] = {{2, 4, 5, 6}, {10, 13, 14, 18}};
        int array2[][] = {{22, 34, 55, 16}, {57, 56, 55, 54}, {123, 124, 125, 126}};


        MultiArrays multiArrays = new MultiArrays();

        System.out.println("\nArray number 1:");
        multiArrays.display(array1);
        System.out.println();
        System.out.println("Array number 2:");
        multiArrays.display(array2);





    }
    public static void display(int n[][]){
        for(int row = 0; row <n.length; row++){
            for(int column = 0; column < n[row].length; column++){
                System.out.print(n[row][column] + "\t");
            }
            System.out.println();
        }
    }

}
