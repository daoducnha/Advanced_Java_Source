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
public class HotelBooker{

    public String dateFrom;
    public String dateTo;
    public String location;
    
   

    public HotelBooker() {
    }

    public HotelBooker(String dateFrom, String dateTo, String location) {
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.location = location;
    }

    public String getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
    }

    public String getDateTo() {
        return dateTo;
    }

    public void setDateTo(String dateTo) {
        this.dateTo = dateTo;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.dateFrom);
        hash = 97 * hash + Objects.hashCode(this.dateTo);
        hash = 97 * hash + Objects.hashCode(this.location);
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
        final HotelBooker other = (HotelBooker) obj;
        if (!Objects.equals(this.dateFrom, other.dateFrom)) {
            return false;
        }
        if (!Objects.equals(this.dateTo, other.dateTo)) {
            return false;
        }
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "HotelBooker{" + "dateFrom=" + dateFrom + ", dateTo=" + dateTo + ", location=" + location + '}';
    }
    
    
}
