package fr.vv.mantest.domain;

public class Runnable {
    private final String name;
    protected State state;

    public Runnable() {
        this("");
    }

    public Runnable(String name) {
        this.name = name;
        this.state = State.UNPASSED;
    }

    public String getName() {
        return name;
    }

    public State getState() {
        return state;
    }
}
