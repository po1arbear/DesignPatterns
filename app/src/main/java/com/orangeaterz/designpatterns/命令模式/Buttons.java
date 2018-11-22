package com.orangeaterz.designpatterns.命令模式;

public class Buttons {
    private LeftCommand leftCommand;
    private RightCommand rightCommand;
    private FallCommand fallCommand;
    private TransformCommand transformCommand;

    public void setLeftCommand(LeftCommand command) {
        this.leftCommand = command;
    }

    public void setRightCommand(RightCommand command) {
        this.rightCommand = command;
    }

    public void setFallCommand(FallCommand command) {
        this.fallCommand = command;
    }

    public void setTransformCommand(TransformCommand command) {
        this.transformCommand = command;
    }

    public void toLeft() {
        if (leftCommand != null) {
            leftCommand.excute();
        }
    }

    public void toRight() {
        if (rightCommand != null) {
            rightCommand.excute();
        }
    }

    public void fall() {
        if (fallCommand != null) {
            fallCommand.excute();
        }
    }

    public void transform() {
        if (transformCommand != null) {
            transformCommand.excute();
        }
    }
}
