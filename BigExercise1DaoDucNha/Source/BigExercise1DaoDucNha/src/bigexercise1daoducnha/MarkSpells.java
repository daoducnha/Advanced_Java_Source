package bigexercise1daoducnha;

/**
 *
 * @author Dao Duc Nha
 * @version 1.0
 * Date 9/7/2016
 * Class MarkSpells to include mark active, mark exercise, get mark persional a day
 */
public class MarkSpells {

    public double markActive;
    public double markExercise;
    public DetailAttendance detailAttendance;

    public MarkSpells() {

    }

    public MarkSpells(double markActive, double markExercise, DetailAttendance detailAttendance) {
        this.markActive = markActive;
        this.markExercise = markExercise;
        this.detailAttendance = detailAttendance;
    }
    

    public double getMarkActive() {
        return markActive;
    }

    public void setMarkActive(double markActive) {
        this.markActive = markActive;
    }

    public double getMarkExercise() {
        return markExercise;
    }

    public void setMarkExercise(double markExercise) {
        this.markExercise = markExercise;
    }

    public DetailAttendance getDetailAttendance() {
        return detailAttendance;
    }

    public void setDetailAttendance(DetailAttendance detailAttendance) {
        this.detailAttendance = detailAttendance;
    }

    //calculate mark persional a day of a subject
    public double calMarkSpell() {
        return markActive * 0.1 + detailAttendance.getMark() * 0.3 +
                markExercise * 0.6;
    }
}
