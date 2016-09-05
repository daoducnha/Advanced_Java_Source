/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task32FacadePattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author hv
 */
public class MainBooking {

    public static void main(String[] args) throws IOException {
        BookingFacade booking = new BookingFacade();
        FightBooker[] fightBooker = {new FightBooker("10/10/2010", 10, "Ho Chi Minh"),
            new FightBooker("10/10/2010", 11, "Da Nang"), new FightBooker("11/11/2010", 10, "Nha Trang")};

        HotelBooker[] hotelBookers = {new HotelBooker("10/10/2010", "15/10/2010", "Ho Chi Minh"),
            new HotelBooker("10/10/2010", "15/10/2010", "Da Nang"), new HotelBooker("10/10/2010", "15/10/2010", "Nha Trang")};

        TrainBooker[] trainBooker = {new TrainBooker("10/10/2010", 10, "Ho Chi Minh"), new TrainBooker("10/10/2010", 11, "Da Nang"),
            new TrainBooker("10/10/2010", 10, "Nha Trang")};
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please choise a type booking: Flight(1) - Hotel(2) - Train(3)");
        int choiseType = Integer.parseInt(input.readLine());
        if (choiseType == 1) {
            System.out.println("Input Date Start: ");
            String startDate = input.readLine();
            System.out.println("Input Hours Start: ");
            int startHour = Integer.parseInt(input.readLine());
            System.out.println("Input Location: ");
            String location = input.readLine();
            
            FightBooker fb= new FightBooker(startDate, startHour, location);
            booking.search(fightBooker, fb);            
        }else if(choiseType == 2){
            System.out.println("Input From Date: ");
            String fromDate = input.readLine();
            System.out.println("Input To Date: ");
            String toDate = input.readLine();
            System.out.println("Input Location: ");
            String location = input.readLine();
            
            HotelBooker hb = new HotelBooker(fromDate, toDate, location);
            booking.search(hotelBookers, hb);
        }else if(choiseType ==3){
            System.out.println("Input Date Start: ");
            String startDate = input.readLine();
            System.out.println("Input Hours Start: ");
            int startHour = Integer.parseInt(input.readLine());
            System.out.println("Input Location: ");
            String location = input.readLine();
            
            TrainBooker tb = new TrainBooker(startDate, startHour, location);
            booking.search(trainBooker, tb);
        }
    }
}
