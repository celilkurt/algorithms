/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import java.util.Arrays;


public class Algorithms {

    
    public static void main(String[] args) {
        
        int[] arr = {46,23,46,2345,1,45,46,89690,46,45,46,2344,46,123,40,45};
        MergeSort.mergeSort(arr, 0, arr.length);
        
        System.out.println(Arrays.toString(arr));
        
        //System.out.println(Fibonacci.findNthFibonacci(18975));
        
        
        
    }
    
    
}
