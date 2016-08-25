package example.survey;

/**
 *
 * @author Eric Pugh
 *
 * @hibernate.class
 *  table="QUESTIONS"
 * @hibernate.cache
 *  usage="read-write"
 */
public class Question {
    private Integer id;
    private String question;
    private int index;
    private Survey survey;

    /**
     * @hibernate.id generator-class="native" column="QUESTION_ID"
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
     * @hibernate.many-to-one
     *  outer-join="true"
     *  cascade="save-update"
     *  column="SURVEY_ID"
     *  not-null="true"
     *
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

    /**
     * @hibernate.property column="IDX"
     *
     * @return Returns the index.
     */
    public int getIndex() {
        return index;
    }

    /**
     * @param index The index to set.
     */
    public void setIndex(int index) {
        this.index = index;
    }

    /**
     * @hibernate.property column="QUESTION_AS_STRING"
     * length="256"
     * not-null="true"
     * unique="true"
     * sql-type="CHAR(255)"
     *
     * @return Returns the question.
     */
    public String getQuestion() {
        return question;
    }

    /**
     * @param question The question to set.
     */
    public void setQuestion(String question) {
        this.question = question;
    }
}
