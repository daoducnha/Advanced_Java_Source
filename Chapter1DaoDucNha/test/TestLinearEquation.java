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
import chapter1daoducnha.LinearEquation;

/**
 *
 * @author hv
 */
public class TestLinearEquation {
    LinearEquation le = new LinearEquation();
    
    public TestLinearEquation() {
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
        le.setA(10);
        le.setB(10);
        double ac = le.findRoot();
        double ex = -1;
        assertEquals(ex, ac,0.1);                
    }
    
    @Test
    public void test2() {
        le.setA(10);
        le.setB(0);
        double ac = le.findRoot();
        double ex = 0;
        assertEquals(ex, ac,0.1);                
    }
    
    @Test
    public void test3() {
        le.setA(0);
        le.setB(0);
        double ac = le.findRoot();
        double ex = Double.MAX_VALUE;
        assertEquals(ex, ac,0.1);                
    }
    
    @Test
    public void test4() {
        le.setA(0);
        le.setB(10);
        double ac = le.findRoot();
        double ex = Double.MIN_VALUE;
        assertEquals(ex, ac,0.1);                
    }
    
    @Test
    public void test5() {
        le.setA(-5);
        le.setB(10);
        double ac = le.findRoot();
        double ex = 2;
        assertEquals(ex, ac,0.1);                
    }
    
    @Test
    public void test6() {
        le.setA(10);
        le.setB(10);
        double ac = le.findRoot();
        double ex = 1;
        assertEquals(ex, ac,0.1);                
    }
    
    @Test
    public void test7() {
        le.setA(10);
        le.setB(0);
        double ac = le.findRoot();
        double ex = 10;
        assertEquals(ex, ac,0.1);                
    }
    
    @Test
    public void test8() {
        le.setA(0);
        le.setB(0);
        double ac = le.findRoot();
        double ex = 0;
        assertEquals(ex, ac,0.1);                
    }
    
    @Test
    public void test9() {
        le.setA(2);
        le.setB(1);
        double ac = le.findRoot();
        double ex = 2;
        assertEquals(ex, ac,0.1);                
    }
    @Test
    public void test10() {
        le.setA(0);
        le.setB(0);
        double ac = le.findRoot();
        double ex = Double.MIN_VALUE;
        assertEquals(ex, ac,0.1);                
    }
}
