/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luís Oliveira <github.com/LuisCarlosOliveira>
 */
public class PaymentCard {
    //instance variable
    private double balance;
    
//constructor
    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }
    //method
    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }
    
    //method
    public void eatAffordably() {
        if(this.balance >= 2.60){
            this.balance = this.balance - 2.60;
        }
    }
    
    //method
    public void eatHeartily() {
        if(this.balance >= 4.60){    
            this.balance = this.balance - 4.60;
        }
    }
    
    //method
    public void addMoney(double amount) {
        if(amount > 0){
        this.balance = this.balance + amount;
            if(this.balance >= 150 ){
                this.balance = 150;
            }   
        }
    }
}
