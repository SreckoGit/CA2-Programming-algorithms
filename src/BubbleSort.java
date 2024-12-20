import java.util.Scanner;

public class BubbleSort {

     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          //Accept the size of the array
          System.out.print("Enter the size of the array: ");
          int size = scanner.nextInt();

          //read the elements of the array
          int[] arr = new int[size];
          System.out.println("Enter the elements of the array:");
          for (int i = 0; i < size; i++) {
               arr[i] = scanner.nextInt();
          }

          // Display the array before sorting
          System.out.println("Array before sorting:");
          displayArray(arr);

          // Sort the array using Bubble Sort
          int swapCount = bubbleSort(arr);

          // Display the array after sorting
          System.out.println("Array after sorting:");
          displayArray(arr);

          //Display the total number of swaps
          System.out.println("Total number of swaps: " + swapCount);

     }
     
     //------------METHOD------------------------

     // Bubble Sort algorithm implementation
     private static int bubbleSort(int[] arr) {
          int n = arr.length;
          int swapCount = 0;
          boolean swapped;

          // Perform n-1 passes
          for (int i = 0; i < n - 1; i++) {
               swapped = false;

               // Compare adjacent elements
               for (int j = 0; j < n - 1 - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                         // Swap the elements using temporary placeholder
                         int temp = arr[j];
                         arr[j] = arr[j + 1];
                         arr[j + 1] = temp;

                         // Increment swap count each time this code was executed
                         swapCount++;

                         swapped = true; //control 
                    }
               }

               // If no swaps were made in this pass, the array is already sorted
               if (!swapped) {
                    break;
               }
          }

          return swapCount;
     }

     //method to display an array
     private static void displayArray(int[] arr) {
          for (int element : arr) {
               System.out.print(element + " ");
          }
          System.out.println();
     }
}
