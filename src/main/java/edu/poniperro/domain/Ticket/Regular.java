package edu.poniperro.domain.Ticket;

import edu.poniperro.domain.Comanda.Comanda;
import edu.poniperro.domain.Product.Item;

public class Regular extends Extra {

    public Regular() {};

    public void sumExtras(Comanda order) {
        Receipt receipt;

        CheeseExtra cheese = new CheeseExtra();
        receipt = new Receipt(order);
        receipt.setChain(cheese);
       
    } 
    
}
