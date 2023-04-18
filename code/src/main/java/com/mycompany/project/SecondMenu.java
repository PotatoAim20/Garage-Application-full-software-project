
package com.mycompany.project;

import java.util.*;
import java.util.Scanner;

public class SecondMenu {
    ControllerParkin pobj;
    ControllerParkout pkobj;
    Income Iobj;

    SecondMenu() {
        pkobj = new ControllerParkout();
        pobj = new ControllerParkin();
        Iobj = new Income();
    }

    public void selectfeautre(Menu firstmenu) {
        Scanner choice = new Scanner(System.in);
        while (true) {
            System.out.println("Select any number of the following");
            System.out.println("1. Calculate total income");
            System.out.println("2. Display available slots");
            System.out.println("3. Park in");
            System.out.println("4. Park out");
            System.out.println("5. Exit");

            int ownerchoice = choice.nextInt();

            if (ownerchoice == 1) {
                System.out.println("Please enter the date in this format");
                System.out.println("yyyy-MM-dd HH:mm");
                Scanner timeinput = new Scanner(System.in);
                String MyTime = timeinput.nextLine();
                System.out.println("Your total income: " + firstmenu.Cobj.getIncomeobj().gettime(MyTime));
                // getting the total income in this particular"Mytime
            } else if (ownerchoice == 2) {
                DisplayList.showSlotReservation(firstmenu.Cobj); // Displaying the available in user's garage
            } else if (ownerchoice == 3) {
                if (!(pobj.customerparkin(firstmenu.Cobj, firstmenu.Cobj.Pobj))) { // Checking if the customer can
                                                                                   // park-in
                    System.out.println("No available slot");
                } else {
                    System.out.println("There is available slot");
                }
            } else if (ownerchoice == 4) {
                System.out.println("Enter your car id");
                choice = new Scanner(System.in);
                int carid = choice.nextInt();
                while (!pkobj.parkout(carid, firstmenu.Cobj)) // checkin if there is car id in the garage or not
                {
                    System.out.println("Wrong car id");
                    System.out.println("Enter your car id again");
                    choice = new Scanner(System.in);
                    carid = choice.nextInt();
                }
            } else if (ownerchoice == 5) // exit from program
            {
                break;
            } else {
                System.out.println("Enter valid number");
            }
        }
    }

}
