/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task32FacadePattern;

import java.util.Objects;

/**
 *
 * @author hv
 */
public class TrainBooker {

    public String dateStart;
    public int hourStart;
    public String locationTo;

    public TrainBooker(String dateStart, int hourStart, String locationTo) {
        this.dateStart = dateStart;
        this.hourStart = hourStart;
        this.locationTo = locationTo;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public int getHourStart() {
        return hourStart;
    }

    public void setHourStart(int hourStart) {
        this.hourStart = hourStart;
    }

    public String getLocationTo() {
        return locationTo;
    }

    public void setLocationTo(String locationTo) {
        this.locationTo = locationTo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.dateStart);
        hash = 83 * hash + this.hourStart;
        hash = 83 * hash + Objects.hashCode(this.locationTo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TrainBooker other = (TrainBooker) obj;
        if (!Objects.equals(this.dateStart, other.dateStart)) {
            return false;
        }
        if (this.hourStart != other.hourStart) {
            return false;
        }
        if (!Objects.equals(this.locationTo, other.locationTo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TrainBooker{" + "dateStart=" + dateStart + ", hourStart=" + hourStart + ", locationTo=" + locationTo + '}';
    }
    
    
    
    
}
