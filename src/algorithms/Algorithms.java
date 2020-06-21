/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import java.util.Arrays;


public class Algorithms {

    
    public static void main(String[] args) {
        
        System.out.println(Fibonacci.findNthFibonacci(18975));
        
        //1902'ye kadarki sayıların asal olup olmadığını ve asal çarpanlarını yazdırır.
        for(int i = 2; i < 26540; i++){
            System.out.println(i + " " + PrimeNumbers.isPrime(i));
            //System.out.println(PrimeNumbers.findPrimeFactors(i).toString());
        
        }
        //Gönderilen değere kadar olan asal sayıları bulur.
        //System.out.println(PrimeNumbers.sieveOfEratos(291).toString());


        
        
    }
    
    
}
