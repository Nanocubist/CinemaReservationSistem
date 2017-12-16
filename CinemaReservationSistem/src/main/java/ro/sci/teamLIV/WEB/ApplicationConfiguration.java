package ro.sci.teamLIV.WEB;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ro.sci.teamLIV.dao.UserDAO;
import ro.sci.teamLIV.dao.inMemory.IMUserDAO;
import ro.sci.teamLIV.domain.User;
import ro.sci.teamLIV.services.UserService;

@Configuration
public class ApplicationConfiguration {
    @Bean
    public UserService userService() {
        UserService ems = new UserService();

        ems.setDao(userDAO());
        return ems;
    }

    @Bean
    public UserDAO userDAO() {
        return new IMUserDAO();
    }
}
