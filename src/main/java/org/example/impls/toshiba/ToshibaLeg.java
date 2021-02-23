package org.example.impls.toshiba;

import org.exapmle.interfaces.Leg;

public class ToshibaLeg implements Leg {
    @Override
    public void go() {
        System.out.println("Toshiba go()");
    }
}
