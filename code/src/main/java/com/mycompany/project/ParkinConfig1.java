package com.mycompany.project;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ParkinConfig1 implements IParking {
    @Override
    public boolean parkin(Reservation Robj) {
        int idx = -1;
        for (int i = 0; i < Robj.capacity; i++) {
            if (Robj.arr[i].isempty()) {
                idx = i;
                break;
            }
        }
        if (idx != -1) {
            Date CurrentDate = new Date();
            SimpleDateFormat timeformat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
            Robj.arr[idx].setArrivalTime(timeformat.format(CurrentDate));
            Robj.addvehicle(idx);
            // Cobj.totvehicle++;
            return true;
        }
        return false;
    }
}
