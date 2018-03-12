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
