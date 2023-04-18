
package com.mycompany.project;

public class ControllerParkin {

    boolean customerparkin(Controller Cobj, IParking Pobj) {

        if (Pobj.parkin(Cobj.Robj)) { // checkin if you can parkin in some slot
            return true;
        } else
            return false;
    }
}
