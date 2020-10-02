package Unit19;
public class PiggyBank
{
    private int quarters;
    private int dimes;
    private int nickels; 
    private int pennies;

    public void insertQuarter()
    {
        quarters++;
    }

    public void insertDime()
    {
        dimes++;
    }

    public void insertNickel()
    {
        nickels++;
    }

    public void insertPenny()
    {
        pennies++;
    }
    
    public int smashBank()
    {
        int totalCents = quarters * 25 + dimes * 10 + nickels * 5 + pennies;
        return totalCents;
    }
} 