package ro.sci.teamLIV.services;

import ro.sci.teamLIV.dao.MovieDAO;
import ro.sci.teamLIV.domain.Movie;

import java.util.Collection;

public class MovieService {
    private MovieDAO daoMovie;


    public Collection<Movie> listAll() {
        return daoMovie.getAll();
    }

    public void setDao(MovieDAO dao) {
        this.daoMovie = dao;
    }



}
