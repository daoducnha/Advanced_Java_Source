/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import task1_2.Calculate;

/**
 *
 * @author dao duc nha
 * @date 19/8/2016
 * @version 1.0
 * unitest for division()
 * input num1 num2
 * output num1/num2
 */
public class TestDiv {
    
    public TestDiv() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void test1() {
        Calculate cal = new Calculate(0, 1);
        double ac = cal.division();
        double ex = 0;
        assertEquals(ex, ac,0.1);
    }
     @Test
    public void test2() {
        Calculate cal = new Calculate(1, 1);
        double ac = cal.division();
        double ex = 1;
        assertEquals(ex, ac,0.1);
    }
     @Test
    public void test3() {
        Calculate cal = new Calculate(1, 2);
        double ac = cal.division();
        double ex = 0.5;
        assertEquals(ex, ac,0.1);
    }
     @Test
    public void test4() {
        Calculate cal = new Calculate(1, 3);
        double ac = cal.division();
        double ex = 0.333;
        assertEquals(ex, ac,0.1);
    }
     @Test
    public void test5() {
        Calculate cal = new Calculate(1, 5);
        double ac = cal.division();
        double ex = 0.2;
        assertEquals(ex, ac,0.1);
    }
     @Test
    public void test6() {
        Calculate cal = new Calculate(0, 0);
        double ac = cal.division();
        double ex = 0;
        assertEquals(ex, ac,0.1);
    }
     @Test
    public void test7() {
        Calculate cal = new Calculate(1, 0);
        double ac = cal.division();
        double ex = 0;
        assertEquals(ex, ac,0.1);
    }
     @Test
    public void test8() {
        Calculate cal = new Calculate(1, 2);
        double ac = cal.division();
        double ex = 0.7;
        assertEquals(ex, ac,0.1);
    }
     @Test
    public void test9() {
        Calculate cal = new Calculate(3, 2);
        double ac = cal.division();
        double ex = 1.6;
        assertEquals(ex, ac,0.1);
    }
     @Test
    public void test10() {
        Calculate cal = new Calculate(4, 2);
        double ac = cal.division();
        double ex = 3;
        assertEquals(ex, ac,0.1);
    }
    
}
