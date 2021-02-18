package com.company;

public class TV {
    private int canal;
    private int volum;
    private boolean aprins;

    public TV(int canal, int volum) {
        this.canal = canal;
        this.volum = volum;
    }

    public int getCanal() {
            return canal;
    }

    public void setCanal(int canal) {
        if (canal>100) {
         canal=1;
        }
        if (canal <1) {
            canal = 100;
        }
        this.canal = canal;
    }

    public int getVolum() {
        return volum;
    }

    public void setVolum(int volum) {
        if (volum>50) {
            volum = 50;
        }
        if (volum<0) {
            volum = 0;
        }
        this.volum = volum;
    }

    public boolean isAprins() {
        return aprins;
    }

    public void setAprins(boolean aprins) {
        this.aprins = aprins;
    }
}
