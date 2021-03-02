/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.command;

import com.receiver.ElectronicDevice;

/**
 *
 * @author Dell
 */
public class TurnVolumeDown implements Command {

    ElectronicDevice device;

    public TurnVolumeDown(ElectronicDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.volumeDown();
    }
}
