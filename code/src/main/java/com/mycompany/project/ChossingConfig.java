package com.mycompany.project;

public class ChossingConfig {
   static void setconfig(Controller Cobj,int config) 
    {                   //setting the configration based on customer's choice
        if(config==1)   //using the strategy design pattern 
            Cobj.Pobj = new ParkinConfig1();
        else
            Cobj.Pobj = new ParkingConfig2();   
    }
}
