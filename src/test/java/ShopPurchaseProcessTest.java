import model.Address;
import model.Client;
import model.Order;
import model.Product;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShopPurchaseProcessTest {
    @Test
    public void addClientsWithAddresses() {

        Address address = new Address("Riga", "Brivibas", 25);

        Client irina = new Client("Irina", "Ivanova");
        irina.setAddress(address);
        irina.setPhone("+371276675");

        Address address1 = new Address("Jelgava", "Nometnu", 221);
        Client olga = new Client("Olga", "Ozolina");
        olga.setAddress(address1);
        olga.setPhone("+3719789878");

        Address address2 = new Address("Ogre", "Rigas", 11);
        Client maksims = new Client("Maksims", "Berzins");
        maksims.setAddress(address2);
        maksims.setPhone("3712444112");

        irina.printClientDetails();
        olga.printClientDetails();
        maksims.printClientDetails();


        Product bread = new Product("bread", null, new BigDecimal("2.5"));
        Product tomato = new Product("tomato", null, new BigDecimal("4"));
        Product fish = new Product("fish", null, new BigDecimal("12.45"));
        Product orange = new Product("orange", null, new BigDecimal("1.50"));
        Product meat = new Product("meat", null, new BigDecimal("6.50"));
        Product milk = new Product("milk", null, new BigDecimal("2.59"));
        Product eggs = new Product("eggs", null, new BigDecimal("3.25"));
        Product yogurt = new Product("yogurt", null, new BigDecimal("1.75"));
        Product cheese = new Product("cheese", null, new BigDecimal("3.40"));
        Product tea = new Product("tea", null, new BigDecimal("2.39"));


        Order shoppingCart1 = new Order(olga);
        shoppingCart1.addProduct(bread);
        shoppingCart1.addProduct(milk);
        shoppingCart1.addProduct(tea);
        shoppingCart1.addProduct(tomato);
        shoppingCart1.addProduct(cheese);
        shoppingCart1.addProduct(fish);
        shoppingCart1.addProduct(yogurt);

        shoppingCart1.printShoppingCart();

        Order shoppingCart2 = new Order(maksims);
        shoppingCart2.addProduct(orange);
        shoppingCart2.addProduct(meat);
        shoppingCart2.addProduct(bread);

        shoppingCart2.printShoppingCart();



        List<Order> orders = new ArrayList<>();
        orders.add(new Order(olga));
        orders.add(new Order(maksims));
        orders.add(new Order(irina));


        Order order1 = new Order(olga);
        order1.addProduct(bread);
        order1.addProduct(milk);
        order1.addProduct(tea);
            order1.addProduct(tomato);
            order1.setClientOrders(orders);


            Address deliveryAddress1 = new Address("Jelgava", "Nometnu", 221);

            order1.setDeliveryAddress(deliveryAddress1);
            order1.printOrdersWithDelivery();




            Order order2 = new Order(olga);
            order2.addProduct(cheese);
            order2.addProduct(fish);
            Address deliveryAddress2 = new Address("Jelgava", "Nometnu", 221);

            order2.setDeliveryAddress(deliveryAddress2);
            order2.printOrdersWithDelivery();

            Order order3 = new Order(olga);
            order3.addProduct(yogurt);
            Address deliveryAddress3 = new Address("Jelgava", "Nometnu", 221);

            order3.setDeliveryAddress(deliveryAddress3);
            order3.printOrdersWithDelivery();

            Order order4 = new Order(maksims);
            order4.addProduct(orange);
            order4.addProduct(meat);
            order4.addProduct(bread);
            Address deliveryAddress4 = new Address("Ogre", "Rigas", 3);

            order4.setDeliveryAddress(deliveryAddress4);
            order4.printOrdersWithDelivery();

        System.out.println(order1.getClientOrders());
        System.out.println(order2.getClientOrders());
        System.out.println(order3.getClientOrders());
        System.out.println(order4.getClientOrders());

        order1.printAllClientInformationWithOrders();
        order2.printAllClientInformationWithOrders();
        order3.printAllClientInformationWithOrders();
        order4.printAllClientInformationWithOrders();



    }

}

