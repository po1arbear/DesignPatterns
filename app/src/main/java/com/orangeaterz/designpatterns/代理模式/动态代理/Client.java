package com.orangeaterz.designpatterns.代理模式.动态代理;

import com.orangeaterz.designpatterns.代理模式.静态代理.ILawsuit;
import com.orangeaterz.designpatterns.代理模式.静态代理.Lawyer;
import com.orangeaterz.designpatterns.代理模式.静态代理.Xiaomin;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        //构造一个被代理类，小明
        ILawsuit lawsuit = new Xiaomin();
        //构造一个动态代理
        DynamicPorxy dynamicPorxy = new DynamicPorxy(lawsuit);
        //获取被代理类的classLoader
        ClassLoader loader = lawsuit.getClass().getClassLoader();
        //构造一个代理者律师
        ILawsuit lawyer = (Lawyer) Proxy.newProxyInstance(loader, new Class[]{ILawsuit.class}, dynamicPorxy);

        lawyer.burden();
        lawyer.defend();
        lawyer.submit();
        lawyer.finish();
    }
}
