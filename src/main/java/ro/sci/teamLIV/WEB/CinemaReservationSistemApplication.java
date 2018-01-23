package ro.sci.teamLIV.WEB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class}) //un hack ca sa porneasca, nu stiu ce face
public class CinemaReservationSistemApplication {

	public static void main(String[] args) {



		SpringApplication.run(CinemaReservationSistemApplication.class, args);




	}
}
