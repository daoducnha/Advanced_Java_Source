/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testComputer;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import task1_9.Computer;
/**
 *
 * @author NHA
 */
public class TestCalPriceComputer {
    
    public TestCalPriceComputer() {
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
        Computer c = new Computer("1", 10000000,"Asus", 10);
        double ac = c.calMoney();
        double ex= 100000000;
        assertEquals(ex, ac, 0.1);
    }
    
    @Test
    public void test2() {
        Computer c = new Computer("1", 0,"Asus", 10);
        double ac = c.calMoney();
        double ex= 0;
        assertEquals(ex, ac, 0.1);
    }
    
    @Test
    public void test3() {
        Computer c = new Computer("1", 10000000,"Asus", 0);
        double ac = c.calMoney();
        double ex= 0;
        assertEquals(ex, ac, 0.1);
    }
    
    @Test
    public void test4() {
        Computer c = new Computer("1", 9000000,"Asus", 9);
        double ac = c.calMoney();
        double ex= 81000000;
        assertEquals(ex, ac, 0.1);
    }
    
    @Test
    public void test5() {
        Computer c = new Computer("1", 1,"Asus", 10);
        double ac = c.calMoney();
        double ex= 10;
        assertEquals(ex, ac, 0.1);
    }
    
    @Test
    public void test6() {
        Computer c = new Computer("1", 10000000,"Asus", 10);
        double ac = c.calMoney();
        double ex= 1000000000;
        assertEquals(ex, ac, 0.1);
    }
    
    @Test
    public void test7() {
        Computer c = new Computer("1", 0,"Asus", 10);
        double ac = c.calMoney();
        double ex= 10;
        assertEquals(ex, ac, 0.1);
    }
    
    @Test
    public void test8() {
        Computer c = new Computer("1", 10000000,"Asus", 0);
        double ac = c.calMoney();
        double ex= 10000000;
        assertEquals(ex, ac, 0.1);
    }
    
    @Test
    public void test9() {
        Computer c = new Computer("1", 10,"Asus", 10);
        double ac = c.calMoney();
        double ex= 1000;
        assertEquals(ex, ac, 0.1);
    }
    
    @Test
    public void test10() {
        Computer c = new Computer("1", 0,"Asus", 0);
        double ac = c.calMoney();
        double ex= 1;
        assertEquals(ex, ac, 0.1);
    }
}
