package bigexercise1daoducnha;

/**
 *
 * @author Dao Duc Nha
 * @version 1.0
 * Date 9/7/2016
 * Class DetailAttendance to include a Attendance
 */
public class DetailAttendance {

    public String dateOfAttendance;
    public String nameStudent;
    public String statusAttendance;

    public DetailAttendance() {

    }

    public DetailAttendance(String dateOfAttendance, String nameStudent, String statusAttendance) {
        this.dateOfAttendance = dateOfAttendance;
        this.nameStudent = nameStudent;
        this.statusAttendance = statusAttendance;
    }

    public String getDateOfAttendance() {
        return dateOfAttendance;
    }

    public void setDateOfAttendance(String dateOfAttendance) {
        this.dateOfAttendance = dateOfAttendance;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getStatusAttendance() {
        return statusAttendance;
    }

    public void setStatusAttendance(String statusAttendance) {
        this.statusAttendance = statusAttendance;
    }

   

    public double getMark() {
        if (statusAttendance.equalsIgnoreCase("attendance")) {
            return 10;
        } else if (statusAttendance.equalsIgnoreCase("late")) {
            return 5;
        } else if(statusAttendance.equalsIgnoreCase("early")){
            return 5;
        } else if(statusAttendance.equalsIgnoreCase("miss")){
            return 0;
        }
        return 0;
    }

    public void update(String newStatus) {
        statusAttendance = newStatus;
    }

}
