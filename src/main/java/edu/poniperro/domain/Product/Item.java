package edu.poniperro.domain.Product;

public class Item implements Product {

    protected String name;
    protected Double price;
    protected String extra;

    public Item(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public Item(String name, Double price, String extra) {
        this.name = name;
        this.price = price;
        this.extra = extra;

    }

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public Double price() {
        return this.price;
    }

    @Override
    public String extra() {
        return this.extra;
    }

    @Override
    public Boolean isRegular() {
        return null;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Item) {
            return this.name.equals(((Item)obj).name);
        }
        return false;
    }
    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

    
    public String toString() {
        return name() + "...." + price() + "$\n";
    }
}
