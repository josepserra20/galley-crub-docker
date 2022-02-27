package edu.poniperro.domain.Product;

import java.util.HashMap;
import java.util.Map;

public class Prices {
    

     private static Map<String,Double> ExtrasPrices = new HashMap<String,Double>();

     public static void init_prices() {
        ExtrasPrices.put("large", 0.5);
        ExtrasPrices.put("sauce", 0.5);
        ExtrasPrices.put("medium", 0.25);
        ExtrasPrices.put("cheese", 0.25);

    }
    
    public static void display() {
        ExtrasPrices.forEach((key, value) -> System.out.println("\t" + key + " = "+value));

    }
    
}
