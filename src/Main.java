//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Product p1 = new Product(1, "Mouse", 1000, "Tech");
        Product p2 = new Product(1, "Keyboard", 3000, "Tech");

        System.out.println(p1);
        System.out.println(p2);

        System.out.println(p1.equals(p2));

        Product[] products = {p1, p2};
        Order order1 = new Order("Ivan", products);
        System.out.println(order1);

        Order order2 = new Order("Ivan", products);
        System.out.println(order1.equals(order2));

    }
}