package ro.sci.teamLIV.dao;

import ro.sci.teamLIV.domain.Movie;

import java.util.Collection;

public interface MovieDAO extends BaseDAO<Movie> {

    Collection<Movie> searchByMovieName(String query);

}
