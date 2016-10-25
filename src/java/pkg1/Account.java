package java.pkg1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Account Object 
 * @author Evan Sherbet 
 */
public class Account {
    //private attributes
    private long accNum; //account#
    private String accName; //account holder
    private char accType; // c:hecking or s:aving
    private double minBal;
    private float accFees;
    private char feeFreq; //M:onthly, Q:uarterly, etc
    private float intRate;
    private char intFreq; //M:onthly, Q:uarterly, etc
    private double accBal;
    
    //public methods
    // 1. constructors
    public Account(){
        accNum = 0 ;
        accName = "";
        accType = ' ';
        minBal = 0;
        accFees = 0;
        feeFreq= ' ';
        intRate = 0;
        intFreq = ' ';
        accBal = 0;
    }
    // 2. setter methods
    
    // 3. getter methods
    
    
}
