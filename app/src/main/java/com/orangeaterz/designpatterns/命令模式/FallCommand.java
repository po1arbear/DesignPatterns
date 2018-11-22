package com.orangeaterz.designpatterns.命令模式;

public class FallCommand implements AbstractCommand {
    private TetrisMachine machine;

    public FallCommand(TetrisMachine machine) {
        this.machine = machine;
    }

    @Override
    public void excute() {
        this.machine.fall();
    }
}
