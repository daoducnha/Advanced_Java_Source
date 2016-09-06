package bigexercise1daoducnha;

/**
 *
 * @author Dao Duc Nha
 * @version 1.0
 * Date 9/7/2016
 * Class Mark to calculate mark final and mark persional
 */
public class Mark {
    public MarkSpells[] markSpells;
    public MarkExam markExam;
    

    public Mark() {

    }

    public Mark(MarkSpells[] markSpells, MarkExam markExam) {
        this.markSpells = markSpells;
        this.markExam = markExam;
    }

    public MarkSpells[] getMarkSpells() {
        return markSpells;
    }

    public void setMarkSpells(MarkSpells[] markSpells) {
        this.markSpells = markSpells;
    }

    public MarkExam getMarkExam() {
        return markExam;
    }

    public void setMarkExam(MarkExam markExam) {
        this.markExam = markExam;
    }   

    // calculate mark final of a subject
    public double calMarkFinal() {
        return markExam.getMarkMultipleChoice() * 0.4 + markExam.getMarkPractice() * 0.3 + this.calMarkPersional() * 0.3;
    }

    // calculate Persional of a subject
    public double calMarkPersional() {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < markSpells.length; i++) {
            if (markSpells[i] != null) {
                sum += markSpells[i].calMarkSpell();
                count++;
            }
        }
        return sum / count;
    }
}
