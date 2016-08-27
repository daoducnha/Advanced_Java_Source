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
import task1_9.Destop;
import task1_9.Laptop;
import task1_9.ManageComputer;

/**
 *
 * @author Dao Duc Nha
 * Date 27/08/2016
 * @version  1.0
 * Test for calculate all price of array Laptop and Destop
 */
public class testCalAllPriceLaptopandDestop {

    public testCalAllPriceLaptopandDestop() {
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
        Laptop[] arrLap = {new Laptop(2, 100, 15, "01", 10000000, "Asus", 10),
            new Laptop(2, 100, 15, "01", 9000000, "Asus", 10),
            new Laptop(2, 100, 15, "01", 8000000, "Asus", 10)
        };
        Destop[] arrDes = {new Destop("core i5", "8 Gb", "01", 10000000, "Asus", 10),
            new Destop("core i5", "8 Gb", "01", 9000000, "Asus", 10),
            new Destop("core i5", "8 Gb", "01", 8000000, "Asus", 10)
        };
        ManageComputer mng = new ManageComputer(arrDes, arrLap);
        
        double ac = mng.calMoneyOfDestop() ;
        double ex = 270000000;
        assertEquals(ex, ac,0.1);
    }
    
    @Test
    public void test2() {
        Laptop[] arrLap = {new Laptop(2, 100, 15, "01", 10000000, "Asus", 10),
            new Laptop(2, 100, 15, "01", 9000000, "Asus", 10),
            new Laptop(2, 100, 15, "01", 8000000, "Asus", 10)
        };
        Destop[] arrDes = {new Destop("core i5", "8 Gb", "01", 10000000, "Asus", 10),
            new Destop("core i5", "8 Gb", "01", 9000000, "Asus", 10),
            new Destop("core i5", "8 Gb", "01", 8000000, "Asus", 10)
        };
        ManageComputer mng = new ManageComputer(arrDes, arrLap);
        
        double ac = mng.calMoneyOfLaptop();
        double ex = 270000000;
        assertEquals(ex, ac,0.1);
    }
    
    @Test
    public void test3() {
        Laptop[] arrLap = {new Laptop(2, 100, 15, "01", 0, "Asus", 10),
            new Laptop(2, 100, 15, "01", 9000000, "Asus", 10),
            new Laptop(2, 100, 15, "01", 8000000, "Asus", 10)
        };
        Destop[] arrDes = {new Destop("core i5", "8 Gb", "01", 0, "Asus", 10),
            new Destop("core i5", "8 Gb", "01", 9000000, "Asus", 10),
            new Destop("core i5", "8 Gb", "01", 8000000, "Asus", 10)
        };
        ManageComputer mng = new ManageComputer(arrDes, arrLap);
        
        double ac = mng.calMoneyOfDestop() ;
        double ex = 170000000;
        assertEquals(ex, ac,0.1);
    }
    
    @Test
    public void test4() {
        Laptop[] arrLap = {new Laptop(2, 100, 15, "01", 0, "Asus", 10),
            new Laptop(2, 100, 15, "01", 9000000, "Asus", 10),
            new Laptop(2, 100, 15, "01", 8000000, "Asus", 10)
        };
        Destop[] arrDes = {new Destop("core i5", "8 Gb", "01", 10000000, "Asus", 10),
            new Destop("core i5", "8 Gb", "01", 9000000, "Asus", 10),
            new Destop("core i5", "8 Gb", "01", 8000000, "Asus", 10)
        };
        ManageComputer mng = new ManageComputer(arrDes, arrLap);
        
        double ac = mng.calMoneyOfLaptop();
        double ex = 170000000;
        assertEquals(ex, ac,0.1);
    }
    
    @Test
    public void test5() {
        Laptop[] arrLap = {new Laptop(2, 100, 15, "01", 10000000, "Asus", 10),
            new Laptop(2, 100, 15, "01", 9000000, "Asus", 0),
            new Laptop(2, 100, 15, "01", 0, "Asus", 10)
        };
        Destop[] arrDes = {new Destop("core i5", "8 Gb", "01", 10000000, "Asus", 10),
            new Destop("core i5", "8 Gb", "01", 9000000, "Asus", 10),
            new Destop("core i5", "8 Gb", "01", 8000000, "Asus", 10)
        };
        ManageComputer mng = new ManageComputer(arrDes, arrLap);
        
        double ac = mng.calMoneyOfLaptop();
        double ex = 100000000;
        assertEquals(ex, ac,0.1);
    }
    
