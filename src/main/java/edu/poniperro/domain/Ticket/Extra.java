package edu.poniperro.domain.Ticket;

import java.util.Optional;

import edu.poniperro.domain.Comanda.Comanda;

public abstract class Extra {
    protected static final String CHEESE = "0.25";
    protected static final String SAUCE = "0.50";
    protected static final String SIZE_LARGE = "0.50";

    protected String extraProduct;
    protected  Optional<Extra> nextExtra;

    public Extra() {}

    public void setNextExtras(Extra extra) {
        
    } 

    public void sumExtras(Comanda order) {
        
    }


}
