import java.util.LinkedList;
import java.util.List;

public class Order {

    private List<Product> orderList = new LinkedList<>();

    public void addProduct(Product product) {
        orderList.add(product);
        System.out.println("You have added a product to the order.");
    }

    public double getTotalPrice() {
        double totalPrice = 0.0;

        for (Product product : orderList) {
            totalPrice += product.getPrice();
        }
        
        return totalPrice;
    }
}
