package edu.poniperro.domain.Comanda;

import java.util.List;

import edu.poniperro.domain.Product.Item;

public interface Comanda {
    void addItem(String name, double price);
    void addItem(String name, double price, String extra);
    int size();
    List<Item> itemList();
    double getTotal();
    void updateTotal(Double price);
    void display();
    
}
