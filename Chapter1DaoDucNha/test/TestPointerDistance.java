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
import chapter1daoducnha.MainPointer;
import chapter1daoducnha.Pointer;
import chapter1daoducnha.Distance;

/**
 *
 * @author dao duc nha
 * @date 19/8/2016
 * @version 1.0
 * unitest for calDistance()
 * input pointer p1, p2;
 * output distance p1 and p2;
 */
public class TestPointerDistance {
    
    public TestPointerDistance() {
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
        Pointer p1 = new Pointer(1, 1);
        Pointer p2 = new Pointer(1, 2);
        Distance dis = new Distance(p1, p2);
        double ac = dis.calDistance();
        double ex = 1;
        assertEquals(ex, ac,0.1);
    }
    
    @Test
    public void test2() {
        Pointer p1 = new Pointer(1, 1);
        Pointer p2 = new Pointer(1, 3);
        Distance dis = new Distance(p1, p2);
        double ac = dis.calDistance();
        double ex = 2;
        assertEquals(ex, ac,0.1);
    }
    
    @Test
    public void test3() {
        Pointer p1 = new Pointer(0, 1);
        Pointer p2 = new Pointer(1, 2);
        Distance dis = new Distance(p1, p2);
        double ac = dis.calDistance();
        double ex = 1.414;
        assertEquals(ex, ac,0.1);
    }
    
    @Test
    public void test4() {
        Pointer p1 = new Pointer(1, 1);
        Pointer p2 = new Pointer(2, 2);
        Distance dis = new Distance(p1, p2);
        double ac = dis.calDistance();
        double ex = 1.414;
        assertEquals(ex, ac,0.1);
    }
    
    @Test
    public void test5() {
        Pointer p1 = new Pointer(7, 1);
        Pointer p2 = new Pointer(7, 2);
        Distance dis = new Distance(p1, p2);
        double ac = dis.calDistance();
        double ex = 1;
        assertEquals(ex, ac,0.1);
    }
    
    @Test
    public void test6() {
        Pointer p1 = new Pointer(1, 1);
        Pointer p2 = new Pointer(1, 5);
        Distance dis = new Distance(p1, p2);
        double ac = dis.calDistance();
        double ex = 1;
        assertEquals(ex, ac,0.1);
    }
    
    @Test
    public void test7() {
        Pointer p1 = new Pointer(2, 1);
        Pointer p2 = new Pointer(1, 2);
        Distance dis = new Distance(p1, p2);
        double ac = dis.calDistance();
        double ex = 1;
        assertEquals(ex, ac,0.1);
    }
    
    @Test
    public void test8() {
        Pointer p1 = new Pointer(1, 2);
        Pointer p2 = new Pointer(1, 2);
        Distance dis = new Distance(p1, p2);
        double ac = dis.calDistance();
        double ex = 1;
        assertEquals(ex, ac,0.1);
    }
    @Test
    public void test9() {
        Pointer p1 = new Pointer(1, 3);
        Pointer p2 = new Pointer(1, 2);
        Distance dis = new Distance(p1, p2);
        double ac = dis.calDistance();
        double ex = 2;
        assertEquals(ex, ac,0.1);
    }
    @Test
    public void test10() {
        Pointer p1 = new Pointer(1, 4);
        Pointer p2 = new Pointer(1, 2);
        Distance dis = new Distance(p1, p2);
        double ac = dis.calDistance();
        double ex = 1;
        assertEquals(ex, ac,0.1);
    }
}
