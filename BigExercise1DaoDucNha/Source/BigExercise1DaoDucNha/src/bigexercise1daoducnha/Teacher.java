package bigexercise1daoducnha;

/**
 *
 * @author Dao Duc Nha
 * @version 1.0
 * Date 9/7/2016
 * Class Teacher to include information of a Teacher
 */
public class Teacher extends Person {

    public Subject[] listSubject;
    

    public Teacher() {

    }

    public Teacher(Subject[] listSubject, String email, String name, String phoneNumber) {
        super(email, name, phoneNumber);
        this.listSubject = listSubject;
    } 

    

    public Subject[] getListSubject() {
        return listSubject;
    }

    public void setListSubject(Subject[] listSubject) {
        this.listSubject = listSubject;
    }    
}
