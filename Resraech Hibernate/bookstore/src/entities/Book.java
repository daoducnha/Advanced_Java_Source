package entities;
// Generated Sep 28, 2016 2:04:10 PM by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Book generated by hbm2java
 */
public class Book implements java.io.Serializable {

    private Integer isbm;

//     @ManyToOne
//     @JoinColumn(name = "categoryid")
    private Category category;

    private String name;
    private Set authors = new HashSet(0);
    //the hien quan he one to one
    private Bookdetail bookdetail;

    
    public Book() {
    }

    public Book(String name) {
        this.name = name;
    }

    public Book(Category category, String name, Set authors, Bookdetail bookdetail) {
        this.category = category;
        this.name = name;
        this.authors = authors;
        this.bookdetail = bookdetail;
    }

    public Integer getIsbm() {
        return this.isbm;
    }

    public void setIsbm(Integer isbm) {
        this.isbm = isbm;
    }

    public Category getCategory() {
        return this.category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set getAuthors() {
        return this.authors;
    }

    public void setAuthors(Set authors) {
        this.authors = authors;
    }

    public Bookdetail getBookdetail() {
        return this.bookdetail;
    }

    public void setBookdetail(Bookdetail bookdetail) {
        this.bookdetail = bookdetail;
    }

    @Override
    public String toString() {
        return "ISBM: " + this.isbm + " - Name: " + this.name;
    }

}
