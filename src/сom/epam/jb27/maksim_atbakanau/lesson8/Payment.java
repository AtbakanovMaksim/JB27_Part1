package сom.epam.jb27.maksim_atbakanau.lesson8;

import java.util.ArrayList;
import java.util.List;

public class Payment {
    private boolean isPayed;
    private int cost;
    private List<Product> productsList = new ArrayList<Product>();

    public Payment() {
        isPayed = false;
        cost = 0;
    }

    public boolean isPayed() {
        return isPayed;
    }

    public void setPayed(boolean payed) {
        isPayed = payed;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public List<Product> getProductsList() {
        return productsList;
    }

    public void setProductsList(List<Product> productsList) {
        this.productsList = productsList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Payment payment = (Payment) o;

        if (isPayed != payment.isPayed) return false;
        if (cost != payment.cost) return false;
        return productsList != null ? productsList.equals(payment.productsList) : payment.productsList == null;
    }

    @Override
    public int hashCode() {
        int result = (isPayed ? 1 : 0);
        result = 31 * result + cost;
        result = 31 * result + (productsList != null ? productsList.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "isPayed=" + isPayed +
                ", cost=" + cost +
                ", productsList=" + productsList +
                '}';
    }

    public void addToPayment(Product product) {
        productsList.add(product);
        cost = cost + product.getPrice();
    }

}
