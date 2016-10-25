package java.pkg1;

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
    
    
    public Account(){
        accNum = ' ';
        accName = " ";
        accType = 0;
        minBal = 0;
        accFees = 0;
        feeFreq = ' ';
        intRate = 0;
        intFreq = ' ';
        accBal = 0;
    }
    //----------------------------------------------------------
    //2. setter methods
    public void setAccNum(long num){
        
    }
    public void setAccName(String accName) {
        this.accName = accName;
    }

    public void setAccType(char accType) {
        this.accType = accType;
    }

    public void setMinBal(double minBal) {
        this.minBal = minBal;
    }

    public void setAccFees(float accFees) {
        this.accFees = accFees;
    }

    public void setFeeFreq(char feeFreq) {
        this.feeFreq = feeFreq;
    }

    public void setIntrate(float intrate) {
        this.intRate = intrate;
    }

    public void setIntfreq(char intfreq) {
        this.intFreq = intfreq;
    }

    public void setAccBal(double accBal) {
        this.accBal = accBal;
    }
    //-------------------------------------------------------
    //3. getter methods

    public long getAccNum() {
        return accNum;
    }

    public String getAccName() {
        return accName;
    }

    public char getAccType() {
        return accType;
    }

    public double getMinBal() {
        return minBal;
    }

    public float getAccFees() {
        return accFees;
    }

    public char getFeeFreq() {
        return feeFreq;
    }

    public float getIntRate() {
        return intRate;
    }

    public char getIntFreq() {
        return intFreq;
    }

    public double getAccBal() {
        return accBal;
    }
    
}
