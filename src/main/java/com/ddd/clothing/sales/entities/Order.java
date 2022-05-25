package com.ddd.clothing.sales.entities;

import co.com.sofka.domain.generic.Entity;

// Imports of the products
import com.ddd.clothing.inventory.entities.Product;
import com.ddd.clothing.inventory.valueObjects.*;

import com.ddd.clothing.sales.valueObjects.OrderId;

import java.util.ArrayList;
import java.util.List;

public class Order extends Entity<OrderId> {
    private  List<Product> orderProducts = new ArrayList<>();

    public Order(OrderId orderID) {
        super(orderID);
    }

    // Methods Of The Entity
    public void addProductToOrder(ProductID productID, InventoryName inventoryName, ProductDescription productDescription, PriceProduct priceProduct, QuantityProducts quantityProducts) {
        Product product = new Product(productID, inventoryName, productDescription, priceProduct, quantityProducts);
        orderProducts.add(product);
    }

    public void removeProductToOrder(ProductID productID) {
        for (Product product : orderProducts) {
            if (product.identity().equals(productID)) {
                orderProducts.remove(product);
            } else {
                throw new IllegalArgumentException("Product not found");
            }
        }
    }

    // Show The Entity Properties
    public List<Product> getOrderProducts() {
        return orderProducts;
    }
}
