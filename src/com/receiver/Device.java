/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.receiver;

/**
 *
 * @author Dell
 */
public class Device implements ElectronicDevice {

    protected String name = "";
    protected states state = states.OFF;
    protected int volume = 0;

    public Device(String name) {
        this.name = name;
    }

    public void on() {
        state = states.ON;
        System.out.println(name + " is " + state);
    }

    public void off() {
        state = states.OFF;
        System.out.println(name + " is " + state);
    }

    public void volumeUp() {
        if (state == states.OFF) {
            System.out.println(name + " is OFF");
        } else {
            System.out.println(name + " volume is at " + ++volume);
        }
    }

    public void volumeDown() {
        if (state == states.OFF) {
            System.out.println(name + " is OFF");
        } else {
            if (volume > 0) {
                --volume;
            }
            System.out.println(name + " volume is at " + volume);

        }
    }
}
