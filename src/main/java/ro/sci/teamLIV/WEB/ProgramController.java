package ro.sci.teamLIV.WEB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ro.sci.teamLIV.domain.Movie;
import ro.sci.teamLIV.services.MovieService;

import javax.xml.bind.ValidationException;
import java.util.Collection;

@Controller
@RequestMapping("/program.html")
public class ProgramController {

    @Autowired
    public MovieService movieService;

    @RequestMapping("")
    public ModelAndView program() {
        ModelAndView result = new ModelAndView("program");

        Collection<Movie> moviesList = movieService.listAll();
        result.addObject("movies", moviesList);

        return result;
    }

}