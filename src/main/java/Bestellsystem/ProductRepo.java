package Bestellsystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepo {
    private HashMap<String, Product> products = new HashMap<>();

    public ProductRepo(List<Product> products) {
        for (Product p : products)
        this.products.putIfAbsent(p.getId(), p);

    }

    public Product get(String id){
       return products.get(id);
    }

    public List<Product> list(){

        return  new ArrayList<>(products.values());
        //ArrayList<Product> productArr = new ArrayList<>(products.size());
       // for (Product p : products.values()
          //   ) {
          //  productArr.add(p);

        }

        //return productArr;


        //return ArrayList<Product> productsReturn = new ArrayList<Product>(products.values());

}
