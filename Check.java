
/**
 * The Check class is a basic class that will bring in variables and print out a check
 *
 * @author Jesse Nickerson
 * @version 20170613
 */
public class Check
{
    private String permanentName = "Jesse Nickerson";
    private int checkNumber = 0;
    private String payee = "Error";
    private String reason = "Error";
    private float dollarAmount = 0;

    /**
     * Constructor for objects of class Check
     * Brings 4 variables to initiate the check
     * An Integer cN, for Check Number
     * A String pay, for payee
     * A String rsn, for reason
     * A float dA, for Dollar Amount
     */
    public Check(int cN, String pay, String rsn, float dA)
    {
        checkNumber = cN;
        payee = pay;
        reason = rsn;
        dollarAmount = dA;
    }
    
    /**
     * Prints out the check on the command lin
     */
    public void printCheck()
    {
        System.out.println("*******************************************************************");
        System.out.println(permanentName + "                        Check # " + checkNumber);
        System.out.println("Pay to the order of " + payee + "         $" + dollarAmount);
        System.out.println("Reason: " + reason);
        System.out.println("*******************************************************************");
    }
    
    public String getMyName()
    {
        return permanentName;
    }
    
    public int getCheckNumber()
    {
        return checkNumber;
    } 
    
    public String getPayee()
    {
        return payee;
    }
    
    public String getReason()
    {
        return reason;
    }
    
    public float getDollarAmount()
    {
        return dollarAmount;
    }
    
    public void setMyName(String name)
    {
        permanentName = name;
    }
    
    public void setCheckNumber(int checkNum)
    {
        checkNumber = checkNum;
    }
    
    public void setPayee(String pay)
    {
        payee = pay;
    }
    
    public void setReason(String reas)
    {
        reason = reas;
    }
    
    public void setDollarAmount(float dA)
    {
        dollarAmount = dA;
    }
}
