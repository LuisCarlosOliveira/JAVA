/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luís Oliveira <github.com/LuisCarlosOliveira>
 */
public class Debt {
    //instance variables
    private double balance, interestRate;
    //method
    public Debt(double initialBalance, double initialInterestRate){
        this.balance = initialBalance;
        this.interestRate = initialInterestRate;
    }
    //method prints current balance
    public void printBalance(){
        System.out.println(this.balance);
    }
    //method growns debt amount
    public void waitOneYear(){
        this.balance = this.balance * this.interestRate;
    }
}
