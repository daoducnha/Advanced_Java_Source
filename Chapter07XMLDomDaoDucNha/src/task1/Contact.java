/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task27;

import java.util.List;

/**
 *
 * @author hv
 */
public class Contact implements Comparable<Contact> {

    String name;
    String phoneNumber;

    public Contact() {
    }

    
    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return name + ": " + phoneNumber;
    }

    @Override
    public int compareTo(Contact o) {
        return this.name.compareTo(o.name);
    }

}
