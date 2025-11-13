package customException.unchecked;

public class Bank {
    static  void withdraw(double balance,double amount){
       if(amount>balance){
        throw new InsufficientFundsException("Insufficient fund in account ");
       }
    }
}
