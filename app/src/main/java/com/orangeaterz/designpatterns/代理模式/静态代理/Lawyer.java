package com.orangeaterz.designpatterns.代理模式.静态代理;

import com.orangeaterz.designpatterns.代理模式.静态代理.ILawsuit;

public class Lawyer implements ILawsuit {
    private ILawsuit lawsuit;

    public Lawyer(ILawsuit lawsuit) {
        this.lawsuit = lawsuit;

    }

    @Override
    public void submit() {
        lawsuit.submit();
    }

    @Override
    public void burden() {
        lawsuit.burden();
    }

    @Override
    public void defend() {
        lawsuit.defend();
    }

    @Override
    public void finish() {
        lawsuit.finish();
    }
}
