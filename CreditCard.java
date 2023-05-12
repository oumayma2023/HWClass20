package HWClass20;

public class CreditCard {



        int balance;
        double interest;
        void calculateInterest() {
            System.out.println(balance*(interest*0.01));
        }
    }

    class Visa extends CreditCard{

    }

    class MasterCard extends CreditCard{
        @Override
        void calculateInterest() {
            System.out.println(balance*(interest*0.01));
        }
    }

