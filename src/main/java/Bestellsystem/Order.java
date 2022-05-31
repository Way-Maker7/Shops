package Bestellsystem;

import java.util.ArrayList;
import java.util.UUID;

public class Order {

    private String id;
    private ArrayList<Product> products;

    public Order(ArrayList<Product> products) {
        this.id = UUID.randomUUID().toString();
        this.products = products;
    }

    public String getId(){
        return this.id;

    }
}
