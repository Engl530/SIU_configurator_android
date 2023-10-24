package com.example.siuandroidconfigurator;

import java.io.Serializable;

public class ModbusSettings implements Serializable {
    private int own_id;
    private int speed;
    private int parity;
    private int stopbits;

    public ModbusSettings(int ownId, int speed, int parity, int stopbits) {
        this.own_id = ownId;
        this.speed = speed;
        this.parity = parity;
        this.stopbits = stopbits;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getOwn_id() {
        return own_id;
    }
    public void setOwn_id(int own_id) {
        this.own_id = own_id;
    }
    public int getParity() {
        return parity;
    }
    public void setParity(int parity) {
        this.parity = parity;
    }
    public int getStopbits() {
        return stopbits;
    }
    public void setStopbits(int stopbits) {
        this.stopbits = stopbits;
    }
}
