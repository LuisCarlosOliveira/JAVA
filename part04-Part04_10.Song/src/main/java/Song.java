/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luís Oliveira <github.com/LuisCarlosOliveira>
 */
public class Song {
    //instance variables
    private String name;
    private int lenght; //seconds
    //constructor
    public Song(String name, int length){
        this.lenght = length;
        this.name = name;
    }
    //method returns song name
    public String name(){
        return this.name;
    }
    //method returns song length
    public int length(){
        return this.lenght;
    }
}