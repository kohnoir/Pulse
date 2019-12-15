package com.example.puls;

public class Pressure {
    String editPulse;
    String verhDav;
    String nizDav;
    String tah;

    public String getEditPulse() {
        return editPulse;
    }

    public void setEditPulse(String editPulse) {
        this.editPulse = editPulse;
    }

    public String getVerhDav() {
        return verhDav;
    }

    public void setVerhDav(String verhDav) {
        this.verhDav = verhDav;
    }

    public String getNizDav() {
        return nizDav;
    }

    public void setNizDav(String nizDav) {
        this.nizDav = nizDav;
    }

    public String getTah() {
        return tah;
    }

    public void setTah(String tah) {
        this.tah = tah;
    }

    public Pressure(String editPulse, String verhDav, String nizDav, String tah) {
        this.editPulse = editPulse;
        this.verhDav = verhDav;
        this.nizDav = nizDav;
        this.tah = tah;
    }
}
