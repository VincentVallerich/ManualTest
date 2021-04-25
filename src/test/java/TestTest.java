import fr.vv.mantest.domain.TestState;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestTest {

    fr.vv.mantest.domain.Test sut;

    @BeforeEach
    void setup() {
        sut = new fr.vv.mantest.domain.Test();
    }

    @Test
    void shouldTestHaveADefaultName() {
        assertEquals("", sut.getName());
    }

    @Test
    void shouldATestHaveCustomName() {
        sut = new fr.vv.mantest.domain.Test("Test n°1");
        assertEquals("Test n°1", sut.getName());
    }

    @Test
    void aTestShouldBeSUCCESSByDefault() {
        assertEquals(TestState.UNPASSED, sut.getState());
    }

    @Test
    void shouldStateBecomeSUCCESSWhenTestSuccess() {
        sut.success();
        assertEquals(TestState.SUCCESS, sut.getState());
    }

    @Test
    void shouldStateBecomeFAILUREWhenTestSuccess() {
        sut.fail();
        assertEquals(TestState.FAILURE, sut.getState());
    }

    @Test
    void shouldNewtestContainsNoSteps() {
        assertTrue(sut.getSteps().isEmpty());
    }
}