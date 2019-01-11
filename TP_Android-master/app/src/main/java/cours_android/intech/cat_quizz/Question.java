package cours_android.intech.cat_quizz;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Question {
    public Question(){
    }
    private String question;
    private int goodAnswer;
    private String[] answers;

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getGoodAnswer() {
        return goodAnswer;
    }

    public void setGoodAnswer(int goodAnswer) {
        this.goodAnswer = goodAnswer;
    }

    public String[] getAnswers() {
        return answers;
    }

    public void setAnswers(String[] answers) {
        this.answers = answers;
    }
}
