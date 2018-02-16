package ro.sci.teamLIV.WEB;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import ro.sci.teamLIV.domain.Movie;
import ro.sci.teamLIV.domain.MovieGenreType;
import ro.sci.teamLIV.domain.MovieType;
import ro.sci.teamLIV.services.MovieService;

import javax.validation.Valid;
import javax.xml.bind.ValidationException;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Controller
@RequestMapping("/")
public class CinemaController {

    private int index = 0;

    @RequestMapping("")
    public ModelAndView cinema() {
        return new ModelAndView("cinema");
    }

    @RequestMapping("/Home")
    public String Home() {
        return "/";
    }

    @RequestMapping("/seatSelector")
    public String seatSelector() {
        return "seatSelector";
    }

    @RequestMapping("/ticketTypeSelector")
    public String ticketTypeSelector() {
        return "ticketTypeSelector";
    }

    /*
    @RequestMapping("/addMovie")
    public String addMovie() {
        return "addMovie";
    }
    */

    //-------TRY-------ADD-----------FUNCTIONALITY------------------------

    @RequestMapping("/addMovie")
    public ModelAndView addMovie() {
        ModelAndView modelAndView = new ModelAndView("addMovie");
        modelAndView.addObject("movie", new Movie());
        return modelAndView;
    }

    @Autowired
    private MovieService movieService;

    @RequestMapping("moviesList")
    public ModelAndView moviesList() throws ValidationException {
        ModelAndView result = new ModelAndView("moviesList");

        Movie m = new Movie();
        index++;
        m.setMovieName("ionut movie");
        m.setMovieDuration("120");
        m.setMovieDate(new Date(10/10/2010));
        m.setMovieGenreType(MovieGenreType.ACTION);
        m.setMovieType(MovieType.FOUR_D);
//        m.setFirstName("First - name - " + index);
//        m.setLastName("Last - name - " + index);
//        m.setGender(Gender.FEMALE);
//        m.setBirthDate(new Date(30, 1, 1));
//        m.setEmploymentDate(new Date(50, 1, 1));
//        m.setJobTitle("Dev");
        movieService.save(m);

        Collection<Movie> movies = movieService.listAll();
        movies.add(m);
        result.addObject("movies", movies);

        return result;
    }



    //---------------------------------------------------

    @RequestMapping("/adminPage")
    public String adminPage() {
        return "adminPage";
    }

    @RequestMapping("/editMovie")
    public String editMovie() {
        return "editMovie";
    }

//    @RequestMapping("/moviesList")
//    public String moviesList() {
//        return "moviesList";
//    }

    @RequestMapping("/printTicket")
    public String printTicket() {
        return "printTicket";
    }

    @RequestMapping("/ticketConfirmation")
    public String ticketConfirmation() {
        return "ticketConfirmation";
    }

    @RequestMapping("/news")
    public String news() {
        return "news";
    }


    @RequestMapping(method = RequestMethod.POST, value = "/save")
    public ModelAndView save(Movie movie) throws ValidationException {

        movieService.save(movie);

        RedirectView redirectView = new RedirectView("/moviesList");
        ModelAndView result = new ModelAndView();
        result.setView(redirectView);
        return result;
    }

}
