package com.example.puls;

public class User {
    String FIO;
    int Old;

    public User(String FIO, int old) {
        this.FIO = FIO;
        Old = old;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public int getOld() {
        return Old;
    }

    public void setOld(int old) {
        Old = old;
    }
}
