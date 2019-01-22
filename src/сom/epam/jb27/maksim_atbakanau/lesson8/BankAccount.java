package сom.epam.jb27.maksim_atbakanau.lesson8;

public class BankAccount {
    private String owner;
    private long sum;

    public BankAccount(String owner) {
        this.owner = owner;
        this.sum = 0;
    }

    public BankAccount(String owner, long sum) {
        this.owner = owner;
        this.sum = sum;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        BankAccount other = (BankAccount) obj;
        if (!owner.equals(other.owner)) {
            return false;
        } else if (!(sum == other.sum))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((owner == null) ? 0 : owner.hashCode());
        result = prime * result + Long.hashCode(sum);
        return result;
    }

    @Override
    public String toString() {
        return "Account of " + owner + " has " + sum + "$";
    }

    public void pay(Payment payment) {
        if (!payment.isPayed()) {
            if (!(sum < payment.getCost())) {
                sum = sum - payment.getCost();
                payment.setPayed(true);
            } else {
                System.out.println("Not enough money!");
            }
        } else {
            System.out.println("Already payed");
        }
    }

    public void replenishAccount(long number) {
        sum = sum + number;
    }
}
