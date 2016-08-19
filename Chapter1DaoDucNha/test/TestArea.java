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
import chapter1daoducnha.Circle;
import chapter1daoducnha.Pointer;

/**
 *
 * @author dao duc nha
 * @date 19/8/2016
 * @version 1.0
 * unitTest for Area()
 * input pointer O, pointer R
 * output Area of Circle 
 */
public class TestArea {

    public TestArea() {
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
        Pointer o = new Pointer(0, 0);
        Pointer r = new Pointer(1, 1);
        Circle c = new Circle(o, r);
        double ac = c.calArea();
        double ex = 6.28;
        assertEquals(ac, ex, 0.1);
    }

    @Test
    public void test2() {
        Pointer o = new Pointer(0, 0);
        Pointer r = new Pointer(1, 2);
        Circle c = new Circle(o, r);
        double ac = c.calArea();
        double ex = 15.7;
        assertEquals(ex, ac, 0.1);
    }

    @Test
    public void test3() {
        Pointer o = new Pointer(0, 1);
        Pointer r = new Pointer(1, 1);
        Circle c = new Circle(o, r);
        double ac = c.calArea();
        double ex = 3.14;
        assertEquals(ex, ac, 0.1);
    }

    @Test
    public void test4() {
        Pointer o = new Pointer(1, 1);
        Pointer r = new Pointer(1, 1);
        Circle c = new Circle(o, r);
        double ac = c.calArea();
        double ex = 0;
        assertEquals(ex, ac, 0.1);
    }

    @Test
    public void test5() {
        Pointer o = new Pointer(1, 0);
        Pointer r = new Pointer(1, 1);
        Circle c = new Circle(o, r);
        double ac = c.calArea();
        double ex = 3.14;
        assertEquals(ex, ac, 0.1);
    }

    @Test
    public void test6() {
        Pointer o = new Pointer(0, 0);
        Pointer r = new Pointer(0, 1);
        Circle c = new Circle(o, r);
        double ac = c.calArea();
        double ex = 3;
        assertEquals(ex, ac, 0.1);
    }

    @Test
    public void test7() {
        Pointer o = new Pointer(2, 2);
        Pointer r = new Pointer(1, 1);
        Circle c = new Circle(o, r);
        double ac = c.calArea();
        double ex = 6;
        assertEquals(ex, ac, 0.1);
    }

    @Test
    public void test8() {
        Pointer o = new Pointer(0, 0);
        Pointer r = new Pointer(-1, 1);
        Circle c = new Circle(o, r);
        double ac = c.calArea();
        double ex = 6;
        assertEquals(ex, ac, 0.1);
    }

    @Test
    public void test9() {
        Pointer o = new Pointer(0, 0);
        Pointer r = new Pointer(1, -1);
        Circle c = new Circle(o, r);
        double ac = c.calArea();
        double ex = 6;
        assertEquals(ex, ac, 0.1);
    }

    @Test
    public void test10() {
        Pointer o = new Pointer(0, -1);
        Pointer r = new Pointer(1, 1);
        Circle c = new Circle(o, r);
        double ac = c.calArea();
        double ex = 1;
        assertEquals(ex, ac, 0.1);
    }
}
