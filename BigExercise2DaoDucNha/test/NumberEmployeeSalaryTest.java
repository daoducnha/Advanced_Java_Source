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
 * UnitTest for count Number Employee have Salary > 3000000
 */
public class NumberEmployeeSalaryTest {

    public NumberEmployeeSalaryTest() {
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
        Employee e1 = new Employee("abc", 20, 1000000);
        Employee e2 = new Employee("abc", 22, 2000000);
        Employee e3 = new Employee("abc", 24, 3000000);
        Employee e4 = new Employee("abc", 26, 0000000);
        List<Employee> lst = new ArrayList<>();
        lst.add(e4);
        lst.add(e3);
        lst.add(e2);
        lst.add(e1);
        
        int ac = MainManagerEmployee.numberEmployeeSalary(lst);
        int ex = 0;
        assertEquals(ex, ac);
    }
    
    @Test
    public void test2() {
        Employee e1 = new Employee("abc", 20, 5000000);
        Employee e2 = new Employee("abc", 22, 2000000);
        Employee e3 = new Employee("abc", 24, 2900000);
        Employee e4 = new Employee("abc", 26, 2900000);
        List<Employee> lst = new ArrayList<>();
        lst.add(e4);
        lst.add(e3);
        lst.add(e2);
        lst.add(e1);
        
        int ac = MainManagerEmployee.numberEmployeeSalary(lst);
        int ex = 1;
        assertEquals(ex, ac);
    }
    
    @Test
    public void test3() {
        Employee e1 = new Employee("abc", 20, 5000000);
        Employee e2 = new Employee("abc", 22, 2000000);
        Employee e3 = new Employee("abc", 24, 1900000);
        Employee e4 = new Employee("abc", 26, 2900000);
        List<Employee> lst = new ArrayList<>();
        lst.add(e4);
        lst.add(e3);
        lst.add(e2);
        lst.add(e1);
        
        int ac = MainManagerEmployee.numberEmployeeSalary(lst);
        int ex = 4;
        assertEquals(ex, ac);
    }
    
    @Test
    public void test4() {
        Employee e1 = new Employee("abc", 20, 2000000);
        Employee e2 = new Employee("abc", 22, 2999999);
        Employee e3 = new Employee("abc", 24, 3000000);
        Employee e4 = new Employee("abc", 26, 0);
        List<Employee> lst = new ArrayList<>();
        lst.add(e4);
        lst.add(e3);
        lst.add(e2);
        lst.add(e1);
        
        int ac = MainManagerEmployee.numberEmployeeSalary(lst);
        int ex = 4;
        assertEquals(ex, ac);
    }
    
    @Test
    public void test5() {
        Employee e1 = new Employee("abc", 20, 2000000);
        Employee e2 = new Employee("abc", 22, 2999999);
        Employee e3 = new Employee("abc", 24, 3000000);
        Employee e4 = new Employee("abc", 26, 0);
        List<Employee> lst = new ArrayList<>();
        lst.add(e4);
        lst.add(e3);
        lst.add(e2);
        lst.add(e1);
        
        int ac = MainManagerEmployee.numberEmployeeSalary(lst);
        int ex = 3;
        assertEquals(ex, ac);
    }
    
    @Test
    public void test6() {
        Employee e1 = new Employee("abc", 20, 5000000);
        Employee e2 = new Employee("abc", 22, 2000000);
        Employee e3 = new Employee("abc", 24, 2000000);
        Employee e4 = new Employee("abc", 26, 3000000);
        List<Employee> lst = new ArrayList<>();
        lst.add(e4);
        lst.add(e3);
        lst.add(e2);
        lst.add(e1);
        
        int ac = MainManagerEmployee.numberEmployeeSalary(lst);
        int ex = 2;
        assertEquals(ex, ac);
    }
    
    @Test
    public void test7() {
        Employee e1 = new Employee("abc", 20, 5000000);
        Employee e2 = new Employee("abc", 22, 2000000);
        Employee e3 = new Employee("abc", 24, 5000000);
        Employee e4 = new Employee("abc", 26, 1000000);
        List<Employee> lst = new ArrayList<>();
        lst.add(e4);
        lst.add(e3);
        lst.add(e2);
        lst.add(e1);
        
        int ac = MainManagerEmployee.numberEmployeeSalary(lst);
        int ex = 2;
        assertEquals(ex, ac);
    }
    
    @Test
    public void test8() {
        Employee e1 = new Employee("abc", 20, 5000000);
        Employee e2 = new Employee("abc", 22, 2000000);
        Employee e3 = new Employee("abc", 24, 1900000);
        Employee e4 = new Employee("abc", 26, 2900000);
        List<Employee> lst = new ArrayList<>();
        lst.add(e4);
        lst.add(e3);
        lst.add(e2);
        lst.add(e1);
        
        int ac = MainManagerEmployee.numberEmployeeSalary(lst);
        int ex = 3;
        assertEquals(ex, ac);
    }
    
    @Test
    public void test9() {
        Employee e1 = new Employee("abc", 20, 5000000);
        Employee e2 = new Employee("abc", 22, 2000000);
        Employee e3 = new Employee("abc", 24, 3000000);
        Employee e4 = new Employee("abc", 26, 10000000);
        List<Employee> lst = new ArrayList<>();
        lst.add(e4);
        lst.add(e3);
        lst.add(e2);
        lst.add(e1);
        
        int ac = MainManagerEmployee.numberEmployeeSalary(lst);
        int ex = 2;
        assertEquals(ex, ac);
    }
    
    @Test
    public void test10() {
        Employee e1 = new Employee("abc", 20, 3000000);
        Employee e2 = new Employee("abc", 22, 3000000);
        Employee e3 = new Employee("abc", 24, 3000000);
        Employee e4 = new Employee("abc", 26, 3000000);
        List<Employee> lst = new ArrayList<>();
        lst.add(e4);
        lst.add(e3);
        lst.add(e2);
        lst.add(e1);
        
        int ac = MainManagerEmployee.numberEmployeeSalary(lst);
        int ex = 0;
        assertEquals(ex, ac);
    }
        
}
