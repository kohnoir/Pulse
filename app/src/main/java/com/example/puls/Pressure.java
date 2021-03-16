package com.example.puls;

public class Pressure {
    String editPulse;
    String highPress;
    String lowPress;
    String tah;

    public String getEditPulse() {
        return editPulse;
    }

    public void setEditPulse(String editPulse) {
        this.editPulse = editPulse;
    }

    public String gethighPress() {
        return highPress;
    }

    public void setHighPress(String highPress) {
        this.highPress = highPress;
    }

    public String getLowPress() {
        return lowPress;
    }

    public void setLowPress(String lowPress) {
        this.lowPress = lowPress;
    }

    public String getTah() {
        return tah;
    }

    public void setTah(String tah) {
        this.tah = tah;
    }

    public Pressure(String editPulse, String highPress, String lowPress, String tah) {
        this.editPulse = editPulse;
        this.highPress = highPress;
        this.lowPress = lowPress;
        this.tah = tah;
    }
}
