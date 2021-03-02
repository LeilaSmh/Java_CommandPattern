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
enum states {

    OFF, ON
};

public interface ElectronicDevice {

    public void on();

    public void off();

    public void volumeUp();

    public void volumeDown();
}
