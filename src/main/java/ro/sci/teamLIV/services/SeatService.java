package ro.sci.teamLIV.services;

import ro.sci.teamLIV.dao.SeatDAO;

public class SeatService {
    private SeatDAO daoSeat;


    public void setDao(SeatDAO dao) {
        this.daoSeat = dao;
    }
}
