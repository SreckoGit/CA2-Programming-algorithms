//https://github.com/SreckoGit/CA2-Programming-algorithms/tree/f36a90029143f4df8624d11d42ab49af23125976/src
package src;

import java.util.Scanner;

public class DiagonalSumMatrix {
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          // getting the user info for the table
          System.out.println("Enter the size of matrix:");
          int n = scanner.nextInt();

          // Step 2: Create a 2D array to store the multiplication table
          int[][] myMatrix = new int[n][n];

          // populate with numbers
          for (int i = 0; i < n; i++) {
               for (int j = 0; j < n; j++) {
                    System.out.printf("Element at (%d, %d): ", i + 1, j + 1);
                    myMatrix[i][j] = scanner.nextInt();
               }
          }

          //Calculate the sum of the main and secondary diagonals, initialized values
          int mainDiagonalSum = 0;
          int secondaryDiagonalSum = 0;

          for (int i = 0; i < n; i++) {
               mainDiagonalSum += myMatrix[i][i]; // Main diagonal elements
               secondaryDiagonalSum += myMatrix[i][n - i - 1]; // Secondary diagonal elements
          }

          // Step 5: Output the results
          System.out.println("\nMatrix:");
          for (int i = 0; i < n; i++) {
               for (int j = 0; j < n; j++) {
                    System.out.printf("%4d", myMatrix[i][j]);
               }
               System.out.println();
          }

          System.out.println("\nSum of main diagonal: " + mainDiagonalSum);
          System.out.println("Sum of secondary diagonal: " + secondaryDiagonalSum);

          scanner.close();
     }

}
