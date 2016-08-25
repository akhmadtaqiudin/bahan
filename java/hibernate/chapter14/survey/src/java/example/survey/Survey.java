package example.survey;

import java.util.List;

/**
 *
 * @author Eric Pugh
 *
 * @hibernate.class
 *  table="SURVEYS"
 */

public class Survey {
    private Integer id;
    private String name;
    private List questions;

    /**
     * @hibernate.id generator-class="native" column="SURVEY_ID"
     *
     * @return Returns the id.
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @param id
     *            The id to set.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return Returns the name.
     * @hibernate.property
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     *            The name to set.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @hibernate.list
     *  lazy="true"
     *  inverse="true"
     *  cascade="all"
     * @hibernate.collection-key
     *  column="SURVEY_ID"
     * @hibernate.collection-index
     *  column="IDX"
     * @hibernate.collection-one-to-many
     *  class="example.survey.Question"
     *
     * @return Returns the questions.
     */
    public List getQuestions() {
        return questions;
    }

    /**
     * @param question A question to add to the Survey
     */
    public void addQuestion(Question question) {
        question.setSurvey(this);
        getQuestions().add(question);
    }

    /**
     * @param questions
     *            The questions to set.
     */
    public void setQuestions(List questions) {
        this.questions = questions;
    }
}