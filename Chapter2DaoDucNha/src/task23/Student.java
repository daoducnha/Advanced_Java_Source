/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task23;

/**
 *
 * @author Dao Duc Nha
 * @version 1.0 
 * Date 9/7/2016 
 * Class Student include information of student
 */
public class Student {

    String name;
    int age;
    String placeOfBirth;

    public Student() {
    }

    public Student(String name, int age, String placeOfBirth) {
        this.name = name;
        this.age = age;
        this.placeOfBirth = placeOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    @Override
    public String toString() {
        return "Name: " + name + " - Age: " + age + " - Place of Birth: " + placeOfBirth;
    }

    

}
