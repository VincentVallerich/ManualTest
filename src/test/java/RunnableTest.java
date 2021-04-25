import fr.vv.mantest.domain.Runnable;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RunnableTest {

    Runnable sut;

    @BeforeEach
    void setup() {
        sut = new Runnable();
    }

    @Test
    void shouldTestHaveADefaultName() {
        assertEquals("", sut.getName());
    }

    @Test
    void shouldATestHaveCustomName() {
        sut = new Runnable("Test n°1");
        assertEquals("Test n°1", sut.getName());
    }

}
