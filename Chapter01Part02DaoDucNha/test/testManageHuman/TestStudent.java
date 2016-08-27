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
import task1_10.Student;
/**
 *
 * @author NHA
 */
public class TestStudent {
    
    public TestStudent() {
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
        Student s = new Student("A4", 9, 8, "a", "10/10/1999", "ABC", "09090909");
        double ac = s.calPointAverage();
        double ex = 8.5;
        assertEquals(ex, ac, 0.1);               
    }
    

    @Test
    public void test2() {
        Student s = new Student("A4", 8, 8, "a", "10/10/1999", "ABC", "09090909");
        double ac = s.calPointAverage();
        double ex = 8;
        assertEquals(ex, ac, 0.1);               
    }
    
    @Test
    public void test3() {
        Student s = new Student("A4", 0, 8, "a", "10/10/1999", "ABC", "09090909");
        double ac = s.calPointAverage();
        double ex = 4;
        assertEquals(ex, ac, 0.1);               
    }
    
    @Test
    public void test4() {
        Student s = new Student("A4", 0, 0, "a", "10/10/1999", "ABC", "09090909");
        double ac = s.calPointAverage();
        double ex = 0;
        assertEquals(ex, ac, 0.1);               
    }
    
    @Test
    public void test5() {
        Student s = new Student("A4", 1, 5, "a", "10/10/1999", "ABC", "09090909");
        double ac = s.calPointAverage();
        double ex = 3;
        assertEquals(ex, ac, 0.1);               
    }
    
    @Test
    public void test6() {
        Student s = new Student("A4", 9, 8, "a", "10/10/1999", "ABC", "09090909");
        double ac = s.calPointAverage();
        double ex = 8;
        assertEquals(ex, ac, 0.1);               
    }
    @Test
    public void test7() {
        Student s = new Student("A4", 6, 8, "a", "10/10/1999", "ABC", "09090909");
        double ac = s.calPointAverage();
        double ex = 8;
        assertEquals(ex, ac, 0.1);               
    }
    
    @Test
    public void test8() {
        Student s = new Student("A4", 0, 8, "a", "10/10/1999", "ABC", "09090909");
        double ac = s.calPointAverage();
        double ex = 0;
        assertEquals(ex, ac, 0.1);               
    }
    
    @Test
    public void test9() {
        Student s = new Student("A4", 0, 0, "a", "10/10/1999", "ABC", "09090909");
        double ac = s.calPointAverage();
        double ex = 1;
        assertEquals(ex, ac, 0.1);               
    }
    
    @Test
    public void test10() {
        Student s = new Student("A4", 9, 0, "a", "10/10/1999", "ABC", "09090909");
        double ac = s.calPointAverage();
        double ex = 5;
        assertEquals(ex, ac, 0.1);               
    }
    
}
