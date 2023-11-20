public class Main {
    public static void main(String[] args) {


        //final task 5.9.2.
        Dimensions petrovichCargo = new Dimensions(2, 3, 5);
        LogisticCompany petrovich = new LogisticCompany(petrovichCargo, 5,
                "Москва, Твардовского д. 6 кв. 22", true,
                "А725ЕА750 ",false );
        System.out.println(petrovich);
        Dimensions copyDimensions = petrovichCargo.setHeight(100);
        System.out.println(copyDimensions);






        // Домашние задания из раздела 5
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

        //task 5.4.1

//        Country russia = new Country("Russia");
//        russia.setCapital("Moscow");
//        russia.setAccessSea(true);
//        System.out.println(russia.getCapital() + " " + russia.getCountry()+" " +(russia.isAccessSea()?"имеет выход к морю":"не имеет выхода к морю"));

//task 5.4.2
//        Cat vasyaCat=new Cat("Васька", true,1.5 );
//        System.out.println("Имя кота " + vasyaCat.getName() +" "+ (vasyaCat.isBreed()?"породистый":"дворовый") + " весом " + vasyaCat.getWeight());

    }
}
