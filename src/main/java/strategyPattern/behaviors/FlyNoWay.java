package strategyPattern.behaviors;

import strategyPattern.behaviorInterface.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("Can't fly");
    }
}
