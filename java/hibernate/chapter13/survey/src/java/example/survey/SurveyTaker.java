package example.survey;

import java.util.List;

/**
 *
 * @author Eric Pugh
 *
 * @hibernate.class
 *  table="SURVEYTAKER"
 */

public class SurveyTaker {
    private Integer id;
    private String name;
    private Survey survey;
    private List answers;

    /**
     * @hibernate.id generator-class="native" column="SURVEYTAKER_ID"
     *
     * @return Returns the id.
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id The id to set.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return Returns the answers.
     */
    public List getAnswers() {
        return answers;
    }

    /**
     * @param answers The answers to set.
     */
    public void setAnswers(List answers) {
        this.answers = answers;
    }

    /**
     * @return Returns the name.
     */
    public String getName() {
        return name;
    }

    /**
     * @param name The name to set.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return Returns the survey.
     */
    public Survey getSurvey() {
        return survey;
    }

    /**
     * @param survey The survey to set.
     */
    public void setSurvey(Survey survey) {
        this.survey = survey;
    }


}
