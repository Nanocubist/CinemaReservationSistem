package ro.sci.teamLIV.dao.inMemory;

import org.springframework.util.StringUtils;
import ro.sci.teamLIV.dao.UserDAO;
import ro.sci.teamLIV.domain.User;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class IMUserDAO extends IMBaseDAO<User> implements UserDAO{
    public Collection<User> searchByName(String query) {
        if (StringUtils.isEmpty(query)) {
            return getAll();
        }

        Collection<User> all = new LinkedList<User>(getAll());
        for (Iterator<User> it = all.iterator(); it.hasNext();) {
            User emp = it.next();
            String ss = emp.getFirstName() + " " + emp.getLastName();
            if (!ss.toLowerCase().contains(query.toLowerCase())) {
                it.remove();
            }
        }
        return all;
    }





    // searchby name avea nevoie sa-si caute pe web userrii
    //
}
