package com.orangeaterz.designpatterns.命令模式;

public class LeftCommand implements AbstractCommand {
    private TetrisMachine machine;

    public LeftCommand(TetrisMachine machine) {
        this.machine = machine;
    }

    @Override
    public void excute() {
        machine.toLeft();
    }

}
