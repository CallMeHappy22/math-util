/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.tanhvu.mathutil.core;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author thanh
 */
//Ta se dung ky thuat tét data driven Testing/parameterzed Test
//Xet cho bai getF()
//Bo data, dat o txt, Excel,table/db
//0 -> 1
//1 -> 1
//2 -> 2
//3 -> 3
//4 -> 24
//5 -> 120
//fill bo data nay vao ham getF() + assert
//Tach bach data va loi goi ham check kq 
//Data driven testing - tham so hoa
@RunWith(value = Parameterized.class)
public class AdvanceFactorialTest {

    //Chuan bi data truoc
    //Neu de file ngoai, thi phai them doan code de doc data vao...
    @Parameters
    public static Object[][] initData() {
        return new Integer[][]{
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 6},
            {4, 24},
            {6, 720},};
    }

    @Parameter(value = 0)
    public int n; //Ban muon tinh  may giai thua tra ve bao nhieu

    @Parameter(value = 1)
    public long expected; //Ban ky vong giai thua tra ve bao nhieu

    @Test
    public void checkFactorialGivenRightArgumentReturnsWell() {
        Assert.assertEquals(expected, MathUtil.getFactorial(n));

    }

}
