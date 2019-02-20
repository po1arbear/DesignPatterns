package com.orangeaterz.designpatterns.组合模式;

import java.util.ArrayList;
import java.util.List;

public abstract class Dir {
    /**
     * 存储文件夹下的所有元素的集合
     */
    protected List<Dir> dirs = new ArrayList<>();
    private String name;

    public Dir(String name) {
        this.name = name;
    }

    /**
     * 添加一个文件或文件夹
     *
     * @param dir
     */
    public abstract void addDir(Dir dir);

    /**
     * 移除一个文件或文件夹
     */
    public abstract void rmDir(Dir dir);

    /**
     * 清空所有元素
     */
    public abstract void clear();

    /**
     * 输出文件夹目录结构
     */
    public abstract void print();

    /**
     * 获取文件夹下所有的文件或子文件夹
     */
    public abstract List<Dir> getFiles();

    /**
     * 获取文件或文件名
     */
    public String getName() {
        return name;
    }


}
