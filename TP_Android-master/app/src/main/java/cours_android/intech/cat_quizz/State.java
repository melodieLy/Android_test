package cours_android.intech.cat_quizz;

import java.util.List;

public class State {
    private List<Question> questionList;
    private int catAfection;
    private int score;
    private int fishOptain;
    private int goodansersinrow;


    public int getGoodansersinrow() {
        return goodansersinrow;
    }

    public void setGoodansersinrow(int goodansersinrow) {

        this.goodansersinrow = goodansersinrow;
    }

    public int getFishOptain() {
        return fishOptain;
    }

    public void setFishOptain(int fishOptain) {
        this.fishOptain = fishOptain;
    }

    public List<Question> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List<Question> questionList) {
        this.questionList = questionList;
    }

    public int getCatAfection() {
        return catAfection;
    }

    public void setCatAfection(int catAfection) {
        this.catAfection = catAfection;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
