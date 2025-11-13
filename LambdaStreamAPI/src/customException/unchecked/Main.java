package customException.unchecked;

import static customException.unchecked.Bank.withdraw;

public class Main {
    public static void main(String[] args) {


        //Unchecked Custom Exception (Extends RuntimeException)
        // For programming logic errors (e.g., division by zero, null reference).
        //No need to declare with throws.
        Bank bank = new Bank();
//        Bank.withdraw(200.0,500.00);
        withdraw(500.0,600.0);
    }
}
