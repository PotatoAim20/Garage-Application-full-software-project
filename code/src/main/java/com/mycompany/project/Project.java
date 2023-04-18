package com.mycompany.project;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.*;

public class Project {
    public static void main(String[] args) {
        // Parking pobj;
        Menu fmenu = new Menu();
        fmenu.startApp();

        SecondMenu smenu = new SecondMenu();
        smenu.selectfeautre(fmenu);
    }
}
