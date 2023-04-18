package com.mycompany.project;

import java.util.Scanner;

public class SlotVehicle {
    public void reservevehicle(Slot myslotٍ) { // reserve car to some slot
        myslotٍ.vehicle = new Vehicle();
        System.out.println("Enter the id, modelname, modelyear, width, depth");
        Scanner input = new Scanner(System.in);
        myslotٍ.vehicle.setId_number(input.nextInt());

        input = new Scanner(System.in);
        myslotٍ.vehicle.setModel_name(input.next());

        input = new Scanner(System.in);
        myslotٍ.vehicle.setModel_year(input.nextInt());

        input = new Scanner(System.in);
        myslotٍ.vehicle.setWidth(input.nextInt());

        input = new Scanner(System.in);
        myslotٍ.vehicle.setDepth(input.nextInt());

        myslotٍ.SlotType = false;
    }

}
