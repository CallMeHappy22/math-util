/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.tanhvu.mathutil.core;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author thanh
 */
public class FactorialTest {
  @Test  //Bien ham di cung annotation nay thanh ham main()
  public void checkFactorialGivenRightArgumentReturnsWell(){
      long expected = 120; // tui hi vong 120 tra ve 
      long actual = MathUtil.getFactorial(5);//hien thi tui tinh 5!
      
      Assert.assertEquals(expected, actual);
      Assert.assertEquals(720, MathUtil.getFactorial(6));
      Assert.assertEquals(1,MathUtil.getFactorial(0));
      
      
  }
  //Bat xem, test xem ham co nem ve ngoai le nhu ky vong ko
  //VD neu ta tinh getF(-5) -> Nem ra ngoai le
  // neu dung goi ham getF(-5) ham nem ra ngoai le thi ham viet dung
  //Right, ta co mau xanh
  //Ham dua am nem ngoai le, thuc su chay nem ra that
  //co nghia la dung, dung ky vong
  //Junit 4 coi ngoai lw ko la gia tri, ko assertEquals(ngoaile,actual)
  
@Test(expected = IllegalArgumentException.class)
public void checkFactorialGivenWrongArgumentThrowsException(){
    MathUtil.getFactorial(-5);//Phai nem ngoai le thi moi la dung
}
  
}
//Chot ha cho xanh do 
//XANH: kHI MOI ECPECTED VA ACTUAL PHAI KHOP NHAU
