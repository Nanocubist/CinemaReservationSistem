package ro.sci.teamLIV.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ro.sci.teamLIV.dao.UserDAO;
import ro.sci.teamLIV.domain.User;

import java.util.Collection;

public class UserService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);

    public UserDAO getDao() {
        return dao;
    }

    public void setDao(UserDAO dao) {
        this.dao = dao;
    }

    private UserDAO dao;

    public Collection<User> listAll() {
        return dao.getAll();
    }


}
