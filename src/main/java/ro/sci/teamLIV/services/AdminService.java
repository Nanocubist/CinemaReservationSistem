package ro.sci.teamLIV.services;

import ro.sci.teamLIV.dao.AdminDAO;

public class AdminService {
    private AdminDAO daoAdmin;


    public void setDao(AdminDAO dao) {
        this.daoAdmin = dao;
    }
}
