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
 * @author dao duc nha
 * @date 19/8/2016
 * @version 1.0
 * unitest for TestSub, TestDiv, TestAdd, TestMul
 * input num1 num2
 * output num1-num2, num1/num2, num1-num2, num1*num2
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({TestSub.class, TestDiv.class, TestAdd.class, TestMul.class})
public class TestSuiltCalcuater {

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
