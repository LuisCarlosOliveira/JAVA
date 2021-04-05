/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luís Oliveira <github.com/LuisCarlosOliveira>
 */
public class Film {
    //instance variables
    private String name;
    private int ageRating;
    //constructor
    public Film(String filmName, int filmAgeRating){
        this.ageRating = filmAgeRating;
        this.name = filmName;
    }
    //method
    public String name(){
        return this.name;
    }
    //method
    public int ageRating(){
        return this.ageRating;
    }
}
