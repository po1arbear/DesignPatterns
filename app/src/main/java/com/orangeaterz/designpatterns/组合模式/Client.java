package com.orangeaterz.designpatterns.组合模式;

public class Client {
    //根目录C盘下有文件ImbamallLog.txt ，文件夹Windows、PerfLogs、Program File
    public static void main(String[] args) {
        Dir diskC = new Folder("C");
        File imba = new File("ImbamallLog.txt");
        diskC.addDir(imba);

        Folder windows = new Folder("Windows");
        windows.addDir(new File("explorer.exe"));
        diskC.addDir(windows);

        Folder perf = new Folder("PerfLogs");
        perf.addDir(new File("null.txt"));
        diskC.addDir(perf);

        Folder program = new Folder("Program File");
        program.addDir(new File("ftp.txt"));
        diskC.addDir(program);

        diskC.print();

    }
}
