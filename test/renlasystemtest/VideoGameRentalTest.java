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
public class VideoGameRentalTest {
    
    public VideoGameRentalTest() {
    }
    
    Ps3Game littleBigPlanet;
    Xbox360Game fable2;
    WiiGame superSmashBrosBrawl;

    @Before
    public void setUp() {
        littleBigPlanet = new Ps3Game("Little Big Planet");
        fable2 = new Xbox360Game("Fable 2");
        superSmashBrosBrawl = new WiiGame("Super Smash Bros. Brawl");
    }
    

    /**
     * Test of getDaysRented method, of class VideoGameRental.
     */
    @Test
    public void testGetDaysRented() {
        System.out.println("getDaysRented");
        VideoGameRental instance = new VideoGameRental(littleBigPlanet, 1, true);
        int expResult = 1;
        int result = instance.getDaysRented();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getVideoGame method, of class VideoGameRental.
     */
    @Test
    public void testGetVideoGame() {
        System.out.println("getVideoGame");
        VideoGameRental instance = new VideoGameRental(fable2, 3, true);
        Object expResult = fable2;
        Object result = instance.getVideoGame();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getCharge method, of class VideoGameRental.
     */
    @Test
    public void testGetCharge() {
        System.out.println("getCharge");
        VideoGameRental instance = new VideoGameRental(superSmashBrosBrawl, 5, true);
        double expResult = superSmashBrosBrawl.getCharge(5, true);
        double result = instance.getCharge();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getFrequentRenterPoints method, of class VideoGameRental.
     */
    @Test
    public void testGetFrequentRenterPoints() {
        System.out.println("getFrequentRenterPoints");
        VideoGameRental instance = new VideoGameRental(fable2, 1, true);
        int expResult = fable2.getFrequentRenterPoints(1, true);
        int result = instance.getFrequentRenterPoints();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
    
}
