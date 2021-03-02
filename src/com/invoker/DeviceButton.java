/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.invoker;

import com.command.Command;

/**
 *
 * @author Dell
 */
public class DeviceButton {

    Command cmd;

    public DeviceButton(Command cmd) {
        this.cmd = cmd;
    }
    
    public void press(){
        cmd.execute();
    }
}