    @Test
    public void test6() {
        Laptop[] arrLap = {new Laptop(2, 100, 15, "01", 0, "Asus", 10),
            new Laptop(2, 100, 15, "01", 9000000, "Asus", 0),
            new Laptop(2, 100, 15, "01", 8000000, "Asus", 10)
        };
        Destop[] arrDes = {new Destop("core i5", "8 Gb", "01", 10000000, "Asus", 10),
            new Destop("core i5", "8 Gb", "01", 9000000, "Asus", 10),
            new Destop("core i5", "8 Gb", "01", 8000000, "Asus", 10)
        };
        ManageComputer mng = new ManageComputer(arrDes, arrLap);
        
        double ac = mng.calMoneyOfLaptop();
        double ex = 270000000;
        assertEquals(ex, ac,0.1);
    }
    
    @Test
    public void test7() {
        Laptop[] arrLap = {new Laptop(2, 100, 15, "01", 10000000, "Asus", 10),
            new Laptop(2, 100, 15, "01", 9000000, "Asus", 10),
            new Laptop(2, 100, 15, "01", 8000000, "Asus", 10)
        };
        Destop[] arrDes = {new Destop("core i5", "8 Gb", "01", 10000000, "Asus", 10),
            new Destop("core i5", "8 Gb", "01", 0, "Asus", 10),
            new Destop("core i5", "8 Gb", "01", 0, "Asus", 10)
        };
        ManageComputer mng = new ManageComputer(arrDes, arrLap);
        
        double ac = mng.calMoneyOfDestop() ;
        double ex = 100000020;
        assertEquals(ex, ac,0.1);
    }
    
    @Test
    public void test8() {
        Laptop[] arrLap = {new Laptop(2, 100, 15, "01", 0, "Asus", 0),
            new Laptop(2, 100, 15, "01", 0, "Asus", 0),
            new Laptop(2, 100, 15, "01", 0, "Asus", 0)
        };
        Destop[] arrDes = {new Destop("core i5", "8 Gb", "01", 10000000, "Asus", 10),
            new Destop("core i5", "8 Gb", "01", 9000000, "Asus", 10),
            new Destop("core i5", "8 Gb", "01", 8000000, "Asus", 10)
        };
        ManageComputer mng = new ManageComputer(arrDes, arrLap);
        
        double ac = mng.calMoneyOfLaptop();
        double ex = 1;
        assertEquals(ex, ac,0.1);
    }
    
    @Test
    public void test9() {
        Laptop[] arrLap = {new Laptop(2, 100, 15, "01", 10000000, "Asus", 10),
            new Laptop(2, 100, 15, "01", 9000000, "Asus", 10),
            new Laptop(2, 100, 15, "01", 8000000, "Asus", 10)
        };
        Destop[] arrDes = {new Destop("core i5", "8 Gb", "01", 0, "Asus", 10),
            new Destop("core i5", "8 Gb", "01", 9000000, "Asus", 0),
            new Destop("core i5", "8 Gb", "01", 8000000, "Asus", 0)
        };
        ManageComputer mng = new ManageComputer(arrDes, arrLap);
        
        double ac = mng.calMoneyOfDestop() ;
        double ex = 10;
        assertEquals(ex, ac,0.1);
    }
    
    @Test
    public void test10() {
        Laptop[] arrLap = {new Laptop(2, 100, 15, "01", 10000000, "Asus", 10),
            new Laptop(2, 100, 15, "01", 9000000, "Asus", 0),
            new Laptop(2, 100, 15, "01", 8000000, "Asus", 0)
        };
        Destop[] arrDes = {new Destop("core i5", "8 Gb", "01", 10000000, "Asus", 10),
            new Destop("core i5", "8 Gb", "01", 9000000, "Asus", 10),
            new Destop("core i5", "8 Gb", "01", 8000000, "Asus", 10)
        };
        ManageComputer mng = new ManageComputer(arrDes, arrLap);
        
        double ac = mng.calMoneyOfLaptop();
        double ex = 117000000;
        assertEquals(ex, ac,0.1);
    }
}
