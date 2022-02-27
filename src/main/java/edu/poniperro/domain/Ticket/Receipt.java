package edu.poniperro.domain.Ticket;

import edu.poniperro.domain.Comanda.Comanda;

public class Receipt implements Ticket {

    private Double total;
    private Comanda order;
    private Extra firstExtra;

    public Receipt(Comanda order) {
        this.order = order;
    }

    @Override
    public Comanda getOrder() {
        return this.order;
    }

    @Override
    public void setChain(Extra extra) {
        this.firstExtra = extra;
        
    }

    @Override
    public Double total() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void sumExtrasCharge() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void print() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Extra getChain() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
