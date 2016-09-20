/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import stream.Employee;
import stream.MainManagerEmployee;

/**
 *
 * @author Dao Duc Nha
 * @version 1.0
 * @since 20/9/2016
 * UnitTest for Calculate Average Age of list employee
 */
public class EmployeeAVGAgeTest {
    
    public EmployeeAVGAgeTest() {
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

    
    @Test
    public void test1() {
        Employee e1 = new Employee("abc", 20, 5000000);
        Employee e2 = new Employee("abc", 22, 5000000);
        Employee e3 = new Employee("abc", 24, 5000000);
        Employee e4 = new Employee("abc", 26, 5000000);
        List<Employee> lst = new ArrayList<>();
        lst.add(e4);
        lst.add(e3);
        lst.add(e2);
        lst.add(e1);
        
        double ac = MainManagerEmployee.calAverageAgge(lst);
        double ex = 23;
         assertEquals(ex, ac, 0.1);
    }
    
    
    @Test
    public void test2() {
        Employee e1 = new Employee("abc", 20, 5000000);
        Employee e2 = new Employee("abc", 20, 5000000);
        Employee e3 = new Employee("abc", 20, 5000000);
        Employee e4 = new Employee("abc", 20, 5000000);
        List<Employee> lst = new ArrayList<>();
        lst.add(e4);
        lst.add(e3);
        lst.add(e2);
        lst.add(e1);
        
        double ac = MainManagerEmployee.calAverageAgge(lst);
        double ex = 20;
         assertEquals(ex, ac, 0.1);
    }
    
    
    @Test
    public void test3() {
        Employee e1 = new Employee("abc", 0, 5000000);
        Employee e2 = new Employee("abc", 0, 5000000);
        Employee e3 = new Employee("abc", 0, 5000000);
        Employee e4 = new Employee("abc", 0, 5000000);
        List<Employee> lst = new ArrayList<>();
        lst.add(e4);
        lst.add(e3);
        lst.add(e2);
        lst.add(e1);
        
        double ac = MainManagerEmployee.calAverageAgge(lst);
        double ex = 0;
         assertEquals(ex, ac, 0.1);
    }
    
    
    @Test
    public void test4() {
        Employee e1 = new Employee("abc", 21, 5000000);
        Employee e2 = new Employee("abc", 22, 5000000);
        Employee e3 = new Employee("abc", 23, 5000000);
        Employee e4 = new Employee("abc", 24, 5000000);
        List<Employee> lst = new ArrayList<>();
        lst.add(e4);
        lst.add(e3);
        lst.add(e2);
        lst.add(e1);
        
        double ac = MainManagerEmployee.calAverageAgge(lst);
        double ex = 22.5;
         assertEquals(ex, ac, 0.1);
    }
    
    
    @Test
    public void test5() {
        Employee e1 = new Employee("abc", 21, 5000000);
        Employee e2 = new Employee("abc", 23, 5000000);
        Employee e3 = new Employee("abc", 25, 5000000);
        Employee e4 = new Employee("abc", 27, 5000000);
        List<Employee> lst = new ArrayList<>();
        lst.add(e4);
        lst.add(e3);
        lst.add(e2);
        lst.add(e1);
        
        double ac = MainManagerEmployee.calAverageAgge(lst);
        double ex = 24;
         assertEquals(ex, ac, 0.1);
    }
    
    
    @Test
    public void test6() {
        Employee e1 = new Employee("abc", 20, 5000000);
        Employee e2 = new Employee("abc", 21, 5000000);
        Employee e3 = new Employee("abc", 20, 5000000);
        Employee e4 = new Employee("abc", 20, 5000000);
        List<Employee> lst = new ArrayList<>();
        lst.add(e4);
        lst.add(e3);
        lst.add(e2);
        lst.add(e1);
        
        double ac = MainManagerEmployee.calAverageAgge(lst);
        double ex = 20;
         assertEquals(ex, ac, 0.1);
    }
    
    
    @Test
    public void test7() {
        Employee e1 = new Employee("abc", 20, 5000000);
        Employee e2 = new Employee("abc", 21, 5000000);
        Employee e3 = new Employee("abc", 21, 5000000);
        Employee e4 = new Employee("abc", 20, 5000000);
        List<Employee> lst = new ArrayList<>();
        lst.add(e4);
        lst.add(e3);
        lst.add(e2);
        lst.add(e1);
        
        double ac = MainManagerEmployee.calAverageAgge(lst);
        double ex = 21;
         assertEquals(ex, ac, 0.1);
    }
    
    
    @Test
    public void test8() {
        Employee e1 = new Employee("abc", 24, 5000000);
        Employee e2 = new Employee("abc", 22, 5000000);
        Employee e3 = new Employee("abc", 21, 5000000);
        Employee e4 = new Employee("abc", 21, 5000000);
        List<Employee> lst = new ArrayList<>();
        lst.add(e4);
        lst.add(e3);
        lst.add(e2);
        lst.add(e1);
        
        double ac = MainManagerEmployee.calAverageAgge(lst);
        double ex = 23;
         assertEquals(ex, ac, 0.1);
    }
    
    
    @Test
    public void test9() {
        Employee e1 = new Employee("abc", 20, 5000000);
        Employee e2 = new Employee("abc", 22, 5000000);
        Employee e3 = new Employee("abc", 24, 5000000);
        Employee e4 = new Employee("abc", 26, 5000000);
        List<Employee> lst = new ArrayList<>();
        lst.add(e4);
        lst.add(e3);
        lst.add(e2);
        lst.add(e1);
        
        double ac = MainManagerEmployee.calAverageAgge(lst);
        double ex = 22;
         assertEquals(ex, ac, 0.1);
    }
    
    
    @Test
    public void test10() {
        Employee e1 = new Employee("abc", 20, 5000000);
        Employee e2 = new Employee("abc", 22, 5000000);
        Employee e3 = new Employee("abc", 29, 5000000);
        Employee e4 = new Employee("abc", 30, 5000000);
        List<Employee> lst = new ArrayList<>();
        lst.add(e4);
        lst.add(e3);
        lst.add(e2);
        lst.add(e1);
        
        double ac = MainManagerEmployee.calAverageAgge(lst);
        double ex = 27;
        assertEquals(ex, ac, 0.1);
    }
    
}
