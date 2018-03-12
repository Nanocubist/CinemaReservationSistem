package ro.sci.teamLIV.WEB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import ro.sci.teamLIV.domain.Movie;
import ro.sci.teamLIV.domain.MovieGenreType;
import ro.sci.teamLIV.domain.MovieType;
import ro.sci.teamLIV.services.MovieService;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class CinemaReservationSistemApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(CinemaReservationSistemApplication.class, args);

        context.getBean(CinemaController.class).initializeMovies();
    }
}

/* Contributors: Ionut Bogdan, Camarasan Vlad, Laurentiu Miron:
       [Students of Informal School of IT Cluj-Napoca - Java Development. July 2017 - March 2018]

       This is a Cinema Reservation Sistem Application

       You can start the application by running it and then connecting through browser to: "http://localhost:8080/"
       You can access Add / List and Delete features from Admin Console button.
       The application was preloaded with 6 movies in CinemaController -> initializeMovies

       The Application has 95% of entities and services defined but needs lots of updates and improvement!

       Working features: Add, List, Remove [front side is 85% done but needs to be connected to the back functionality]
       Features for future updates: Edit, Reserve ticket, Print ticket and others like:
       [db connection, unit testing, user registration, security, change some static content from website with dynamic]*/
