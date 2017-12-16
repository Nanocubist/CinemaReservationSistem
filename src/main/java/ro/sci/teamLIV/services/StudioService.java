package ro.sci.teamLIV.services;

import ro.sci.teamLIV.dao.StudioDAO;

public class StudioService {
    private StudioDAO daoStudio;


    public void setDao(StudioDAO dao) {
        this.daoStudio = dao;
    }
}
