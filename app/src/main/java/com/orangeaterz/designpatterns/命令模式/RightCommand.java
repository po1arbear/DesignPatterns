package com.orangeaterz.designpatterns.命令模式;

public class RightCommand implements AbstractCommand {
    TetrisMachine machine;

    public RightCommand(TetrisMachine machine) {
        this.machine = machine;
    }

    @Override
    public void excute() {
        this.machine.toRight();
    }

}
