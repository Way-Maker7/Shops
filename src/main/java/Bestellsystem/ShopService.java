package Bestellsystem;

import java.util.ArrayList;
import java.util.List;

public class ShopService {
    private ProductRepo productRepo;
    private  OrderRepo orderRepo;


    public ShopService(ProductRepo productRepo, OrderRepo orderRepo){
        this.productRepo = productRepo;
        this.orderRepo = orderRepo;
    }

    public Product getProduct(String id){
        return productRepo.get(id);
    }

    public List<Product> lisProducts(){
        return productRepo.list();
    }

   /* public void addOrder(Order newOrder){
        orderRepo.add(newOrder);
    }*/

   /* public void addOrder(ArrayList<String> productIds){
    ArrayList<Product> productsOfOrder = new ArrayList<>();
        for (String id : productIds
             ) {
            productRepo.get(id);
        }

        Order newOrder = new Order(productsOfOrder);
        orderRepo.add(newOrder);
    }*/

    public void addOrder(ArrayList<String> productIds){
        ArrayList<Product> productsOfOrder = new ArrayList<>();
        for (String id : productIds
        ) {
            if (productRepo.get(id) == null){
                throw new  RuntimeException();
            }
            productsOfOrder.add(productRepo.get(id));
            //productRepo.get(id);
        }

        Order newOrder = new Order(productsOfOrder);
        orderRepo.add(newOrder);
    }

    public Order getOrder(String id){
      return orderRepo.get(id);
    }

    public List<Order> listOrders(){
        return orderRepo.list();
    }





}
