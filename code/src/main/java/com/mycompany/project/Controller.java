package com.mycompany.project;

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.time.*;

public class Controller {
    Reservation Robj;
    int totvehicle;
    public IParking Pobj;
    Income incomeobj;

    Controller() {
        incomeobj = new Income();
    }

    public IParking getPobj() {
        return Pobj;
    }

    void setcapacity(int capacity) // setting the capacity of the garage
    {
        Robj = new Reservation(capacity);
    }

    void setSlotReservation() {
        this.Robj.setMySlots();
    }

    public Reservation getObj() {
        return Robj;
    }

    public int getTotvehicle() {
        return totvehicle;
    }

    public Income getIncomeobj() {
        return incomeobj;
    }
}
