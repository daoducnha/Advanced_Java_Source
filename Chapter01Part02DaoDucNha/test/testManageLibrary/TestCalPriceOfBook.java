/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testManageLibrary;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import task1_12.*;

/**
 *
 * @author Dao Duc Nha Date 27/08/2016
 * @version 1.0 Test for calculate price of Text Book, Referance Book and price Average of array Referance Book
 */
public class TestCalPriceOfBook {

    public TestCalPriceOfBook() {
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
        TextBook[] tb = {new TextBook(1, "1", "abc", "10/10/2010", 50000, 10, "NXB Tre")};
        ReferenceBook[] rb = {new ReferenceBook(10, "1", "abc", "10/10/2010", 50000, 10, "XYZ")};
        ManageBook mng = new ManageBook(tb, rb);

        double ac = mng.calMoneyReferenceBook();
        double ex = 505001;
        assertEquals(ex, ac, 0.1);
    }

    @Test
    public void test2() {
        TextBook[] tb = {new TextBook(2, "1", "abc", "10/10/2010", 50000, 10, "NXB Tre")};
        ReferenceBook[] rb = {new ReferenceBook(10, "1", "abc", "10/10/2010", 50000, 10, "XYZ")};
        ManageBook mng = new ManageBook(tb, rb);

        double ac = mng.CalMoneyTextBook();
        double ex = 250000;
        assertEquals(ex, ac, 0.1);
    }

    @Test
    public void test3() {
        TextBook[] tb = {new TextBook(1, "1", "abc", "10/10/2010", 50000, 10, "NXB Tre")};
        ReferenceBook[] rb = {new ReferenceBook(10, "1", "abc", "10/10/2010", 50000, 10, "XYZ")};
        ManageBook mng = new ManageBook(tb, rb);

        double ac = mng.CalMoneyTextBook();
        double ex = 500000;
        assertEquals(ex, ac, 0.1);
    }

    @Test
    public void test4() {
        TextBook[] tb = {new TextBook(1, "1", "abc", "10/10/2010", 50000, 10, "NXB Tre")};
        ReferenceBook[] rb = {new ReferenceBook(10, "1", "abc", "10/10/2010", 50000, 10, "XYZ"),
            new ReferenceBook(5, "1", "abc", "10/10/2010", 98000, 4, "XYZ"),
            new ReferenceBook(10, "1", "abc", "10/10/2010", 55000, 2, "XYZ")
        };
        ManageBook mng = new ManageBook(tb, rb);

        double ac = mng.calAVGReferenceBook();
        double ex = 67666.67;
        assertEquals(ex, ac, 0.1);
    }

}
