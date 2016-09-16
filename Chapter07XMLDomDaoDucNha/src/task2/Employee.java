/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

/**
 *
 * @author Dao Duc Nha
 * @version 1.0
 * @since 9-2016
 * Class Employee include information of a Employee
 */
public class Employee {

    String id;
    String name;
    int sex;
    String dateOfBirth;
    String address;
    String idDepartment;
    double salary;

    public Employee() {
    }

    public Employee(String id, String name, int sex, String dateOfBirth, String address, String idDepartment, double salary) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.idDepartment = idDepartment;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIdDepartment() {
        return idDepartment;
    }

    public void setIdDepartment(String idDepartment) {
        this.idDepartment = idDepartment;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ID: " + id + " - Name: " + name + " - Sex: " + sex +
                " - Date Of Birth: " + dateOfBirth + " - Address: " +
                address + " - Salary: " + salary + " - ID Department: " + idDepartment;
    }

}
