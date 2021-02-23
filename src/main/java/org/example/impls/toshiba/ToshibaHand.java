package org.example.impls.toshiba;

import org.exapmle.interfaces.Hand;

public class ToshibaHand implements Hand {

    @Override
    public void catchSomething() {
        System.out.println("Toshiba catchSomething()");
    }
}
