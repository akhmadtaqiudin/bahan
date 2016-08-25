package example.survey;

import net.sf.hibernate.HibernateException;
import net.sf.hibernate.SessionFactory;
import net.sf.hibernate.cfg.Configuration;

public class HibernateHelper {
    private static SessionFactory sessionFactory;

    private static Configuration configuration;

    public static SessionFactory getSessionFactory() throws HibernateException {
        if (sessionFactory == null) {
            sessionFactory = getConfiguration().buildSessionFactory();
        }
        return sessionFactory;
    }

    public static Configuration getConfiguration() throws HibernateException {
        if (configuration == null) {
            configuration = new Configuration().configure();
        }
        return configuration;
    }
}