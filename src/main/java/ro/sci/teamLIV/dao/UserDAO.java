package ro.sci.teamLIV.dao;

import ro.sci.teamLIV.domain.User;

import java.util.Collection;

public interface UserDAO extends BaseDAO<User> {
    Collection<User> searchByName(String query);
}
