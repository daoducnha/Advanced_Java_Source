/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import streamEmployee.Employee;
import streamEmployee.MainManagerEmployee;


/**
 *
 * @author Dao Duc Nha
 * @version 1.0
 * @since 20/9/2016
 * UnitTest for Calculate Average Salary of list employee
 */
public class CalAverageSalaryTest {
    
    public CalAverageSalaryTest() {
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
        Employee e3 = new Employee("abc", 29, 5000000);
        Employee e4 = new Employee("abc", 30, 5000000);
        List<Employee> lst = new ArrayList<>();
        lst.add(e4);
        lst.add(e3);
        lst.add(e2);
        lst.add(e1);

        double ac = MainManagerEmployee.calAverageSalary(lst);
        double ex = 5000000;
        assertEquals(ex, ac, 0.1);
    }
    
     @Test
    public void test2() {
        Employee e1 = new Employee("abc", 20, 5000000);
        Employee e2 = new Employee("abc", 22, 4000000);
        Employee e3 = new Employee("abc", 29, 4000000);
        Employee e4 = new Employee("abc", 30, 5000000);
        List<Employee> lst = new ArrayList<>();
        lst.add(e4);
        lst.add(e3);
        lst.add(e2);
        lst.add(e1);

        double ac = MainManagerEmployee.calAverageSalary(lst);
        double ex = 4500000;
        assertEquals(ex, ac, 0.1);
    }
    
     @Test
    public void test3() {
        Employee e1 = new Employee("abc", 20, 5000000);
        Employee e2 = new Employee("abc", 22, 5000000);
        Employee e3 = new Employee("abc", 29, 1000000);
        Employee e4 = new Employee("abc", 30, 5000000);
        List<Employee> lst = new ArrayList<>();
        lst.add(e4);
        lst.add(e3);
        lst.add(e2);
        lst.add(e1);

        double ac = MainManagerEmployee.calAverageSalary(lst);
        double ex = 4000000;
        assertEquals(ex, ac, 0.1);
    }
    
     @Test
    public void test4() {
        Employee e1 = new Employee("abc", 20, 5000000);
        Employee e2 = new Employee("abc", 22, 2000000);
        Employee e3 = new Employee("abc", 29, 2000000);
        Employee e4 = new Employee("abc", 30, 5000000);
        List<Employee> lst = new ArrayList<>();
        lst.add(e4);
        lst.add(e3);
        lst.add(e2);
        lst.add(e1);

        double ac = MainManagerEmployee.calAverageSalary(lst);
        double ex = 3500000;
        assertEquals(ex, ac, 0.1);
    }
    
     @Test
    public void test5() {
        Employee e1 = new Employee("abc", 20, 5000000);
        Employee e2 = new Employee("abc", 22, 5000000);
        Employee e3 = new Employee("abc", 29, 3000000);
        Employee e4 = new Employee("abc", 30, 0000000);
        List<Employee> lst = new ArrayList<>();
        lst.add(e4);
        lst.add(e3);
        lst.add(e2);
        lst.add(e1);

        double ac = MainManagerEmployee.calAverageSalary(lst);
        double ex = 3250000;
        assertEquals(ex, ac, 0.1);
    }
    
     @Test
    public void test6() {
        Employee e1 = new Employee("abc", 20, 5000000);
        Employee e2 = new Employee("abc", 22, 2000000);
        Employee e3 = new Employee("abc", 29, 1000000);
        Employee e4 = new Employee("abc", 30, 0000000);
        List<Employee> lst = new ArrayList<>();
        lst.add(e4);
        lst.add(e3);
        lst.add(e2);
        lst.add(e1);

        double ac = MainManagerEmployee.calAverageSalary(lst);
        double ex = 2500000;
        assertEquals(ex, ac, 0.1);
    }
    
     @Test
    public void test7() {
        Employee e1 = new Employee("abc", 20, 1000000);
        Employee e2 = new Employee("abc", 22, 0000000);
        Employee e3 = new Employee("abc", 29, 2000000);
        Employee e4 = new Employee("abc", 30, 3000000);
        List<Employee> lst = new ArrayList<>();
        lst.add(e4);
        lst.add(e3);
        lst.add(e2);
        lst.add(e1);

        double ac = MainManagerEmployee.calAverageSalary(lst);
        double ex = 2000000;
        assertEquals(ex, ac, 0.1);
    }
    
     @Test
    public void test8() {
        Employee e1 = new Employee("abc", 20, 0000000);
        Employee e2 = new Employee("abc", 22, 0000000);
        Employee e3 = new Employee("abc", 29, 0000000);
        Employee e4 = new Employee("abc", 30, 5000000);
        List<Employee> lst = new ArrayList<>();
        lst.add(e4);
        lst.add(e3);
        lst.add(e2);
        lst.add(e1);

        double ac = MainManagerEmployee.calAverageSalary(lst);
        double ex = 1500000;
        assertEquals(ex, ac, 0.1);
    }
    
     @Test
    public void test9() {
        Employee e1 = new Employee("abc", 20, 7000000);
        Employee e2 = new Employee("abc", 22, 1000000);
        Employee e3 = new Employee("abc", 29, 3000000);
        Employee e4 = new Employee("abc", 30, 5000000);
        List<Employee> lst = new ArrayList<>();
        lst.add(e4);
        lst.add(e3);
        lst.add(e2);
        lst.add(e1);

        double ac = MainManagerEmployee.calAverageSalary(lst);
        double ex = 5000000;
        assertEquals(ex, ac, 0.1);
    }
    
     @Test
    public void test10() {
        Employee e1 = new Employee("abc", 20, 2000000);
        Employee e2 = new Employee("abc", 22, 4000000);
        Employee e3 = new Employee("abc", 29, 6000000);
        Employee e4 = new Employee("abc", 30, 8000000);
        List<Employee> lst = new ArrayList<>();
        lst.add(e4);
        lst.add(e3);
        lst.add(e2);
        lst.add(e1);

        double ac = MainManagerEmployee.calAverageSalary(lst);
        double ex = 4000000;
        assertEquals(ex, ac, 0.1);
    }
}
