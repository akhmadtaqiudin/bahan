// default package

import java.io.Serializable;
import java.util.List;
import java.sql.SQLException;

import net.sf.hibernate.*;
import net.sf.hibernate.type.Type;

/** Automatically generated Finder class for AccountGenfinder.
 * @author Hibernate FinderGenerator  **/
public class AccountGenfinder implements Serializable {

    public static List findByZipcode(Session session, int zipcode) throws SQLException, HibernateException {
        List finds = session.find("from Account as account where account.zipcode=?", new Integer( zipcode ), Hibernate.INTEGER);
        return finds;
    }

    public static List findAll(Session session) throws SQLException, HibernateException {
        List finds = session.find("from Account in class null.Account");
        return finds;
    }

}
