package Bestellsystem;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ShopServiceTest {


    @Test
    void  shouldADDordertoOrderRepo(){

    }


    @Test
    void  shouldRtnSpecificProductsForId(){
        Product product1 = new Product("Tv");
        Product product2 = new Product("dvd");
        Product product3 = new Product("CD");

        ArrayList<Product> inputProducts = new ArrayList<>();
        inputProducts.add(product1);
        inputProducts.add(product2);
        inputProducts.add(product3);




    }



    @Test
    voidshouldReturnAllProducts(){

    }



}