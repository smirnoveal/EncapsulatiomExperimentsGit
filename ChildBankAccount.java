public class ChildBankAccount {
    private double balance;
    private double maxBalance;

    public ChildBankAccount (){
        balance=0.0;
    }
    public ChildBankAccount (double maxBalance){
        this.maxBalance=maxBalance;
    }

    public boolean depositMoney(double value){
        if (value>0 && balance+value<=maxBalance){
            balance+=value;
            return true;
        }
        return false;
    }

    public boolean debitMoney(double value) {
        if (balance>value && value>0){
            balance-=value;
            return true;
        }
        return false;
    }

    public double getBalance (){
        return balance;
    }
}
