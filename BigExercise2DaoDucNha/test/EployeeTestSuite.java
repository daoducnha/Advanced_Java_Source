/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Dao Duc Nha
 * @version 1.0
 * @since 20/9/2016
 * TestSuite for manage JUnit Test Employee
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({EmployeeAVGAgeTest.class, EmployeeLowestSalaryTest.class, NumberEmployeeSalaryTest.class, EmployeeHighestSalaryTest.class, CalAverageSalaryTest.class})
public class EployeeTestSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
    
}
