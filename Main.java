public class Main {
    public static void main(String[] args) {

        //task 5.2
//        ChildBankAccount account = new ChildBankAccount(10000);
//        account.depositMoney(1000);
//        account.depositMoney(2000);
//        account.depositMoney(10000);
//        account.depositMoney(-1000);
//        System.out.println("Balance: " + account.getBalance());
//        account.debitMoney(500);
//        account.debitMoney(422.75);
//        account.debitMoney(50000);
//        account.debitMoney(-50);
//        System.out.println("Balance: " + account.getBalance());

        Country russia = new Country("Russia");
        russia.setCapital("Moscow");
        russia.setAccessSea(true);
        System.out.println(russia.getCapital() + " " + russia.getCountry()+" " +(russia.isAccessSea()?"имеет выход к морю":"не имеет выхода к морю"));

        ;


    }
}
