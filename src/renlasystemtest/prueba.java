/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package renlasystemtest;

/**
 *
 * @author User
 */
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Customer cus = new Customer("David");
        cus.addMovieRental(new MovieRental(new Movie("pirta", Movie.REGULAR), 3));
        cus.addMovieRental(new MovieRental(new Movie("pirta", Movie.CHILDRENS), 3));
        cus.addMovieRental(new MovieRental(new Movie("pirta", Movie.NEW_RELEASE), 3));
        cus.addMovieRental(new MovieRental(new Movie("pirta", Movie.REGULAR), 3));
        cus.addVideoGameRental(new VideoGameRental(new Ps3Game("FiFA"), 4, true));
        cus.addVideoGameRental(new VideoGameRental(new Ps3Game("FiFA"), 1, true));
        cus.addVideoGameRental(new VideoGameRental(new Ps3Game("FiFA"), 2, true));
        cus.addVideoGameRental(new VideoGameRental(new Ps3Game("FiFA"), 6, true));
        System.out.println(cus.statement());
    }
    
}
