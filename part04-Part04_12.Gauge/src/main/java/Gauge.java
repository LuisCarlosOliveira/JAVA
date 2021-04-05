/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luís Oliveira <github.com/LuisCarlosOliveira>
 */
public class Gauge {
    //instance variables
    private int value;
    //constructor
    public Gauge(){
        this.value = 0;
    }
    //method 
    public void increase(){
        if(this.value <5){
            this.value++;
        }
    }
    //method
    public void decrease(){
        if(this.value > 0){
            this.value--;
        }
    }
    //method
    public int value(){
        return this.value;
    }
    //method
    public boolean full(){
        if( this.value == 5 ){
            return true;
        }
        return false;
    }
}
