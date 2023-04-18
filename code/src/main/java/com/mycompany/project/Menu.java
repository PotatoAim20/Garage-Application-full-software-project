
package com.mycompany.project;

import java.util.Scanner;

public class Menu {
      Controller Cobj;

      Menu() {
            Cobj = new Controller();
      }

      public void startApp() // first method that will appear to the user
      {
            Scanner choice = new Scanner(System.in);
            System.out.println("1. Add your slots");
            System.out.println("Enter the capacity of the garage");
            Cobj.setcapacity(choice.nextInt()); // setting the capacity for the garage
            Cobj.setSlotReservation(); // setting the specs for each slot

            System.out.println("2. Set configrations");
            System.out.println("Enter your choice");
            ChossingConfig.setconfig(Cobj, choice.nextInt()); // choosing the configration of garage
      } // sending to the static class"ChossingConfig"
}
