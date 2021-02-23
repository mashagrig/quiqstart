package org.example.impls.sony;

import org.exapmle.interfaces.Hand;

public class SonyHand implements Hand {

    @Override
    public void catchSomething() {
        System.out.println("Sony catchSomething()");
    }
}
