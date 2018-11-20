package com.orangeaterz.designpatterns.责任链模式.策略模式实战;

abstract class Leader {
    abstract int getLimit();

    private String level;

    public Leader(String level) {
        this.level = level;
    }

    Leader supervisor;

    void handleRequest(int request) {
        if (request > getLimit()) {
            if (supervisor != null) {
                supervisor.handleRequest(request);
            } else {
                System.out.println("go for boss plz.");
            }
        } else {
            handle(request);
        }
    }

    void handle(int request) {
        System.out.println(level + "has handle this " + request + " worth request");
    }
}
