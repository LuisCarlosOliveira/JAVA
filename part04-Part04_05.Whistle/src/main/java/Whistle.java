/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class Whistle {
    //instance variable
    private String sound ;
    //constructor
    public Whistle(String whistleSound){
        this.sound = whistleSound;
    }
    //method to print sound
    public void sound(){
        System.out.println(this.sound);
    }
    
    
}
