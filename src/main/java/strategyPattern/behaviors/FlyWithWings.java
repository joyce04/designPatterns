package strategyPattern.behaviors;

import strategyPattern.behaviorInterface.FlyBehavior;

public class FlyWithWings implements FlyBehavior{
    public void fly() {
        System.out.println("I'm flying!!");
    }
}
