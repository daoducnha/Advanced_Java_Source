package TestEmPloyee;

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
import task1_13.Employee;
import task1_13.EmploySale;
import task1_13.EmplyeeProduce;
import task1_13.ManagerEmployee;
/**
 *
 * @author hv
 */
public class TestEmployee {
    
    public TestEmployee() {
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
        EmploySale es = new EmploySale(100000, 2, "abc", 2.5, 2, 200000);
        double ac = es.calRealIncome();
        double ex = 3350000;
        assertEquals(ac, ex, 0.1);
    }
    
    @Test
    public void test2() {
        EmploySale es = new EmploySale(1000000, 20, "abc", 2.5, 2, 200000);
        double ac = es.calRealIncome();
        double ex = 22705000;
        assertEquals(ac, ex, 0.1);
    }
    
     @Test
    public void test3() {
         EmplyeeProduce ep = new EmplyeeProduce(10, 15, 100000, "abc", 2.5, 2, 200000);
        double ac = ep.calRealIncome();
        double ex = 3650000;
        assertEquals(ac, ex, 0.1);
    }
    
     @Test
    public void test4() {
         EmplyeeProduce ep = new EmplyeeProduce(10, 150, 1000000, "abc", 2.5, 2, 200000);
        double ac = ep.calRealIncome();
        double ex = 108567500;
        assertEquals(ac, ex, 0.1);
    }
}
