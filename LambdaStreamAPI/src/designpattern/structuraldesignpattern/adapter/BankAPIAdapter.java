package designpattern.structuraldesignpattern.adapter;

public interface BankAPIAdapter {

    double checkBalance(User user);

    int doTransaction(User userFrom, User toUser, double amount);

    boolean changePin(User user,int currentPin, int newPin);

}
