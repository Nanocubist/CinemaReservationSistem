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
    @RequestMapping("/addMovie")
    public String addMovie() { return "addMovie";
    }
    @RequestMapping("/adminPage")
    public String adminPage() { return "adminPage";
    }
    @RequestMapping("/editMovie")
    public String editMovie() { return "editMovie";
    }
    @RequestMapping("/moviesList")
    public String moviesList() { return "moviesList";
    }
    @RequestMapping("/printTicket")
    public String printTicket() { return "printTicket";
    }
    @RequestMapping("/ticketConfirmation")
    public String ticketConfirmation() { return "ticketConfirmation";
    }
    @RequestMapping("/news")
    public String news() { return "news";
    }
}
