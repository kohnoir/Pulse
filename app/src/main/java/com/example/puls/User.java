package com.example.puls;

public class User {
    String LineName;
    int Old;

    public User(String LineName, int old) {
        this.LineName = LineName;
        Old = old;
    }

    public String getLineName() {
        return LineName;
    }

    public void setLineName(String LineName) {
        this.LineName = LineName;
    }

    public int getOld() {
        return Old;
    }

    public void setOld(int old) {
        Old = old;
    }
}
