package example.survey;

import junit.framework.TestCase;
import net.sf.hibernate.Session;

public class SurveyTest extends TestCase {

    public void testCreateSurvey() throws Exception{
        Session session = HibernateHelper.getSessionFactory().openSession();
        Survey survey = new Survey();
        survey.setName("Test Survey Caching");
        assertNull(survey.getId());
        session.save(survey);
        assertNotNull(survey.getId());        
        Survey surveyInSessionCache = (Survey)session.get(Survey.class,survey.getId());
        assertEquals("Two objects shouldn't be equal.",survey,surveyInSessionCache);



    }

}
