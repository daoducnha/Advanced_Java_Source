package bigexercise1daoducnha;

/**
 *
 * @author Dao Duc Nha
 * @version 1.0
 * Date 9/7/2016
 * Class class 
 */
public class Class {

    public int amountPeriod;
    public String className;
    private String contractNumber;
    public String endDate;
    public Teacher leadTeacher;
    public String startDate;
    public Subject[] subject;
    public Teacher[] teacher;
    public Student[] student;
    public MarkTable markTable;

    public Class() {

    }

    public Class(int amountPeriod, String className, String contractNumber, String endDate, Teacher leadTeacher, String startDate, Subject[] subject, Teacher[] teacher, Student[] student, MarkTable markTable) {
        this.amountPeriod = amountPeriod;
        this.className = className;
        this.contractNumber = contractNumber;
        this.endDate = endDate;
        this.leadTeacher = leadTeacher;
        this.startDate = startDate;
        this.subject = subject;
        this.teacher = teacher;
        this.student = student;
        this.markTable = markTable;
    }

    

    

    public int getAmountPeriod() {
        return amountPeriod;
    }

    public void setAmountPeriod(int amountPeriod) {
        this.amountPeriod = amountPeriod;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Teacher getLeadTeacher() {
        return leadTeacher;
    }

    public void setLeadTeacher(Teacher leadTeacher) {
        this.leadTeacher = leadTeacher;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public Subject[] getSubject() {
        return subject;
    }

    public void setSubject(Subject[] subject) {
        this.subject = subject;
    }

    public Teacher[] getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher[] teacher) {
        this.teacher = teacher;
    }

    public Student[] getStudent() {
        return student;
    }

    public void setStudent(Student[] student) {
        this.student = student;
    }

    public MarkTable getMarkTable() {
        return markTable;
    }

    public void setMarkTable(MarkTable markTable) {
        this.markTable = markTable;
    }

}
