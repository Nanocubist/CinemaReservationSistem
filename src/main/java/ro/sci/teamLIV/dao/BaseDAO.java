package ro.sci.teamLIV.dao;

import ro.sci.teamLIV.domain.AbstractModel;

import java.util.Collection;


public interface BaseDAO<T extends AbstractModel> {

	Collection<T> getAll();

	T findByMovieName(String movieID);

	T update(T model);

	boolean delete(T model);
}
