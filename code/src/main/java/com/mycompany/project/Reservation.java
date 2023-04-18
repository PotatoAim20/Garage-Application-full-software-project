
package com.mycompany.project;

import java.util.Scanner;

public class Reservation {
    int capacity;
    Slot arr[];
    Vehicle varr[];
    SlotVehicle Sobj;

    Reservation(int capacity) { // Creating the slots
        this.capacity = capacity;
        arr = new Slot[capacity];
        Sobj = new SlotVehicle();
        for (int i = 0; i < capacity; i++) {
            arr[i] = new Slot();
        }
    }

    public void addvehicle(int idx) {
        Sobj.reservevehicle(arr[idx]); // add vehicle in the slot
    }

    public void setMySlots() // Entering the slot specs
    {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < capacity; i++) {
            System.out.println("Enter the information for the slot number " + (i + 1));
            System.out.println("Enter the Slot ID");
            arr[i].setSlotID(input.nextInt());

            input = new Scanner(System.in);
            System.out.println("Enter the Slot width");
            arr[i].setWidth(input.nextInt());

            input = new Scanner(System.in);
            System.out.println("Enter the Slot depth");
            arr[i].setDepth(input.nextInt());
        }
    }

    public void getMyslots() // printing method of the available slots in customer's garage
    {
        System.out.println("Your Available Slots: ");
        for (int i = 0; i < capacity; i++) {
            if (arr[i].isempty()) {
                System.out.println("The slot id: " + arr[i].getSlotID());
                System.out.println("Width: " + arr[i].getWidth());
                System.out.println("Depth: " + arr[i].getDepth());
                System.out.println();
            }
        }
    }
}
