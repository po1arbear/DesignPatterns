package com.orangeaterz.designpatterns.组合模式;

import java.util.Iterator;
import java.util.List;

public class Folder extends Dir {

    public Folder(String name) {
        super(name);
    }

    @Override
    public void addDir(Dir dir) {

    }

    @Override
    public void rmDir(Dir dir) {

    }

    @Override
    public void clear() {

    }

    @Override
    public void print() {
        System.out.print(getName() + "(");
        Iterator<Dir> iter = dirs.iterator();
        while (iter.hasNext()) {
            Dir dir = iter.next();
            dir.print();
            if (iter.hasNext()) {
                System.out.print(",");
            }
        }
        System.out.print(")");
    }

    @Override
    public List<Dir> getFiles() {
        return dirs;
    }
}
