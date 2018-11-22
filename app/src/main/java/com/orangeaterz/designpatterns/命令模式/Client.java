package com.orangeaterz.designpatterns.命令模式;

public class Client {
    public static void main(String[] args) {
        TetrisMachine machine = new TetrisMachine();
        Buttons buttons = new Buttons();
        buttons.setLeftCommand(new LeftCommand(machine));
        buttons.setRightCommand(new RightCommand(machine));
        buttons.setFallCommand(new FallCommand(machine));
        buttons.setTransformCommand(new TransformCommand(machine));

        buttons.toLeft();
        buttons.toRight();
        buttons.fall();
        buttons.transform();

    }
}
