package ro.sci.teamLIV.dao.inMemory;

import org.springframework.util.StringUtils;
import ro.sci.teamLIV.dao.MovieDAO;
import ro.sci.teamLIV.domain.Movie;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class IMMovieDAO extends IMBaseDAO<Movie> implements MovieDAO {

    @Override
    public Collection<Movie> searchByMovieName(String query) {
        if (StringUtils.isEmpty(query)) {
            return getAll();
        }

        Collection<Movie> all = new LinkedList<>(getAll());
        for (Iterator<Movie> it = all.iterator(); it.hasNext(); ) {
            Movie emp = it.next();
            String ss = emp.getMovieName();
            if (!ss.toLowerCase().contains(query.toLowerCase())) {
                it.remove();
            }
        }
        return all;
    }

}
