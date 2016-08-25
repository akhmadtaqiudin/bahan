package example.survey;

import net.sf.hibernate.Session;
import junit.framework.TestCase;

public class SurveyTest extends TestCase {

    public void testCreateSurvey() throws Exception{
        Session session = HibernateHelper.getSessionFactory().openSession();
        Survey survey = new Survey();
        survey.setName("New Survey");
        assertNull(survey.getId());
        session.save(survey);
        assertNotNull(survey.getId());



    }

}
