package strategyPattern;

import strategyPattern.behaviors.FlyNoWay;
import strategyPattern.behaviors.MuteQuack;

public class DecoyDuck extends Duck {
    DecoyDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }

    public void display() {
        System.out.println("I'm a duck decoy.");
    }
}
