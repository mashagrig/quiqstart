package org.example.impls.sony;

import org.exapmle.interfaces.Leg;

public class SonyLeg implements Leg {
    @Override
    public void go() {
        System.out.println("Sony go()");
    }
}
