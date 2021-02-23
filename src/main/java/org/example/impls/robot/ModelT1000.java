package org.example.impls.robot;

import org.exapmle.interfaces.Hand;
import org.exapmle.interfaces.Head;
import org.exapmle.interfaces.Leg;
import org.exapmle.interfaces.Robot;

public class ModelT1000 implements Robot {

    private Head head;
    private Hand hand;
    private Leg leg;

    public ModelT1000() {
    }

    public ModelT1000(Head head, Hand hand, Leg leg) {
        super();
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    @Override
    public void action() {
        head.calc();
        hand.catchSomething();
        leg.go();
    }

    @Override
    public void dance() {
        System.out.println("T1000 dance()");

    }
}
