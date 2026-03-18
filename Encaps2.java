package encap2;

/**
 *
 * @author abari
 */
public class Encaps2 {
     double balance;
    
    public void setDeposit(double d) {
        balance=d;
        if(d<0) {
            System.out.println("Invalid Deposit");
        }
    }
   
    public void setWithdraw(double w) {
        if(balance>=w) {
        balance=balance-w;
        if(w>balance) {
            System.out.println("Insufficient balance");
        }
        }
        else {
            System.out.println("No Balance");
        }
    }
    
    public double getBalance() {
        return balance;
    }
    }
