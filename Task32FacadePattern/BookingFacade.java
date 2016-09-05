/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task32FacadePattern;

/**
 *
 * @author hv
 */
public class BookingFacade {

    FightBooker[] fightBooker;
    HotelBooker[] hotelBookers;
    TrainBooker[] trainBooker;

    public void search(Object[] obj, Object o) {
        Object[] object = new Object[100];
        for (int i = 0; i < obj.length; i++) {
            if (obj[i] != null && obj[i].equals(o)) {
                System.out.println(obj[i].toString());
            }
        }
    }
}
