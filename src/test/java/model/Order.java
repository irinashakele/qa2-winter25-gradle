package model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private Client client;
    private List<Product> products;
    private Address deliveryAddress;
    private List<Order> clientOrders;


    public Order(Client client) {
        this.client = client;
        this.products = new ArrayList<>();
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getDeliveryAddress() {
        return deliveryAddress.getCity() + ", " + deliveryAddress.getStreet() + " " + deliveryAddress.getHouseNr();
    }

    public void setDeliveryAddress(Address deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }


    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void setClientOrders(List<Order> clientOrders) {
        this.clientOrders = clientOrders;
    }

    public void addProduct(Product product) {
        products.add(product);

    }


    public void printShoppingCart() {
        System.out.println("-----------Shopping Cart----------");
        System.out.println("Client name: " + client.getFullName());

        for (Product p : products) {
            System.out.println(p.getName() + ": " + p.getPrice());
        }
    }

    public void printOrdersWithDelivery() {
        System.out.println("--------Order-----------");
        System.out.println("Client name: " + client.getFullName());

        for (Product p : products) {
            System.out.println(p.getName() + ": " + p.getPrice());
        }
        System.out.println("Delivery address: " + getDeliveryAddress());
    }


    public int getClientOrders() {
        return clientOrders.size();
    }
    public void printAllClientInformationWithOrders() {
        System.out.println("-------Client orders--------");
        client.printClientDetails();
        System.out.println("Order amount: " + clientOrders.size());
    }
}

