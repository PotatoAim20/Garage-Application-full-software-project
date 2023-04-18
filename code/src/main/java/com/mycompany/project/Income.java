
package com.mycompany.project;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.*;

public class Income {

    int tot;
    Map<String, Integer> TotTime = new HashMap<>();

    public void settime(String time, int totfees) {
        tot += totfees;
        TotTime.put(time, tot);
        System.out.println("Time: " + time);
    }

    public int gettime(String time) {
        int mxtot = 0;
        for (Map.Entry<String, Integer> me : TotTime.entrySet()) {
            if (me.getKey().compareTo(time) <= 0) {
                if (me.getValue() > mxtot) {
                    mxtot = me.getValue();
                }
            }
        }
        return mxtot;
    }
}