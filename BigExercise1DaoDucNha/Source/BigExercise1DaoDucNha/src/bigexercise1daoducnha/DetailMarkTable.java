package bigexercise1daoducnha;

/**
 *
 * @author Dao Duc Nha
 * @version 1.0
 * Date 9/7/2016
 * Class DetailMarkTable to include mark final of a Subject
 */
public class DetailMarkTable {

    public String comment;
    public Student student;
    public Mark mark;
    public Subject subject;

    public DetailMarkTable() {

    }

    public DetailMarkTable(String comment, Student student, Mark mark, Subject subject) {
        this.comment = comment;
        this.student = student;
        this.mark = mark;
        this.subject = subject;
    }

    

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Mark getMark() {
        return mark;
    }

    public void setMark(Mark mark) {
        this.mark = mark;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
    
    

}
