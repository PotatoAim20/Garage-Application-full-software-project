package com.mycompany.project;

import java.util.Scanner;

public class Slot {
    int SlotID;
    int width;
    int depth;
    String ArrivalTime;
    boolean SlotType;
    Vehicle vehicle;

    public String getArrivalTime() {
        return ArrivalTime;
    }

    public void setSlotType(boolean SlotType) {
        this.SlotType = SlotType;
    }

    public void setArrivalTime(String ArrivalTime) {
        this.ArrivalTime = ArrivalTime;
    }

    public void setSlotID(int SlotID) {
        this.SlotID = SlotID;
        this.SlotType = true;
    }

    public int getSlotID() {
        return SlotID;
    }

    public int getWidth() {
        return width;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean isempty() {
        return this.SlotType;
    }
}
