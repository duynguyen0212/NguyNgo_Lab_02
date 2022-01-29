/*
 * Name: Ngoc Duy Nguyen
 * Date: January 25th, 2022
 * Description: Working with Arrays
 */
package Lab_02;
public class Main {
    /**
     * This function display my full name
     */
    public static void displayName(String name) {
        System.out.print("(1) Full name: ");
        System.out.println(name);
    }
    /**
     * This function display 1D array
     */
    public static void displayArrays(int[] a) {
        System.out.print("\n(2) Print 1D array: ");
        for(int i=0; i< a.length; i++)
            System.out.print(a[i] + " ");

    }
    /**
     * This function display 2D array
     */
    public static void display2DArrays(int[][] c) {
        System.out.println("\n\n(3) Print 2D array: ");
        for (int[] ints : c) {
            for (int j = 0; j < c[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
    /**
     * This function check if two 1D arrays are equal or not
     */
    public static boolean equalArray1(int[]a, int[]b){
        boolean equal1 = true;
        for(int i=0; i<a.length; i++){
            if(a[i] != b[i]){
                equal1 = false;
                break;}
        }
        return equal1;
    }
    /**
     * This function check if two 2D arrays are equal or not
     */
    public static boolean equalArray2(int[][]c, int[][]d){
        boolean equal2 = true;
        int flag = 0;
        for (int i=0; i<c.length; i++){
            for(int j=0; j<c[0].length; j++){
                if(c[i][j] != d[i][j])
                    flag++;
            }
        }
        if (flag>0)
            equal2 = false;
        return equal2;
    }
    /**
     * This function calculate sum of 1D array
     */
    public static int sum1(int[] array){
        int sum = 0;
        for(int i=0; i<array.length; i++)
            sum += array[i];
        return sum;
    }
    /**
     * This function calculate sum of 2D array
     */
    public static int sum2(int[][] array){
        int sum1 = 0;
        for (int i=0; i<array.length; i++){
            for(int j=0; j<array[0].length; j++)
                sum1 += array[i][j];
        }
        return sum1;
    }
    /**
     * Multiply the matrix
     */
    public static int[][] multiplyMatrices(int[][]c, int[][]d){
        int[][] array = new int[2][3];
        for (int i=0; i<c.length; i++){
            for(int j=0; j<c[0].length; j++)
                array[i][j] = c[i][j]*d[i][j];
        }
        return array;
    }
    /**
     * Display the matrix
     */
    public static void displayMatrix(int[][] matrix)
    {
        System.out.println("\n(8)Multiplied matrix:");
        for (int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    /**
     * Main function
     * @param args The main function will execute the tasks in Lab_02
     */
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5}, b = {1,2,7,4,5};
        int[][] c = {{1,3,5},{2,4,6}}, d = {{1,8,5},{2,4,6}};

        String fullName = "Ngoc Duy Nguyen";
        displayName(fullName);

        displayArrays(a);

        display2DArrays(c);

        System.out.println("\n(4) Determine if two 1D array are equal:");
        if(equalArray1(a,b))
            System.out.println("Two arrays are equal");
        else
            System.out.println("Two arrays are not equal");

        System.out.println("\n(5) Determine if two 2D array are equal:");
        if(equalArray2(c,d))
            System.out.println("Two 2D-arrays are equal");
        else
            System.out.println("Two 2D-arrays are not equal");

        System.out.println("\n(6)Sum of 1D Array a is: " + sum1(a));
        System.out.println("\n(7)Sum of 2D Array c is: " + sum2(c));

        int[][] matrix = multiplyMatrices(c,d);
        displayMatrix(matrix);
    }
}
