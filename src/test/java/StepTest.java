import fr.vv.mantest.domain.Step;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StepTest {

    @Test
    void shouldStepHaveADefaultName() {
        Step sut = new Step();
        assertEquals("", sut.getName());
    }

    @Test
    void shouldAStepHaveCustomName() {
        Step sut = new Step("Step n°1");
        assertEquals("Step n°1", sut.getName());
    }

}
