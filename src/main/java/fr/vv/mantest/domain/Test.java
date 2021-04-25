package fr.vv.mantest.domain;

import java.util.HashSet;
import java.util.Set;

public class Test extends Runnable{
    private final Set<Step> steps;

    public Test() {
        super();
        this.steps = new HashSet<>();
    }

    public Test(String name) {
        super(name);
        this.steps = new HashSet<>();
    }

    public void success() {
        this.state = State.SUCCESS;
    }

    public void fail() {
        this.state = State.FAILURE;
    }

    public Set<Step> getSteps() {
        return steps;
    }
}
