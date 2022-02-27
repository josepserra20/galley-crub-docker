package edu.poniperro.domain.Comanda;

import java.util.ArrayList;
import java.util.List;

import edu.poniperro.domain.Product.Item;

public class Order implements Comanda {

private Double Total;
private List<Item> items = new ArrayList<Item>();


    public Order() {}

    @Override
    public void addItem(String name, double price) {
        items.add(new Item(name, price));
    }

    @Override
    public void addItem(String name, double price, String extra) {
        items.add(new Item(name, price, extra));
        
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public List<Item> itemList() {
        return this.items;
    }

    @Override
    public double getTotal() {
        double sum = 0d;
        for ( Item order : itemList()){
            sum += order.price();
        }
        return sum;
    }

    @Override
    public void updateTotal(Double price) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void display() {
        this.itemList().forEach(System.out::print);
    }
}
