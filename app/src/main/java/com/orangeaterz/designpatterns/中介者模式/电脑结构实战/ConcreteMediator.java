package com.orangeaterz.designpatterns.中介者模式.电脑结构实战;

public class ConcreteMediator extends Mediator {
    private CPU cpu;
    private GraphicsCard graphicsCard;
    private SoundCard soundCard;
    private CdDevice cdDevice;

    @Override
    public void changed(Colleague colleague) {
        if (colleague instanceof CdDevice) {
            handleCd();
        } else if (colleague instanceof CPU) {
            handleCpu();

        }
    }

    public void handleCd() {
        cpu.decodeData(cdDevice.read());
    }

    public void handleCpu() {
        soundCard.soundPlay(cpu.getSoundData());
        graphicsCard.videoPlay(cpu.getVideoData());
    }

    public Mediator cpu(CPU cpu) {
        this.cpu = cpu;
        return this;
    }

    public Mediator graphicsCard(GraphicsCard graphicsCard) {
        this.graphicsCard = graphicsCard;
        return this;
    }

    public Mediator soundCard(SoundCard soundCard) {
        this.soundCard = soundCard;
        return this;
    }

    public Mediator cdDevice(CdDevice cdDevice) {
        this.cdDevice = cdDevice;
        return this;
    }

}
