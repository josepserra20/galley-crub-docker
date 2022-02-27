package edu.poniperro.domain.Product;

import java.util.HashMap;
import java.util.Map;

public class ItemFactory {
    
    private Map<Item,Item> itemMap = new HashMap<>();
    
    public ItemFactory() {}

    public static Item getItem(String name, double price) {
        return null;
    }

    public static Item getItem(String name, double price, String extra)
    {
        return null;
    }

    public static int size() {
        return 0;
    }

    public static void clear() {

    }
}
