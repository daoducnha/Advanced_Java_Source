package bigexercise1daoducnha;

import javax.xml.soap.Detail;

/**
 *
 * @author Dao Duc Nha
 * @version 1.0
 * Date 9/7/2016
 * Class Student to include information of a student
 */
public class Student extends Person {

    String id;
    public String dayOfBirth;
    DetailAttendance[] detailAttendances;
    Mark[] marks;

    public Student() {

    }

    public Student(String id, String dayOfBirth, DetailAttendance[] detailAttendances, Mark[] marks, String email, String name, String phoneNumber) {
        super(email, name, phoneNumber);
        this.dayOfBirth = dayOfBirth;
        this.detailAttendances = detailAttendances;
        this.marks = marks;
        this.id = id;
    }

    public DetailAttendance[] getDetailAttendances() {
        return detailAttendances;
    }

    public void setDetailAttendances(DetailAttendance[] detailAttendances) {
        this.detailAttendances = detailAttendances;
    }

    public Mark[] getMarks() {
        return marks;
    }

    public void setMarks(Mark[] marks) {
        this.marks = marks;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
}
