import java.util.Arrays;
import java.util.Objects;

public class Order {

    String customer;
    Product[] basket;

    @Override
    public String toString() {
        return "Order{" +
                "customer='" + customer + '\'' +
                ", basket=" + Arrays.toString(basket) +
                '}';
    }

    public Order(String customer, Product[] basket) {
        this.customer = customer;
        this.basket = basket;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(customer, order.customer) && Objects.deepEquals(basket, order.basket);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customer, Arrays.hashCode(basket));
    }
}
