package designpattern.structuraldesignpattern.adapter;

public class YesBankAPIAdapter implements BankAPIAdapter{

    private YesBankAPI yesBankAPI = new YesBankAPI();
    @Override
    public double checkBalance(User user) {
        long balance = yesBankAPI.getBalance(user.getUserName(), user.getPassword());
        return (double) balance;
    }

    @Override
    public int doTransaction(User userFrom, User toUser, double amount) {
        char result = yesBankAPI.doTransaction(userFrom.getUserName(),toUser.getUserName(),userFrom.getPassword(),amount);
        if(result=='y'){
            return 1;
        } else if (result=='n') {
            return 0;
        }else{
            return 2;
        }
    }

    @Override
    public boolean changePin(User user, int currentPin, int newPin) {
        return yesBankAPI.changePin(user.getUserName(), user.getPassword(), currentPin,newPin);

    }
}
