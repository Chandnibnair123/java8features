

package java8;

import java.util.Arrays;

public class Class12 {

    public static void main(String[] args) {  

        int[] arr = {4,0,5,2,1,9};  

        for (int i : arr) {  
            System.out.print(i+" ");  
        }  

        Arrays.parallelSort(arr); 
        System.out.println("\narray elements after sorting");  

        for (int i : arr) {  
            System.out.print(i+" ");  
        }
    }
}
       
