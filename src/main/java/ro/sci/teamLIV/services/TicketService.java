package ro.sci.teamLIV.services;

import ro.sci.teamLIV.dao.TicketDAO;

public class TicketService {
    private TicketDAO daoTicket;


    public void setDao(TicketDAO dao) {
        this.daoTicket = dao;
    }
}
