package example.survey;

/**
 *
 * @author Eric Pugh
 *
 * @hibernate.class
 *  table="ANSWERS"
 */
public class Answer {
    private Integer id;
    private String answer;
    private Question question;
    private SurveyTaker surveyTaker;

    /**
     * @hibernate.id generator-class="native" column="ANSWER_ID"
     *
     * @return Returns the id.
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     *            The id to set.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @hibernate.property column="ANSWER"
     *
     * @return Returns the answer.
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * @param answer
     *            The answer to set.
     */
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    /**
     * @hibernate.many-to-one
     *  column="QUESTION_ID"
     *  not-null="true"
     * @return Returns the question.
     */
    public Question getQuestion() {
        return question;
    }

    /**
     * @param question
     *            The question to set.
     */
    public void setQuestion(Question question) {
        this.question = question;
    }

    /**
     * @hibernate.many-to-one
     *  column="SURVEYTAKER_ID"
     *  not-null="true"
     * @return Returns the surveyTaker.
     */
    public SurveyTaker getSurveyTaker() {
        return surveyTaker;
    }

    /**
     * @param surveyTaker
     *            The surveyTaker to set.
     */
    public void setSurveyTaker(SurveyTaker surveyTaker) {
        this.surveyTaker = surveyTaker;
    }
}