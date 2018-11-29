package com.orangeaterz.designpatterns.备忘录模式;

public class Caretaker {
    private Memoto mMemoto;

    /**
     * 存档
     *
     * @param memoto
     */
    public void archive(Memoto memoto) {
        this.mMemoto = memoto;
    }

    /**
     * 获取存档
     *
     * @return
     */
    public Memoto getMemoto() {
        if (mMemoto != null) {
            return mMemoto;
        } else {
            return new Memoto();
        }
    }
}
