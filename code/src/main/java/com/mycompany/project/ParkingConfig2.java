
package com.mycompany.project;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ParkingConfig2 implements IParking {
    @Override
    public boolean parkin(Reservation Robj) {
        Scanner choice = new Scanner(System.in);
        choice = new Scanner(System.in);
        System.out.println("Your car's width, depth");
        int OwnerWidth = choice.nextInt();

        choice = new Scanner(System.in);
        int OwnerDepth = choice.nextInt();

        int idx = -1, BestWidth = 10000, BestDepth = 10000;

        for (int i = 0; i < Robj.capacity; i++) {
            if (Robj.arr[i].isempty() && Robj.arr[i].getDepth() >= OwnerDepth && Robj.arr[i].getWidth() >= OwnerWidth) {
                if (Robj.arr[i].getDepth() < BestDepth && Robj.arr[i].getWidth() < BestWidth) {
                    BestDepth = Robj.arr[i].getDepth();
                    BestWidth = Robj.arr[i].getWidth();
                    idx = i;
                }
            }
        }
        if (idx != -1) {
            Date CurrentDate = new Date();
            SimpleDateFormat timeformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Robj.arr[idx].setArrivalTime(timeformat.format(CurrentDate));
            Robj.addvehicle(idx);
            // Cobj.totvehicle++;
            return true;
        }
        return false;
    }

}
