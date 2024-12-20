package src;

import java.util.HashSet;
import java.util.Scanner;


public class FirstRepeatedElement {
//WHY HASH SET AND NOT DOUBLE LOOPS? 
//BETTER PERFORMANCE

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          // Input: size of the array
          System.out.print("Enter the size of the array: ");
          int n = sc.nextInt();

          // creating the new array of size we gave
          int[] arr = new int[n];
          System.out.println("Enter the elements of the array:");
          for (int i = 0; i < n; i++) { //loop untill we reach the max num of elements in the array
               arr[i] = sc.nextInt();   // - collect the int
          }

          // calling the function that will check for repeating elements and returns 1st 
          //we are sending the created array and it's length
          int result = findFirstRepeatedElement(arr, n);

          // Output the result
          if (result == -1) {
               System.out.println("No repeated elements found.");
          } else {
               System.out.println("The first repeated element is: " + result);
          }
          sc.close();
     }


     //-----------------method------------------
     // Function to find the first repeated element, this returns second element when it finds it as a duplicate 
     static int findFirstRepeatedElement(int[] arr, int n) {
          HashSet<Integer> set = new HashSet<>(); // will track my elements i've seen already

          for (int i = 0; i < n; i++) {
               if (set.contains(arr[i])) {  //if set contains element at array index i
                    // If the element is already in the set, it's the first repeated element
                    return arr[i];
               }
               set.add(arr[i]); // it's being added to the set, meaning it's not there, on goes the next one which checks 
          }
          return -1; // No repeated element found
     }
}
