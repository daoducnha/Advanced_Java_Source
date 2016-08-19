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
import chapter1daoducnha.Calculate;

/**
 *
 * @author dao duc nha
 * @date 19/8/2016
 * @version 1.0
 * unitTest for addition()
 * input num1 num2
 * output num1+num2
 */
public class TestAdd {
   
    public TestAdd() {
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
         Calculate cal = new Calculate(0,0);
         int ac = cal.addition();
         int ex = 0;
         assertEquals(ac, ex);
    }
    
    @Test
    public void test2() {
         Calculate cal = new Calculate(1,0);
         int ac = cal.addition();
         int ex = 1;
         assertEquals(ac, ex);
    }
    
    @Test
    public void test3() {
         Calculate cal = new Calculate(0,1);
         int ac = cal.addition();
         int ex = 1;
         assertEquals(ac, ex);
    }
    
    @Test
    public void test4() {
         Calculate cal = new Calculate(1,2);
         int ac = cal.addition();
         int ex = 3;
         assertEquals(ac, ex);
    }
    
    @Test
    public void test5() {
         Calculate cal = new Calculate(-1,1);
         int ac = cal.addition();
         int ex = 0;
         assertEquals(ac, ex);
    }
    
    @Test
    public void test6() {
         Calculate cal = new Calculate(0,0);
         int ac = cal.addition();
         int ex = 1;
         assertEquals(ac, ex);
    }
    
    @Test
    public void test7() {
         Calculate cal = new Calculate(1,0);
         int ac = cal.addition();
         int ex = 0;
         assertEquals(ac, ex);
    }
    
    @Test
    public void test8() {
         Calculate cal = new Calculate(0,1);
         int ac = cal.addition();
         int ex = 0;
         assertEquals(ac, ex);
    }
    
    @Test
    public void test9() {
         Calculate cal = new Calculate(1,-2);
         int ac = cal.addition();
         int ex = 1;
         assertEquals(ac, ex);
    }
    
    @Test
    public void test10() {
         Calculate cal = new Calculate(1,2);
         int ac = cal.addition();
         int ex = 2;
         assertEquals(ac, ex);
    }
}
