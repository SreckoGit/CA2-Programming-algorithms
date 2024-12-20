package src;

import java.util.Scanner;

public class MultiplicationTable2D {
     
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          //getting the user info for the table
          System.out.println("Enter the size of multiplication table:");
          int n = scanner.nextInt();

          // Step 2: Create a 2D array to store the multiplication table
          int[][] myTable = new int[n][n];

          //populating the matrix, +1 is added to the i and j in multiplicationso that 1 is the starting minimum, or we would have zeroes everywhere
          for(int i = 0; i < n; i++){
               for(int j = 0; j < n; j++){
                    myTable[i][j] = (i + 1) * ( j + 1); 
               }
          }

          //getting it printed out
          System.out.println("Multiplication table:");
          for (int i = 0; i < n; i++) {
               for (int j = 0; j < n; j++){
                    System.out.printf("%4d", myTable[i][j]); //added some spacing, 4 spaces to each
               }
               System.out.println(); //new line after row, outer loop is rows, ,inner are columns
          }
          scanner.close();
     }
}
