/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.tanhvu.mathutil.core;

/**
 *
 * @author thanh
 */
public class MathUtil {
    //TDD - TEST DRIVEN Development
    //Test first
    //We thinks about test before think to code
    
    public static long getFactorial(int n){
        if(n<0 || n > 20){
            throw new IllegalArgumentException("n must be between 0..20");
        }
        if(n ==0|| n == 1){
          return 1;
        }
     long product = 1;
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        
        return product;
    }
    
    //sure getF(5) -> 120
    //sure getF(6)-> 720
}
