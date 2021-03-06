/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package renlasystemtest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class CustomerTest {
    
    public CustomerTest() {
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

    /**
     * Test of addMovieRental method, of class Customer.
     */
    @Test
    public void testAddMovieRental() {
        System.out.println("addMovieRental");
        MovieRental arg = new MovieRental(new Movie("los piratas", Movie.CHILDRENS),5);
        Customer instance = new Customer("pepe");
        instance.addMovieRental(arg);
        assertEquals(arg,instance.getMovieRentals().get(0));
    }

    /**
     * Test of addVideoGameRental method, of class Customer.
     */
    @Test
    public void testAddVideoGameRental() {
        System.out.println("addVideoGameRental");
        VideoGameRental arg = new VideoGameRental(new Ps3Game("FiFA"), 10, true);
        Customer instance =  new Customer("pepe");
        instance.addVideoGameRental(arg);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(arg,instance.getVideoGameRental().get(0));
    }

    /**
     * Test of statement method, of class Customer.
     */
    @Test
    public void testStatement() {
        System.out.println("statement");
        Customer instance = new Customer("David");
        instance.addMovieRental(new MovieRental(new Movie("pirta", Movie.REGULAR), 3));
        instance.addVideoGameRental(new VideoGameRental(new Ps3Game("FiFA"), 4, true));
        String expResult ="Rental Record for David\n" +"\tpirta	3.5\n" +"\tFiFA	37.989999999999995\n" +"Amount owed is 41.489999999999995\n" +
"You earned 3 frequent renter points";
        String result = instance.statement();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
    
}
