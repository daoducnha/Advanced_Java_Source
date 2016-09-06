package bigexercise1daoducnha;

/**
 *
 * @author Dao Duc Nha
 * @version 1.0
 * Date 9/7/2016
 * Class Subject to include information of a subject
 */
public class Subject {

    public String subjectName;   
    public int numOfLession;
    public String startDate;
    public String endDate;
    

    public Subject() {

    }

    public Subject(String subjectName, int numOfLession, String startDate, String endDate) {
        this.subjectName = subjectName;
        this.numOfLession = numOfLession;
        this.startDate = startDate;
        this.endDate = endDate;
        
    }

        
  
    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getNumOfLession() {
        return numOfLession;
    }

    public void setNumOfLession(int numOfLession) {
        this.numOfLession = numOfLession;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
    
}
