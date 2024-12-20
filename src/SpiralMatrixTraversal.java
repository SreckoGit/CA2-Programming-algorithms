package src;

import java.util.Scanner;

public class SpiralMatrixTraversal {

     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          // Input dimensions of the matrix, i went for irregular sizes option this time
          System.out.println("Enter the number of rows:");
          int rows = scanner.nextInt();
          System.out.println("Enter the number of columns:");
          int cols = scanner.nextInt();

          // Create and populate the matrix
          int[][] matrix = new int[rows][cols];
          System.out.println("Enter the elements of the matrix:");
          for (int i = 0; i < rows; i++) {
               for (int j = 0; j < cols; j++) {
                    matrix[i][j] = scanner.nextInt();
               }
          }

          // Perform spiral traversal
          System.out.println("Spiral order traversal of the matrix:");
          spiralTraversal(matrix, rows, cols);

          scanner.close();
     }

     // Function to perform spiral traversal
     public static void spiralTraversal(int[][] matrix, int rows, int cols) {
          // Define the initial boundaries, defined before while to be changed inside the traversing loops and still be available next run
          int top = 0; // Top row boundary
          int bottom = rows - 1; // Bottom row boundary
          int left = 0; // Left column boundary
          int right = cols - 1; // Right column boundary

          // Traverse the matrix while the boundaries are valid/not crossing each other
          while (top <= bottom && left <= right) {

               // 1. Traverse from left to right along the top row
               for (int i = left; i <= right; i++) {
                    System.out.print(matrix[top][i] + " ");
               }
               top++; // Move the top boundary down, on first run this turns top to 1 so
                    //the last element in row is not included in column traversal, and new while loop run will start from here next time


               // 2. Traverse from top to bottom along the right column,
               //i is the first matrix[] and ensures we are coming down with each loop, and right value ensures we are on the border, that will be shrinked after loop finishes and we are done with the border, so in a 3x4 column matrix this would be [0][4]-[1][4]-[2][4]
               for (int i = top; i <= bottom; i++) {
                    System.out.print(matrix[i][right] + " ");
               }
               right--; // Move the right boundary left


               // 3. Traverse from right to left along the bottom row (if still within bounds), right value was changed with right-- after we traversed the right column and is not taken into account as starting i, and with in loop i-- we are going left with each iteration, and upon finishing, moving the bottom up with bottom--.
               if (top <= bottom) {
                    for (int i = right; i >= left; i--) {
                         System.out.print(matrix[bottom][i] + " ");
                    }
                    bottom--; // Move the bottom boundary up
               }


               // 4. Traverse from bottom to top along the left column (if still within bounds), bottom was changed in previous block and top was changed in first, left was unchanged and we are moving up until we get to top, after that we do left++ and go to while loop check and start over with left to right reading first block
               if (left <= right) {
                    for (int i = bottom; i >= top; i--) {
                         System.out.print(matrix[i][left] + " ");
                    }
                    left++; // Move the left boundary right
               }
          }
     }
}
