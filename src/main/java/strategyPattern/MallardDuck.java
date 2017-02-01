package strategyPattern;

import strategyPattern.behaviors.FlyWithWings;
import strategyPattern.behaviors.Quack;

public class MallardDuck extends Duck{
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    void display() {
        System.out.println("I'm a real Mallard duck.");
    }
}
