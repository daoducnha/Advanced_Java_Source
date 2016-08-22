/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1_10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author NHA
 */
public class Human {

    String name;
    String dayOfBirth;
    String address;
    String phoneNumber;

    public Human() {
    }

    public Human(String name, String dayOfBirth, String address, String phoneNumber) {
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        String regex = "([0]?[1-9]|[1-2][0-9]|[3][01])/([0]?[1-9]|[1][0-2])/([0-9]{4})";
        Pattern pattenr = Pattern.compile(regex);
        Matcher matcher = pattenr.matcher(dayOfBirth);
        if (matcher.matches()) {
            this.dayOfBirth = dayOfBirth;
        } else {
            this.dayOfBirth = "0/00/000";
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        String regex = "\\d{10}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(phoneNumber);
        if (m.matches()) {
            this.phoneNumber = phoneNumber;
        } else {
            this.phoneNumber = "0000000000";
        }
    }

    @Override
    public String toString() {
        return "Name: " + name + " - Date of birth: " + dayOfBirth
                + " - Address: " + address + " - Phone number: " + phoneNumber;
    }

}
