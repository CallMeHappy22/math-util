/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tanhvu.mathutil.main;

import com.tanhvu.mathutil.core.MathUtil;

/**
 *
 * @author thanh
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("0! = 1?" + MathUtil.getFactorial(0));
        System.out.println("1! = 1?" + MathUtil.getFactorial(1));
        System.out.println("5! = 120?" + MathUtil.getFactorial(5));
    }
}
