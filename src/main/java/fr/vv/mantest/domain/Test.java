package fr.vv.mantest.domain;

import java.util.HashSet;
import java.util.Set;

public class Test {
    private final String name;
    private TestState state;
    private final Set<Step> steps;

    public Test() {
        this("");
    }

    public Test(String name) {
        this.name = name;
        this.state = TestState.UNPASSED;
        this.steps = new HashSet<>();
    }

    public String getName() {
        return this.name;
    }

    public TestState getState() {
        return this.state;
    }

    public void success() {
        this.state = TestState.SUCCESS;
    }

    public void fail() {
        this.state = TestState.FAILURE;
    }

    public Set<Step> getSteps() {
        return steps;
    }
}
