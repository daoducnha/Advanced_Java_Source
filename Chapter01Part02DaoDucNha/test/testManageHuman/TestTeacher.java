/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testManageHuman;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import task1_10.Teacher;
/**
 *
 * @author NHA
 */
public class TestTeacher {
    
    public TestTeacher() {
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
        Teacher t = new Teacher("A4", 2.5, 1000000, "abc", "10/10/1990", "abc", "09090909");
        double ac = t.calSalary();
        double ex = 4150000;
        assertEquals(ex, ac, 0.1);
    }
    
     @Test
    public void test2() {
        Teacher t = new Teacher("A4", 2.5, 100000, "abc", "10/10/1990", "abc", "09090909");
        double ac = t.calSalary();
        double ex = 3250000;
        assertEquals(ex, ac, 0.1);
    }
    
     @Test
    public void test3() {
        Teacher t = new Teacher("A4", 0, 1000000, "abc", "10/10/1990", "abc", "09090909");
        double ac = t.calSalary();
        double ex = 1000000;
        assertEquals(ex, ac, 0.1);
    }
    
     @Test
    public void test4() {
        Teacher t = new Teacher("A4", 2, 1000000, "abc", "10/10/1990", "abc", "09090909");
        double ac = t.calSalary();
        double ex = 3520000;
        assertEquals(ex, ac, 0.1);
    }
    
     @Test
    public void test5() {
        Teacher t = new Teacher("A4", 2.5, 0, "abc", "10/10/1990", "abc", "09090909");
        double ac = t.calSalary();
        double ex = 3150000;
        assertEquals(ex, ac, 0.1);
    }
    
     @Test
    public void test6() {
        Teacher t = new Teacher("A4", 0, 1000000, "abc", "10/10/1990", "abc", "09090909");
        double ac = t.calSalary();
        double ex = 0;
        assertEquals(ex, ac, 0.1);
    }
    
     @Test
    public void test7() {
        Teacher t = new Teacher("A4", 2.5, 1000000, "abc", "10/10/1990", "abc", "09090909");
        double ac = t.calSalary();
        double ex = 4015000;
        assertEquals(ex, ac, 0.1);
    }
    
     @Test
    public void test8() {
        Teacher t = new Teacher("A4", 2.5, 0, "abc", "10/10/1990", "abc", "09090909");
        double ac = t.calSalary();
        double ex = 0;
        assertEquals(ex, ac, 0.1);
    }
     @Test
    public void test9() {
        Teacher t = new Teacher("A4", 0, 1000000, "abc", "10/10/1990", "abc", "09090909");
        double ac = t.calSalary();
        double ex = 2260000;
        assertEquals(ex, ac, 0.1);
    }
     @Test
    public void test10() {
        Teacher t = new Teacher("A4", 0, 0, "abc", "10/10/1990", "abc", "09090909");
        double ac = t.calSalary();
        double ex = 1260000;
        assertEquals(ex, ac, 0.1);
    }
}
