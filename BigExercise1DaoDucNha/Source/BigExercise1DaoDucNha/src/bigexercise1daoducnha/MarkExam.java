package bigexercise1daoducnha;

/**
 *
 * @author Dao Duc Nha
 * @version 1.0
 * Date 9/7/2016
 * Class MarkExam to include mark multiple-choice and mark practice
 */
public class MarkExam {

    public double markMultipleChoice;
    public double markPractice;

    public MarkExam() {

    }

    public MarkExam(double markMultipleChoice, double markPractice) {
        this.markMultipleChoice = markMultipleChoice;
        this.markPractice = markPractice;
    }

    public double getMarkMultipleChoice() {
        return markMultipleChoice;
    }

    public void setMarkMultipleChoice(double markMultipleChoice) {
        this.markMultipleChoice = markMultipleChoice;
    }

    public double getMarkPractice() {
        return markPractice;
    }

    public void setMarkPractice(double markPractice) {
        this.markPractice = markPractice;
    }

}
