package ro.sci.teamLIV.WEB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import ro.sci.teamLIV.dao.MovieDAO;
import ro.sci.teamLIV.domain.Movie;

import java.util.Collection;

@SpringBootApplication
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class}) //un hack ca sa porneasca, nu stiu ce face
public class CinemaReservationSistemApplication {

	public static void main(String[] args) {



		SpringApplication.run(CinemaReservationSistemApplication.class, args);




	}
}
