package ro.sci.teamLIV.WEB;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/Movies")
public class MoviesController {

    @RequestMapping("")
    public ModelAndView movie() {
        return new ModelAndView("movies");
    }

    @RequestMapping("/Movies")
    public String Movies() {
        return "/";
    }
}
