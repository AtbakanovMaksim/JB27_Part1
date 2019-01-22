package сom.epam.jb27.maksim_atbakanau.lesson8;

public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("Maksim Atbakanau", 1000000);
        Payment payment = new Payment();
        payment.addToPayment(new Product("Ferrari", 100000));
        payment.addToPayment(new Product("House", 1000000));
        payment.addToPayment(new Product("Candy", 1));

        System.out.println(payment.toString());
        System.out.println(myAccount.toString());

        myAccount.pay(payment);
        myAccount.replenishAccount(1000000);
        myAccount.pay(payment);
        myAccount.pay(payment);
    }
}
