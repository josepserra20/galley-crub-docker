package edu.poniperro.domain.Ticket;

import edu.poniperro.domain.Comanda.Comanda;

public interface Ticket {
    Comanda getOrder();
    void setChain(Extra extra);
    Extra getChain();
    Double total();
    void sumExtrasCharge();
    void print();

}
