package com.orangeaterz.designpatterns.命令模式;

public class TransformCommand implements AbstractCommand {
    private TetrisMachine machine;

    public TransformCommand(TetrisMachine machine) {
        this.machine = machine;
    }

    @Override
    public void excute() {
        this.machine.transform();
    }

}
