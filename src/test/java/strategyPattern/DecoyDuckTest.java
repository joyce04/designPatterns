package strategyPattern;

import org.junit.Test;
import strategyPattern.behaviors.FlyNoWay;
import strategyPattern.behaviors.MuteQuack;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;

public class DecoyDuckTest {
    private Duck decoyDuck;

    @Test
    public void whenDecoyDuckCreated_flyBehaviorWithFlyNoWay_andQuackBehaviorWithQuack() throws Exception {
        decoyDuck = new DecoyDuck();
        assertThat(decoyDuck.flyBehavior, instanceOf(FlyNoWay.class));
        assertThat(decoyDuck.quackBehavior, instanceOf(MuteQuack.class));
    }
}