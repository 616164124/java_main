package com.dp.state.thread;

public class NewState extends ThreadState_ {
    private final Thread_ t;

    public NewState(Thread_ t) {
        this.t = t;
    }

    @Override
    void move(Action input) {
        if (input.msg == "start")
            t.state = new RunningState(t);
    }

    @Override
    void run() {

    }
}
