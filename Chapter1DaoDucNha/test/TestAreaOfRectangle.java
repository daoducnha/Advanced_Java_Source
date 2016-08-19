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
import chapter1daoducnha.Rectangle;
import chapter1daoducnha.Pointer;

/**
 *
 * @author dao duc nha
 * @date 19/8/2016
 * @version 1.0
 * unitTest for calArea()
 * input pointer A, pointer C
 * output Area of Rectangle 
 */
public class TestAreaOfRectangle {
    
    public TestAreaOfRectangle() {
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
        Pointer a = new Pointer(1, 1);
        Pointer c = new Pointer(2, 2);
        Rectangle rtg = new Rectangle(a, c);
        int ac = rtg.calArea();
        int ex = 1;
        assertEquals(ex, ac);
    }
    @Test
    public void test2() {
        Pointer a = new Pointer(0, 1);
        Pointer c = new Pointer(2, 2);
        Rectangle rtg = new Rectangle(a, c);
        int ac = rtg.calArea();
        int ex = 2;
        assertEquals(ex, ac);
    }
    @Test
    public void test3() {
        Pointer a = new Pointer(1, 1);
        Pointer c = new Pointer(1, 1);
        Rectangle rtg = new Rectangle(a, c);
        int ac = rtg.calArea();
        int ex = 0;
        assertEquals(ex, ac);
    }
    @Test
    public void test4() {
        Pointer a = new Pointer(0, 1);
        Pointer c = new Pointer(2, 0);
        Rectangle rtg = new Rectangle(a, c);
        int ac = rtg.calArea();
        int ex = 9;
        assertEquals(ex, ac);
    }
    @Test
    public void test5() {
        Pointer a = new Pointer(-3, 4);
        Pointer c = new Pointer(2, 2);
        Rectangle rtg = new Rectangle(a, c);
        int ac = rtg.calArea();
        int ex = 14;
        assertEquals(ex, ac);
    }
    @Test
    public void test6() {
        Pointer a = new Pointer(-1, -1);
        Pointer c = new Pointer(2, 2);
        Rectangle rtg = new Rectangle(a, c);
        int ac = rtg.calArea();
        int ex = 4;
        assertEquals(ex, ac);
    }
    @Test
    public void test7() {
        Pointer a = new Pointer(-1, 1);
        Pointer c = new Pointer(2, 2);
        Rectangle rtg = new Rectangle(a, c);
        int ac = rtg.calArea();
        int ex = 9;
        assertEquals(ex, ac);
    }
    @Test
    public void test8() {
        Pointer a = new Pointer(0, 1);
        Pointer c = new Pointer(0, 2);
        Rectangle rtg = new Rectangle(a, c);
        int ac = rtg.calArea();
        int ex = 0;
        assertEquals(ex, ac);
    }
    @Test
    public void test9() {
        Pointer a = new Pointer(1, 0);
        Pointer c = new Pointer(2, 0);
        Rectangle rtg = new Rectangle(a, c);
        int ac = rtg.calArea();
        int ex = 0;
        assertEquals(ex, ac);
    }
    @Test
    public void test10() {
        Pointer a = new Pointer(1, 1);
        Pointer c = new Pointer(1, 1);
        Rectangle rtg = new Rectangle(a, c);
        int ac = rtg.calArea();
        int ex = 1;
        assertEquals(ex, ac);
    }
}
