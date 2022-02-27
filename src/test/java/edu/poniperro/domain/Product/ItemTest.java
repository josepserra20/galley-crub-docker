package edu.poniperro.domain.Product;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ItemTest {


    Product item =  null;

   @Before
   public void setup() {
    item = new Item("Krabby Patty", 1.25);
   }
   
    @Test
    public void CheckMapPrices() {

    assertEquals(1.25, item.price(), 0);

    }
}
