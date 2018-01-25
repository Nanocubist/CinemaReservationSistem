package ro.sci.teamLIV.WEB;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class CinemaController {

    @RequestMapping("")
    public ModelAndView cinema() {
        return new ModelAndView("cinema");
    }

    @RequestMapping("/Home")
    public String Home() {
        return "/";
    }

    @RequestMapping("/seatSelector")
    public String seatSelector() { return "seatSelector";
    }

    @RequestMapping("/ticketTypeSelector")
    public String ticketTypeSelector() { return "ticketTypeSelector";
    }
    @RequestMapping("/login")
    public String login() { return "login";
    }
}
