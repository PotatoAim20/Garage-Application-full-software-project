package com.mycompany.project;

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.time.*;

public class ControllerParkout { // Class to parkout the customer's car
    public boolean parkout(int CarID, Controller Cobj) {
        Scanner choice = new Scanner(System.in);
        int idx = -1;
        for (int i = 0; i < Cobj.Robj.capacity; i++) {
            if (Cobj.Robj.arr[i].vehicle.getId_number() == CarID) {
                idx = i;
                break;
            }
        }
        if (idx != -1) {
            Date CurrentDate = new Date();
            SimpleDateFormat timeformat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

            try {

                Date d1 = timeformat.parse(Cobj.Robj.arr[idx].getArrivalTime());

                // Calucalte time difference
                // in milliseconds
                long difference_In_Time = CurrentDate.getTime() - d1.getTime();

                long difference_In_Seconds = TimeUnit.MILLISECONDS
                        .toSeconds(difference_In_Time)
                        % 60;

                long difference_In_Minutes = TimeUnit.MILLISECONDS
                        .toMinutes(difference_In_Time)
                        % 60;

                long difference_In_Hours = TimeUnit.MILLISECONDS
                        .toHours(difference_In_Time)
                        % 24;

                long difference_In_Days = TimeUnit.MILLISECONDS
                        .toDays(difference_In_Time)
                        % 365;

                // Print the date difference in
                // in days, in hours, in
                // minutes, and in seconds
                System.out.print(
                        "Difference"
                                + " between two dates is: ");

                // Print result
                System.out.println(
                        difference_In_Days
                                + " days, "
                                + difference_In_Hours
                                + " hours, "
                                + difference_In_Minutes
                                + " minutes, "
                                + difference_In_Seconds
                                + " seconds");
                int tot = 0;
                tot += (difference_In_Hours * 5) + (difference_In_Days * 24 * 5); // will be send
                System.out.println("Total Fees: " + tot);
                System.out.println("Type ok to confirm");
                choice = new Scanner(System.in);
                if (choice.next().equals("ok")) {
                    Cobj.Robj.arr[idx].setSlotType(true);
                } else {
                    System.out.println("Operation has been canceled");
                }
                timeformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Cobj.incomeobj.settime(timeformat.format(CurrentDate), tot);
            } catch (ParseException e) {
                e.printStackTrace();
            }

        }
        if (idx != -1) {

            return true;
        } else
            return false;
    }
}
